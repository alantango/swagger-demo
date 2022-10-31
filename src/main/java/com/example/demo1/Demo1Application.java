package com.example.demo1;

import com.example.demo1.domain.Subscriber;
import com.example.demo1.domain.SubscriberRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class Demo1Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}

	@Bean
//	@Order(value = 2)
	public CommandLineRunner runner1(SubscriberRepository subscriberRepository ){
		return args -> {
			subscriberRepository.save( new Subscriber("john","doe","john.doe@example.com"));
		};
	}

//	@Bean @Order(value = 1)
//	public CommandLineRunner runner2(SubscriberRepository subscriberRepository ){
//		return (args) -> {
//			subscriberRepository.save( new Subscriber("mike","goe","mike.goe@example.com"));
//		};
//	}


}
