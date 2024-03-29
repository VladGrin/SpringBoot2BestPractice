package org.vlad.grin.sprbt.repository;

import org.vlad.grin.sprbt.domain.ToDo;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Arrays;

public class ToDoRepository {

    private final Flux<ToDo> toDoFlux = Flux.fromIterable(Arrays.asList(
            new ToDo("Do homework"),
            new ToDo("Workout in the mornings", true),
            new ToDo("Make dinner tonight"),
            new ToDo("Clean the studio", true)));


    public Mono<ToDo> findById(String id){
        return Mono.from(toDoFlux.filter( todo -> todo.getId().equals(id)));
    }

    public Flux<ToDo> findAll(){
        return toDoFlux;
    }
}
