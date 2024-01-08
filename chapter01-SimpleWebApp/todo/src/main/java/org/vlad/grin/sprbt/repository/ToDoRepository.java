package org.vlad.grin.sprbt.repository;

import org.vlad.grin.sprbt.domain.ToDo;
import org.springframework.data.repository.CrudRepository;

public interface ToDoRepository extends CrudRepository<ToDo,String> {
}
