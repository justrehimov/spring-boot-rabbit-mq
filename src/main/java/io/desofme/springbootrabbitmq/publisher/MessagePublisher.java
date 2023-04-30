package io.desofme.springbootrabbitmq.publisher;

import io.desofme.springbootrabbitmq.publisher.properties.RabbitMQProperties;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;

@Slf4j
@Configuration
@RequiredArgsConstructor
public class MessagePublisher {

    private final RabbitTemplate rabbitTemplate;
    private final RabbitMQProperties properties;
    private Integer count = 0;

    @Scheduled(fixedDelay = 1000)
    public void publish() {
        Message message = new Message(count.toString().getBytes());
        rabbitTemplate.send(properties.getExchange(), properties.getRoutingKey(), message);
        System.out.println("sended");
        count++;
    }





}
