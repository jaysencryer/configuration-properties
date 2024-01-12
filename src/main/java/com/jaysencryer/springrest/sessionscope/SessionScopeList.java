package com.jaysencryer.springrest.sessionscope;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@SessionScope
@Component
public class SessionScopeList {
    List<String> toDos = new ArrayList<>();
    public void addToDo(String item) {
        toDos.add(item);
    }

    public void removeToDo(String item) {
        toDos.remove(item);
    }

    public List<String> getToDos() {
        return toDos;
    }
}
