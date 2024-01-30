package org.vlad.grin.sprbt.sender;

import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.vlad.grin.sprbt.domain.ToDo;

@Configuration
public class ToDoSender {

    @Bean
    public ApplicationRunner send(MessageChannel input) {
        return args -> {
            input
                    .send(MessageBuilder
                            .withPayload(new ToDo("Read a Book"))
                            .build());
        };
    }
}
