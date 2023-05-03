package bw.co.roguesystems.edi.medscheme;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class MedschemeConfig {

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        // this package must match the package in the <generatePackage> specified in
        // pom.xml
        marshaller.setContextPath("bw.co.roguesystems.edi.medscheme");
        return marshaller;
    }

    @Bean
    public MedschemeClient medschemeClient(Jaxb2Marshaller marshaller) {
        MedschemeClient client = new MedschemeClient();
        // client.setDefaultUri("http://localhost:8080/ws");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }
}
