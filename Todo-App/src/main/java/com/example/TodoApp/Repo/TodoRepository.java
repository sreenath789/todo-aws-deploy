package com.example.TodoApp.Repo;

import com.example.TodoApp.Model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class TodoRepository {

    @Autowired
    private List<Todo> myTodos;

    public List<Todo> getMyTodos() {
        return myTodos;
    }


    public void add(Todo todo)
    {
        myTodos.add(todo);
    }

    public void delete(Todo todo)
    {
        myTodos.remove(todo);
    }
}
