package io.desofme.springbootrabbitmq.publisher.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "rabbit")
public class RabbitMQProperties {

    private String queue;
    private String exchange;
    private String routingKey;

}
