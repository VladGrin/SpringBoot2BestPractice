package org.vlad.grin.sprbt.todo.repository;

import org.vlad.grin.sprbt.todo.domain.ToDo;
import org.springframework.data.repository.CrudRepository;


public interface ToDoRepository extends CrudRepository<ToDo,String> {

}
