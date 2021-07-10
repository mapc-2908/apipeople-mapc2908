package one.digitalinnovation.personapi.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/person")
public class PersonController {
	
	@Value("${app.message}")
	private String appMessage; 
	
	@Value("${ENV_DB_URL:DEV}")
	private String dbEverironmentVariable;

	@GetMapping
	public String getAppMessage() {

		return appMessage;
	}
	
	@GetMapping("/envVariable")
	public String getdbEverironmentVariable() {
		return "a seguinte variavel de ambiente foi passada: "+dbEverironmentVariable;
	}
	
}
