package org.vlad.grin.sprbt.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.UUID;

@Document
@Getter
@Setter
public class ToDo {

    @NotNull
    @Id
    private String id;
    @NotNull
    @NotBlank
    private String description;

    private LocalDateTime created;
    private LocalDateTime modified;
    private boolean completed;

    public ToDo() {
        LocalDateTime date = LocalDateTime.now();
        this.id = UUID.randomUUID().toString();
        this.created = date;
        this.modified = date;
    }

    public ToDo(String description) {
        this();
        this.description = description;
    }
}
