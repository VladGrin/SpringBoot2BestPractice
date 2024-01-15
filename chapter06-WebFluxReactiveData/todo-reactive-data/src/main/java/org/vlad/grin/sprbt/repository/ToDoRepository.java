package org.vlad.grin.sprbt.repository;

import org.vlad.grin.sprbt.domain.ToDo;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoRepository extends ReactiveMongoRepository<ToDo, String> {


}
