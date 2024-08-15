package com.jstory.todo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vo.todo.JTodoSearchVO;

@Controller
@RequestMapping("/todo")
public class JTodoController {

	// todoList Get
    @GetMapping("")
    public String startPage(Model model, JTodoSearchVO searchVO) {    
        
        
        return "./Todo/todo-list.html";
    }
    
    // todoList Post
    
    
    // todoList Put
    
    
    // todoList Delete
    
}