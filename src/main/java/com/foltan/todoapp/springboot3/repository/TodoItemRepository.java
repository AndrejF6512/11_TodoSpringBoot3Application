package com.foltan.todoapp.springboot3.repository;

import com.foltan.todoapp.springboot3.model.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoItemRepository extends JpaRepository<TodoItem, Long> {

}