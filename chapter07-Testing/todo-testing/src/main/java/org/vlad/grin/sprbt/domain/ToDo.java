package org.vlad.grin.sprbt.domain;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class ToDo {


    private String id = "my-id";
    private String description;
    private boolean completed;

    public ToDo(){
    }

    public ToDo(String description){
        this.description = description;
    }

    public ToDo(String description, boolean completed){
        this.description = description;
        this.completed = completed;
    }
}
