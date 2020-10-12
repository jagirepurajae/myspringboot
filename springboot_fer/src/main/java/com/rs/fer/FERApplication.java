package com.rs.fer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

//@PropertySources({@PropertySource("classpath:${CONFIG_MODE}/application.properties")})
@SpringBootApplication //Configuration, EnableAutoWiring and ComponentScan
//@EnableJpaAuditing
public class FERApplication {

	public static void main(String[] args) {
		SpringApplication.run(FERApplication.class, args);
	}
	
}
