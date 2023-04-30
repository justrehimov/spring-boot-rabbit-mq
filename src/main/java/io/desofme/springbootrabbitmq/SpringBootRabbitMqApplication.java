package io.desofme.springbootrabbitmq;

import io.desofme.springbootrabbitmq.publisher.properties.RabbitMQProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
@EnableConfigurationProperties(RabbitMQProperties.class)
public class SpringBootRabbitMqApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootRabbitMqApplication.class, args);
    }

}
