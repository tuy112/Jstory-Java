package com.jstory.todo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jstory.todo.service.TodoService;
import com.jstory.todo.vo.TodoSearchVO;
import com.jstory.todo.vo.TodoValueVO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/todoList")
public class TodoController {

	@Autowired
    private TodoService todoService;

    // todoList Get
    @GetMapping("")
    @ResponseBody // JSON형식으로 데이터를 반환
    public List<TodoValueVO> todoListPage(Model model, TodoSearchVO searchVO) {
    	
    	log.debug("==== TodoList 조회 ====");
    	// TodoList 조회
        List<TodoValueVO> todoList = todoService.getTodoList();
        Integer totalCnt = todoList.size();
        
        // Model에 데이터 추가
        model.addAttribute("totalCnt", totalCnt);
        model.addAttribute("dataList", todoList);
        log.debug("dataList: {}", todoList);
    	
        return todoList;
    }

//    // todoList Post
//    @PostMapping("/create")
//    public String createTodo(@ModelAttribute TodoValueVO todo) {
//        todoService.createTodo(todo);
//        return "redirect:/todoList";
//    }
//
//    // todoList Put
//    @PutMapping("/update")
//    public String updateTodo(@ModelAttribute TodoValueVO todo) {
//        todoService.updateTodo(todo);
//        return "redirect:/todoList";
//    }
//
//    // todoList Delete
//    @DeleteMapping("/delete")
//    public String deleteTodoById(@RequestParam Integer id) {
//        todoService.deleteTodoById(id);
//        return "redirect:/todoList";
//    }
}