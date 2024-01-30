package org.vlad.grin.sprbt.cloud;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.vlad.grin.sprbt.domain.ToDo;

@EnableBinding(Sink.class)
public class ToDoSink {

    private final Logger log = LoggerFactory.getLogger(ToDoSink.class);

    @StreamListener(Sink.INPUT)
    public void process(ToDo message){
        log.info("SINK - Message Received >>> {}",message);
    }
}
