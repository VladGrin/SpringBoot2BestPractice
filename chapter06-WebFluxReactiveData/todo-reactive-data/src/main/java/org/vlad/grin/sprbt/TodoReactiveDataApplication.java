package org.vlad.grin.sprbt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoReactiveDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoReactiveDataApplication.class, args);
	}
}
//curl -i -X POST -H "Content-Type: application/json" -d "{\"description\":\"Read a book\"}" http://localhost:8080/todo