package org.vlad.grin.sprbt.actuator;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.boot.actuate.endpoint.annotation.*;
import org.springframework.stereotype.Component;
import org.vlad.grin.sprbt.domain.ToDo;
import org.vlad.grin.sprbt.repository.ToDoRepository;

@Component
@Endpoint(id="todo-stats")
public class ToDoStatsEndpoint {

    private ToDoRepository toDoRepository;

    ToDoStatsEndpoint(ToDoRepository toDoRepository){
        this.toDoRepository = toDoRepository;
    }

    @ReadOperation
    public Stats stats() {
        return new Stats(this.toDoRepository.count(),this.toDoRepository.countByCompleted(true));
    }

    @ReadOperation
    public ToDo getToDo(@Selector String id) {
        return this.toDoRepository.findById(id).orElse(null);
    }

    @WriteOperation
    public Operation completeToDo(@Selector String id) {
        ToDo toDo = this.toDoRepository.findById(id).orElse(null);
        if(null != toDo){
            toDo.setCompleted(true);
            this.toDoRepository.save(toDo);
            return new Operation("COMPLETED",true);
        }

        return new Operation("COMPLETED",false);
    }

    @DeleteOperation
    public Operation removeToDo(@Selector String id) {
        try {
            this.toDoRepository.deleteById(id);
            return new Operation("DELETED",true);
        }catch(Exception ex){
            return new Operation("DELETED",false);
        }
    }

    @AllArgsConstructor
    @Data
    public class Stats {
        private long count;
        private long completed;
    }

    @AllArgsConstructor
    @Data
    public class Operation{
        private String name;
        private boolean successful;
    }
}


