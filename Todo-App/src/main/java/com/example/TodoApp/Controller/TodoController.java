package com.example.TodoApp.Controller;

import com.example.TodoApp.Model.Todo;
import com.example.TodoApp.Service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class TodoController {

    @Autowired
    TodoService todoService;


    public TodoController() {

    }

    @GetMapping("todos")
    public List<Todo> getAllTodos()
    {
        return todoService.getAllTodos();
    }

    @ResponseBody
    @GetMapping("todo/done")
    public List<Todo> getDoneTodos()
    {
        return todoService.getAllDoneTodos();
    }

    @GetMapping("todos/{todoId}")
    public Todo getTodoById(@PathVariable Integer todoId)
    {
        return todoService.getTodoById(todoId);
    }

    @GetMapping("todo/undone")
    public List<Todo> getNotDoneTodos()
    {
        return todoService.getUndoneTodos();
    }

    @PostMapping("todo")
    public String addTodo(@RequestBody Todo todo)
    {
        return todoService.addTodo(todo);
    }

    @PutMapping("todo/{todoId}/{status}")
    public String markTodo(@PathVariable Integer todoId,@PathVariable boolean status)
    {
        return todoService.updateTodoStatus(todoId,status);
    }

    @DeleteMapping("todo")
    public String removeTodo(@RequestParam Integer todoId)
    {
        return todoService.removeTodo(todoId);

    }
}
