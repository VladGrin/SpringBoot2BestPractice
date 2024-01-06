package org.vlad.grin.sprbt.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jms.activemq.ActiveMQAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(exclude={ActiveMQAutoConfiguration.class, DataSourceAutoConfiguration.class, JacksonAutoConfiguration.class})
public class DemoAppExclude {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DemoAppExclude.class, args);
		System.out.println("Size: " + context.getBeanDefinitionNames().length);//131
		for (String beanDefinitionName : context.getBeanDefinitionNames()) {
            System.out.println(beanDefinitionName);
        }
    }
}
