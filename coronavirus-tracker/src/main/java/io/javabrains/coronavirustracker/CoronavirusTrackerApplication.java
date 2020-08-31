package io.javabrains.coronavirustracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableAutoConfiguration
@Configuration
@ComponentScan(basePackages= {"controllers.HomeController", "io.javabrains.coronavirustracker.services"})

public class CoronavirusTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoronavirusTrackerApplication.class, args);
	}

}
