package bw.co.roguesystems.edi.afa;

import org.springframework.context.annotation.Bean;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

public class AfaConfig {
    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        // this package must match the package in the <generatePackage> specified in
        // pom.xml
        marshaller.setContextPath("bw.cp.roguesystems.edi.medscheme");
        return marshaller;
    }

    @Bean
    public ClaimClient countryClient(Jaxb2Marshaller marshaller) {
        ClaimClient client = new ClaimClient();
        client.setDefaultUri("http://172.27.45.11:8080/interpharmswitch/realTimeClaimWS");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }
}
