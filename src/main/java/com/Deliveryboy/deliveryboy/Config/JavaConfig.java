package com.Deliveryboy.deliveryboy.Config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class JavaConfig {
@Bean

public NewTopic topic() {
    return TopicBuilder
            .name("location-topic")
            .partitions(3)
            .replicas(1)
            .build();
}
}
