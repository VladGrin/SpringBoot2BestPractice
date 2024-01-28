package com.apress.todo.integration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.integration.config.EnableIntegration;
import org.springframework.integration.handler.LoggingHandler;

//@ImportResource("META-INF/spring/integration/todo-context.xml")
@EnableIntegration
@Configuration
public class ToDoIntegration {
/*
    @Bean
    public DirectChannel input(){
        return new DirectChannel();
    }

    @Bean
    public IntegrationFlow simpleFlow(){
        return IntegrationFlows
                .from(input())
                .filter(ToDo.class, ToDo::isCompleted)
                .transform(ToDo.class, toDo -> toDo.getDescription().toUpperCase())
                .handle(System.out::println)
                .get();
    }
*/

    //Using Annotations
/*
    @Bean
    public MessageChannel input(){
        return new DirectChannel();
    }

    @Bean
    public MessageChannel toTransform(){
        return new DirectChannel();
    }

    @Bean
    public MessageChannel toLog(){
        return new DirectChannel();
    }

    @MessageEndpoint
    class SimpleFilter {
        @Filter(inputChannel="input",outputChannel="toTransform")
        public boolean process(ToDo message){
            return message.isCompleted();
        }
    }

    @MessageEndpoint
    class SimpleTransformer{
        @Transformer(inputChannel="toTransform",outputChannel="toLog")
        public String process(ToDo message){
            return message.getDescription().toUpperCase();
        }
    }

    @MessageEndpoint
    class SimpleServiceActivator{
        Logger log = LoggerFactory.getLogger(SimpleServiceActivator.class);
        @ServiceActivator(inputChannel="toLog")
        public void process(String message){
            log.info(message);
        }
    }
*/

/*
    @Bean
    @ServiceActivator(inputChannel = "toLog")
    public LoggingHandler logging() {
        LoggingHandler adapter = new LoggingHandler(LoggingHandler.Level.INFO);
        adapter.setLoggerName("SIMPLE_LOGGER");
        adapter.setLogExpressionString("headers.id + ': ' + payload");
        return adapter;
    }
*/
}
