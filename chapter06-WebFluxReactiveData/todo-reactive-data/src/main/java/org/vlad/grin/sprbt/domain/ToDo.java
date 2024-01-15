package org.vlad.grin.sprbt.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

@Document
public class ToDo {

    @Id
    private String id;
    private String description;
    private LocalDateTime created;
    private LocalDateTime modified;
    private boolean completed;

    public ToDo() {
        this.id = UUID.randomUUID().toString();
        this.created = LocalDateTime.now();
        this.modified = LocalDateTime.now();
    }

    public ToDo(String description) {
        this();
        this.description = description;
    }

    public ToDo(String description, boolean completed) {
        this();
        this.description = description;
        this.completed = completed;
    }

    @Override
    public String toString() {
        return "ToDo{" +
                "id='" + id + '\'' +
                ", description='" + description + '\'' +
                ", created=" + created +
                ", modified=" + modified +
                ", completed=" + completed +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public LocalDateTime getModified() {
        return modified;
    }

    public void setModified(LocalDateTime modified) {
        this.modified = modified;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ToDo toDo)) return false;
        return completed == toDo.completed && Objects.equals(id, toDo.id) && Objects.equals(description, toDo.description) && Objects.equals(created, toDo.created) && Objects.equals(modified, toDo.modified);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, description, created, modified, completed);
    }
}
