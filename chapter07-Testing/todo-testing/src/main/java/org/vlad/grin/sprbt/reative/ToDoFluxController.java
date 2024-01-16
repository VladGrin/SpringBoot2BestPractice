package org.vlad.grin.sprbt.reative;

import org.vlad.grin.sprbt.domain.ToDo;
import org.vlad.grin.sprbt.repository.ToDoRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class ToDoFluxController {

    private final ToDoRepository repository;

    public ToDoFluxController(ToDoRepository repository){
        this.repository = repository;
    }

    @GetMapping("/todo-flux")
    public Flux<ToDo> getToDos() {
        return  Flux.fromIterable(this.repository.findAll());
    }
}
