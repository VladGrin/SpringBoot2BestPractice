package org.vlad.grin.sprbt;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.reactive.function.client.WebClient;
import org.vlad.grin.sprbt.domain.ToDo;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TodoWebfluxApplicationTests {

	@Test
	public void getByIdTest() {
		WebClient client = WebClient.create("http://localhost:8080");

			// [0|1] объект ToDo
		String id = "490fb75f-62ef-472f-81a1-4771fd4b9fcc";
		Mono<ToDo> result = client
				.get()
				.uri("/todo/{id}", id)
				.accept(MediaType.APPLICATION_JSON)
				.retrieve()
				.bodyToMono(ToDo.class);

		assertNotNull(result);
		System.out.println(result);
	}

	@Test
	public void getAllTest() {
		WebClient client = WebClient.create("http://localhost:8080");

			// [0|N] объектов ToDo
		Flux<ToDo> result = client
				.get()
				.uri("/todo").accept(MediaType.TEXT_EVENT_STREAM)
				.retrieve()
				.bodyToFlux(ToDo.class);

		assertNotNull(result);
		System.out.println(result);
	}
}
