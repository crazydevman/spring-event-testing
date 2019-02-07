package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationEventPublisher;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	private ApplicationEventPublisher publisher;

	@Override
	public void run(String... args) throws Exception {
		OrderCreatedEvent event = new OrderCreatedEvent(true);
		publisher.publishEvent(event);
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}

