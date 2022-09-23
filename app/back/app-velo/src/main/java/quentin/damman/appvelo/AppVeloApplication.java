package quentin.damman.appvelo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = { "quentin.damman.appvelo.model" }) // scan JPA entities
public class AppVeloApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppVeloApplication.class, args);
	}

}
