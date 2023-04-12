include ./Makefile.dev

gen_self_certs:
ifdef domain
	mkcert -key-file deployment/certs/${domain}.key -cert-file deployment/certs/${domain}.crt ${domain} keycloak.${domain} api.${domain} db.${domain} proxy.${domain} prometheus.${domain} portainer.${domain} unsee.${domain} grafana.${domain} *.${domain}
else
	mkcert -key-file deployment/certs/localhost.key -cert-file deployment/certs/localhost.crt localhost keycloak.localhost api.localhost db.localhost proxy.localhost prometheus.localhost portainer.localhost unsee.localhost grafana.localhost *.localhost
endif
	

build_mda:
	mvn -f mda install -DskipTests=true -o

build_common:
	mvn -f common install -DskipTests=true -o

build_core:
	mvn -f core install -DskipTests=true -o

test_core: 
	. ./.env && mvn -f core test -o

build_api:
	. ./.env && mvn -f webservice install -DskipTests=true -o

test_api: 
	. ./.env && mvn -f webservice test -o

build_comm:
	. ./.env && mvn -f comm -Pnative clean install -DskipTests -o

package_comm:
	. ./.env && mvn -f comm -Pnative clean package -DskipTests -o

build_comm_native:
	. ./.env && mvn -f comm -Pnative native:compile -DskipTests -o

test_comm: 
	. ./.env && mvn -f comm test -o
	
build_cron: gen_env
	. ./.env && mvn -f cron -Pnative clean install -DskipTests -o
	
build_cron_native: gen_env
	. ./.env && mvn -f cron -Pnative native:compile -DskipTests -o
	
build_native: gen_env 
	. ./.env && mvn -f ${module} clean native:compile -Pnative -DskipTests -o

colon = :
native_image_tracing: gen_env
	. ./.env && timeout 40 ${JAVA_HOME}/bin/java -agentlib${colon}native-image-agent=config-output-dir=./${service}/src/main/resources/META-INF/native-image -jar ./bocraportal/${service}/target/bocraportal-${service}-${IMAGE_VERSION}.jar
	
test_cron: gen_env
	. ./.env && mvn -f cron test -o

build_web: 
	mvn -f thymeleaf install -DskipTests=true -o

build_app: 
	mvn install -DskipTests=true -o

clean_build: clean_all build_app

clean_all:
	mvn clean -o

clean_mda:
	mvn -f mda clean -o

clean_cron:
	mvn -f cron clean -o

clean_module:
	mvn -f ${service} clean -o

##
## Start the docker containers
##
up_proxy: gen_env
	. ./.env && docker compose up -d proxy

up_service: gen_env
ifdef service
	. ./.env && docker compose up -d ${service}
else
	@echo 'no service defined. Please run again with `make  service=<name> up_service`'
	exit 1
endif

up_stack: gen_env
ifdef stack
	chmod 755 .env && . ./.env && docker stack deploy -c docker-compose-${stack}.yml ${STACK_NAME}-${stack}
else
	@echo 'no stack defined. Please run again with `make env=<LOCAL, DEV, TEST, LIVE> stack=<name> up_stack`'
	exit 1
endif

down_stack:
ifdef stack
	docker stack rm ${STACK_NAME}-${stack}
else
	@echo 'no stack defined. Please run again with `make env=<LOCAL, DEV, TEST, LIVE> stack=<name> down_stack`'
	exit 1
endif

down_service:
ifdef service
	docker stop ${STACK_NAME}-${service}
else
	@echo 'no env defined. Please run again with `make env=<LOCAL, DEV, TEST, LIVE> service=<name> down_service`'
	exit 1
endif

run_tests: gen_env test_${module}

run_test: gen_env
	. ./.env && mvn -f ${module} -Dtest=${test} -Dspring.profiles.active=test test -o
	
##
## Build docker images
##
build_image: gen_env
	. ./.env && docker compose -f ${stack_file}.yml build

build_api_image: gen_env build_api
	. ./.env && docker compose build api

build_comm_image: gen_env
	. ./.env && docker compose build comm

build_cron_image: gen_env 
	. ./.env && docker compose build cron
	# . ./.env && mvn -f cron spring-boot:build-image -DskipTests -o

build_web_image: gen_env
	. ./.env && docker compose build web

build_keycloak_image: gen_env
	. ./.env && docker compose -f docker-compose-keycloak.yml build


build_images: gen_env build_keycloak_image build_web_image build_api_image build_comm_image

