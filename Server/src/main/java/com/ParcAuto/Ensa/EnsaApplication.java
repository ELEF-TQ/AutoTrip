package com.ParcAuto.Ensa;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;


@SpringBootApplication
@ComponentScan(basePackages = "com.ParcAuto.Ensa.Affectation")
@EnableCaching
@OpenAPIDefinition(info = @Info(title = "My API", version = "1.0", description = "Documentation for my API"))
public class EnsaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnsaApplication.class, args);
	}

}
