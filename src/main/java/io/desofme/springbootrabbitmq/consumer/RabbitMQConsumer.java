package io.desofme.springbootrabbitmq.consumer;

import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class RabbitMQConsumer {


    @RabbitListener(queues = "test-queue")
    public void receiveMessageFromFanout1(String message) {
        System.out.println("Received message: " + message);
    }

}
