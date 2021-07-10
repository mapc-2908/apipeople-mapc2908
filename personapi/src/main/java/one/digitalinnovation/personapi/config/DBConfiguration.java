package one.digitalinnovation.personapi.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author marcelo
 */

@Configuration
@ConfigurationProperties("spring.datasource")
@Getter
@Setter
public class DBConfiguration {
    private String driverClassName;
    private String url;
    private String username;
    private String password;    
    
    @Bean
    public String DataBaseConnection() {
    	System.out.println("Db Connection for Dev - H2");
	    System.out.println(driverClassName);
	    System.out.println(url);
	    return "DB Connection for H2_TEST - Test Instance";
    }    
    
}
