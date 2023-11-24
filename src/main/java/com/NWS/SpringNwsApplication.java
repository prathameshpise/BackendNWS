package com.NWS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan(basePackages = {"com.NWS.Entity"})
@ComponentScan({"com.NWS.*"})
public class SpringNwsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringNwsApplication.class, args);
	}

}
