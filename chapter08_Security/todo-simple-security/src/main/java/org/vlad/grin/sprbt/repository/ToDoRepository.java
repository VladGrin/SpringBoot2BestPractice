package org.vlad.grin.sprbt.repository;

import org.springframework.data.repository.CrudRepository;
import org.vlad.grin.sprbt.domain.ToDo;

public interface ToDoRepository extends CrudRepository<ToDo, String> {

}
