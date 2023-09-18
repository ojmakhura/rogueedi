package bw.co.roguesystems.edi.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties(prefix = "spring.rabbitmq")
@Configuration
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

    public RabbitProperties(String host, int port, String username, String password, String emailDispatchExchange,
            String emailQueueExchange,
            String emailHandler, String emailDispatchQueue, String emailDispatchRoutingKey, String emailQueue,
            String emailQueueRoutingKey) {
        this.host = host;
        this.port = port;
        this.username = username;
        this.password = password;
        this.emailDispatchExchange = emailDispatchExchange;
        this.emailDispatchQueue = emailDispatchQueue;
        this.emailDispatchRoutingKey = emailDispatchRoutingKey;
        this.emailQueue = emailQueue;
        this.emailQueueRoutingKey = emailQueueRoutingKey;
        this.emailQueueExchange = emailQueueExchange;
        this.emailHandler = emailHandler;
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

    

    public void setHost(String host) {
        this.host = host;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmailHandler(String emailHandler) {
        this.emailHandler = emailHandler;
    }

    public void setEmailDispatchExchange(String emailDispatchExchange) {
        this.emailDispatchExchange = emailDispatchExchange;
    }

    public void setEmailDispatchQueue(String emailDispatchQueue) {
        this.emailDispatchQueue = emailDispatchQueue;
    }

    public void setEmailDispatchRoutingKey(String emailDispatchRoutingKey) {
        this.emailDispatchRoutingKey = emailDispatchRoutingKey;
    }

    public void setEmailQueueExchange(String emailQueueExchange) {
        this.emailQueueExchange = emailQueueExchange;
    }

    public void setEmailQueue(String emailQueue) {
        this.emailQueue = emailQueue;
    }

    public void setEmailQueueRoutingKey(String emailQueueRoutingKey) {
        this.emailQueueRoutingKey = emailQueueRoutingKey;
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
