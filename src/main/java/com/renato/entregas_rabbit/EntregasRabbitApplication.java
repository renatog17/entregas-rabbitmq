package com.renato.entregas_rabbit;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableRabbit
public class EntregasRabbitApplication {

	public static void main(String[] args) {
		SpringApplication.run(EntregasRabbitApplication.class, args);
	}

}
