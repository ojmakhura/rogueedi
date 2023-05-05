package bw.co.roguesystems.edi.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("spring.rabbitmq")
public class RabbitProperties {

    private String host;
    private int port;
    private String username;
    private String password;
    private String emailHandler;
    private String emailDispatchExchange;
    private String emailDispatchQueue;
    private String emailDispatchRoutingKey;
    private String emailQueueExchange;
    private String emailQueue;
    private String emailQueueRoutingKey;


    public RabbitProperties() {
        
    }

    public String getHost() {
        return host;
    }

    public int getPort() {
        return port;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmailDispatchQueue() {
        return emailDispatchQueue;
    }

    public String getEmailDispatchRoutingKey() {
        return emailDispatchRoutingKey;
    }

    public String getEmailQueue() {
        return emailQueue;
    }

    public String getEmailQueueRoutingKey() {
        return emailQueueRoutingKey;
    }

    public String getEmailDispatchExchange() {
        return emailDispatchExchange;
    }

    public String getEmailQueueExchange() {
        return emailQueueExchange;
    }

    public String getEmailHandler() {
        return emailHandler;
    }

    @Override
    public String toString() {
        return "RabbitProperties [host=" + host + ", port=" + port + ", username=" + username + ", password=" + password
                + ", emailHandler=" + emailHandler + ", emailDispatchExchange=" + emailDispatchExchange
                + ", emailDispatchQueue=" + emailDispatchQueue + ", emailDispatchRoutingKey=" + emailDispatchRoutingKey
                + ", emailQueueExchange=" + emailQueueExchange + ", emailQueue=" + emailQueue
                + ", emailQueueRoutingKey=" + emailQueueRoutingKey + "]";
    }
    
}
