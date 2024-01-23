package org.vlad.grin.sprbt.config;

import org.vlad.grin.sprbt.domain.ToDo;
import org.vlad.grin.sprbt.redis.ToDoProducer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ToDoSender {

    @Bean
    CommandLineRunner sendMessage(ToDoProducer producer,
                                  @Value("${todo.redis.topic}") String topic){

        return args -> producer.sendTo(topic,new ToDo("workout tomorrow morning!"));
    }
}