###
## tag and push the images
###
push_web_image: gen_env
	. ./.env && docker push ${REGISTRY_TAG}/${WEB_IMAGE_NAME}:${IMAGE_VERSION}${IMAGE_VERSION_SUFFIX}

push_api_image: gen_env
	. ./.env && docker push ${REGISTRY_TAG}/${API_IMAGE_NAME}:${IMAGE_VERSION}${IMAGE_VERSION_SUFFIX}

push_comm_image: gen_env
	. ./.env && docker push ${REGISTRY_TAG}/${COMM_IMAGE_NAME}:${IMAGE_VERSION}${IMAGE_VERSION_SUFFIX}

push_keycloak_image: gen_env
	. ./.env && echo ${KEYCLOAK_REGISTRY_IMAGE}
	. ./.env && docker push ${KEYCLOAK_REGISTRY_IMAGE}

###
## Run the local api and web
###    
run_module_local: gen_env
	. ./.env && cd ${module} && mvn spring-boot:run
	
run_api_local: gen_env
	. ./.env && cd webservice && mvn spring-boot:run

run_comm_local: gen_env
	. ./.env && cd comm && mvn spring-boot:run

run_cron_local: gen_env
ifdef cron_secret
	. ./.env && export KEYCLOAK_CRON_CLIENT_SECRET=${cron_secret} && cd cron && mvn spring-boot:run
else
	@echo 'No cron_secret defined. Please run again with `make cron_secret=<secret> env=<LOCAL_ENV, DEV_ENV, TEST_ENV, LIVE_ENV> target`'
	exit 1
endif

run_cron_native_local: gen_env
	. ./.env && cron/target/rogueedi-cron

run_web_local: gen_env
	. ./.env && mvn -f thymeleaf spring-boot:run

# run_local_web: build_local_images up_local_app
stop_app:
	docker compose down

rm_env:
	rm -f .env

gen_env:
ifdef env
	if [ -f .env ]; then \
		rm -f .env; \
	fi
	@$(${env}_ENV)
	chmod 755 .env
else
	@echo 'no env defined. Please run again with `make env=<LOCAL_ENV, DEV_ENV, TEST_ENV, LIVE_ENV> target`'
	exit 1
endif

##
## System initialisation
##
swarm_label_true: gen_env
	chmod 755 .env && . ./.env && docker node update --label-add ${STACK_NAME}_${node_label}=true ${node}

swarm_init:
	docker swarm init



local_prep: gen_env
	. ./.env && mkdir ${EDI_DATA} && \
	echo "127.0.0.1	localhost" && \
    	echo "$(ip route get 8.8.8.8 | awk -F"src " 'NR==1{split($2,a," ");print a[1]}') ${LOCAL_DOMAIN} ${DB_DOMAIN} ${REGISTRY_DOMAIN} ${RABBITMQ_HOST} ${KEYCLOAK_DOMAIN} ${API_DOMAIN}" >> ${EDI_DATA}/hosts && \
    	echo "$(ip route get 8.8.8.8 | awk -F"src " 'NR==1{split($2,a," ");print a[1]}') portainer.${LOCAL_DOMAIN} grafana.${LOCAL_DOMAIN} swarmprom.${LOCAL_DOMAIN}" >> ${EDI_DATA}/hosts && \
    	echo "$(ip route get 8.8.8.8 | awk -F"src " 'NR==1{split($2,a," ");print a[1]}') unsee.${LOCAL_DOMAIN} alertmanager.${LOCAL_DOMAIN}" >> ${EDI_DATA}/hosts && \
	mkdir ${EDI_DATA}/db && \
	mkdir ${EDI_DATA}/auth && \
	cp traefik_passwd ${EDI_DATA}/auth/system_passwd && \
	mkdir ${EDI_DATA}/keycloak && \
	mkdir ${EDI_DATA}/certs && \
	cp deployment/certs/* ${EDI_DATA}/certs && \
	mkdir ${EDI_DATA}/registry && \
	mkdir ${EDI_DATA}/traefik && \
	cp deployment/traefik/config.yml ${EDI_DATA}/traefik && \
	mkdir ${EDI_DATA}/web && \

##
## Check the logs
##
keycloak_logs:
	docker compose logs keycloak

api_logs:
	docker compose logs api

comm_logs:
	docker compose logs comm

web_logs:
	docker compose logs web

proxy_logs:
	docker compose logs proxy

pgadmin_logs:
	docker compose logs pgadmin

db_logs:
	docker compose logs db
	
jenkins_logs:
	docker compose logs jenkins
registry_logs:
	docker compose logs registry

traefik_network:
	docker network create --driver overlay rogueedi-public
