package com.example.demo;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;

// @Configuration, @EnableAutoConfiguration + @ComponentScan = @SpringBootApplication
@SpringBootApplication(scanBasePackages = {"com.example.demo"}) //(scanBasePackageClasses = {ComponentScanBasePackage.class})
public class DemoApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
