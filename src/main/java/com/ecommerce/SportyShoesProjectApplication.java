package com.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.ecommerce.controller,com.ecommerce.dao,com.ecommerce.entity,com.ecommerce.service"})
public class SportyShoesProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SportyShoesProjectApplication.class, args);
	}

}
