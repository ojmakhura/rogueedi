package bw.co.roguesystems.edi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(SharedAutoConfiguration.class)
public class RogueediWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(RogueediWebApplication.class, args);
    }
}