package com.apress.todo.config;

import com.apress.todo.domain.ToDo;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;

@Configuration
public class ToDoConfig {
/*
    @Bean
    public ApplicationRunner runner(MessageChannel input){
        return args -> {
            input.send(MessageBuilder.withPayload(new ToDo("buy milk today1",true)).build());
            input.send(MessageBuilder.withPayload(new ToDo("buy milk today2",false)).build());
            input.send(MessageBuilder.withPayload(new ToDo("buy milk today3",true)).build());
        };
    }

 */
}
