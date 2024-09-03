package com.jstory.todo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    // todoList Post
    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/create")
    @ResponseBody
    public ResponseEntity<String> createTodo(@RequestBody TodoValueVO valueVO) {
        log.debug("==== Todo 생성 ====");
        log.debug("New Todo: {}", valueVO);

        // Todo 생성 로직
        todoService.createTodo(valueVO);

        // 생성 완료 후 성공 메시지 반환
        return ResponseEntity.ok("할 일이 정상적으로 추가되었습니다");
    }

    // todoList Delete
    @DeleteMapping("/delete")
    public ResponseEntity<Object> deleteTodo(@RequestParam Long id) {
        log.debug("==== Todo 삭제 (ID: {}) ====", id);

        try {
            todoService.deleteTodo(id);
            return ResponseEntity.noContent().build(); // 성공적으로 삭제
        } catch (Exception e) {
            log.error("Todo 삭제 실패 (ID: {})", id, e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build(); // 오류 발생
        }
    }
}