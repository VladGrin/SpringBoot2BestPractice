package org.vlad.grin.sprbt.config;

import org.vlad.grin.sprbt.domain.ToDo;
import org.vlad.grin.sprbt.rmq.ToDoProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.text.SimpleDateFormat;
import java.util.Date;

@EnableScheduling
@Configuration
public class ToDoSender {


//    @Bean
//    public CommandLineRunner sendToDos(@Value("${todo.amqp.queue}") String destination, ToDoProducer producer){
//        return args -> {
//            producer.sendTo(destination,new ToDo("workout tomorrow morning!"));
//        };
//    }


    @Autowired
    private ToDoProducer producer;
    @Value("${todo.amqp.queue}")
    private String destination;
    private SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 2000L)
    private void sendToDos(){
        producer.sendTo(destination,new ToDo("Thinking on Spring Boot at " + dateFormat.format(new Date())));
    }
}
