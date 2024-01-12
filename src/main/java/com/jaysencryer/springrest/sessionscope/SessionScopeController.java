package com.jaysencryer.springrest.sessionscope;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "session/")
@RequiredArgsConstructor
public class SessionScopeController {

    private final SessionScopeList sessionScopeList;


    @GetMapping(value = "todos")
    public List<String> getTodos() {
        return sessionScopeList.getToDos();
    }

    @PostMapping(value = "todo")
    public List<String> addTodo(@RequestBody String todo) {
        sessionScopeList.addToDo(todo);
        return sessionScopeList.getToDos();
    }

    @DeleteMapping(value = "todo")
    public List<String> deleteTodo(@RequestBody String todo) {
        sessionScopeList.removeToDo(todo);
        return sessionScopeList.getToDos();
    }


}
