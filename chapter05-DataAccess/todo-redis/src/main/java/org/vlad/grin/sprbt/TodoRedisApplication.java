package org.vlad.grin.sprbt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoRedisApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoRedisApplication.class, args);
	}
}
//curl -i -X POST -H "Content-Type: application/json" -d "{ \"description\":\"Read the Pro Spring Boot 2nd Edition Book\"}" http://localhost:8080/api/todo
