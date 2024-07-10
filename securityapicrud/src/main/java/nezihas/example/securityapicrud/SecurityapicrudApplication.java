package nezihas.example.securityapicrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "nezihas.example.securityapicrud")
public class SecurityapicrudApplication {
	public static void main(String[] args) {
		SpringApplication.run(SecurityapicrudApplication.class, args);
	}
}
