package org.vlad.grin.sprbt.todo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication(
        scanBasePackages = {"org.vlad.grin.sprbt"},
        exclude = HibernateJpaAutoConfiguration.class)
public class TodoRest2dsApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoRest2dsApplication.class, args);
	}
}
