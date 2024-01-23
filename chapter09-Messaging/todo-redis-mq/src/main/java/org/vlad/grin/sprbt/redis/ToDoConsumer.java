package org.vlad.grin.sprbt.redis;

import org.vlad.grin.sprbt.domain.ToDo;
import org.vlad.grin.sprbt.repository.ToDoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class ToDoConsumer {

    private static final Logger log = LoggerFactory.getLogger(ToDoConsumer.class);
    private final ToDoRepository repository;

    public ToDoConsumer(ToDoRepository repository){
        this.repository = repository;
    }

    public void handleMessage(ToDo toDo) {
        log.info("Consumer> " + toDo);
        log.info("ToDo created> " + this.repository.save(toDo));
    }
}
