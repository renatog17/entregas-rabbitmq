package com.renato.entregas_rabbit.consumers;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.Message;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class ComprasConsumidor {

	@RabbitListener(queues = {"compras"})
	public void receberMensagem(@Payload Message message) {
		System.out.println(message);
	}
}
