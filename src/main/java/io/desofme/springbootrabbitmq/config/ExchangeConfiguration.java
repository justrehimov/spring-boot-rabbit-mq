package io.desofme.springbootrabbitmq.config;

import io.desofme.springbootrabbitmq.publisher.properties.RabbitMQProperties;
import lombok.Data;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Exchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
public class ExchangeConfiguration {

    private final RabbitMQProperties properties;

    @Bean
    TopicExchange topicExchange() {
        return new TopicExchange(properties.getExchange());
    }

    @Bean
    Queue queue() {
        return new Queue(properties.getQueue(), false);
    }

    @Bean
    Binding binding(Queue queue, Exchange exchange) {
        return BindingBuilder.bind(queue).to(exchange).with(properties.getRoutingKey()).noargs();
    }

}
