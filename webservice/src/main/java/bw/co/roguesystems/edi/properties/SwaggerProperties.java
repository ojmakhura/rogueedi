package bw.co.roguesystems.edi.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("swagger")
public class SwaggerProperties {
    private String projectTitle;
    private String projectDescription;
    private String projectVersion;

    public SwaggerProperties() {
        
    }

    public String getProjectTitle() {
        return projectTitle;
    }

    public String getProjectDescription() {
        return projectDescription;
    }

    public String getProjectVersion() {
        return projectVersion;
    }

}
