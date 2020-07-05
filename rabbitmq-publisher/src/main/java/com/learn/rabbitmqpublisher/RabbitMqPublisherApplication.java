package com.learn.rabbitmqpublisher;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RabbitMqPublisherApplication implements CommandLineRunner {

	@Autowired
	private RabbitTemplate rabbitTemplate;

	public static void main(String[] args) {
		SpringApplication.run(RabbitMqPublisherApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		SampleMessage sampleMessage = new SampleMessage();
		sampleMessage.setTitle("Sample title");
		sampleMessage.setDescription("Sample description");

		rabbitTemplate.convertAndSend("TestExchange", "testRouting", sampleMessage);
	}
}
