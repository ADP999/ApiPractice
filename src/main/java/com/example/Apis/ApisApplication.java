package com.example.Apis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableAutoConfiguration(exclude = { ErrorMvcAutoConfiguration.class })
//@ComponentScan(basePackages = {"es.unileon.inso2"})
//@EntityScan("es.unileon.inso2.model")
//@EnableJpaRepositories("es.unileon.inso2.repository")
public class ApisApplication {


	public static void main(String[] args) {
		SpringApplication.run(ApisApplication.class, args);
	}

}
