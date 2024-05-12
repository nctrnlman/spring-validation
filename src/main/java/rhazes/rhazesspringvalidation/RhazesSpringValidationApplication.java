package rhazes.rhazesspringvalidation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import rhazes.rhazesspringvalidation.properties.DatabaseProperties;

@EnableConfigurationProperties({
		DatabaseProperties.class
})
@SpringBootApplication
public class RhazesSpringValidationApplication {

	public static void main(String[] args) {
		SpringApplication.run(RhazesSpringValidationApplication.class, args);
	}

}
