package com.firstspringwebapp.todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {
    private static List<Todo> todoList=new ArrayList<>();
    static {
        todoList.add(new Todo(1,"m16","learnSpring", LocalDate.now().plusYears(1),false));
        todoList.add(new Todo(2,"m16","learnBoot", LocalDate.now().plusYears(1),false));
    }
    public List<Todo> findByUsername(String username){
        return todoList;
    }

}
