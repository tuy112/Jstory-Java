package com.jstory.todo.service;

import java.util.List;

import com.jstory.todo.vo.TodoValueVO;

public interface TodoService {
	// 조회	
    List<TodoValueVO> getTodoList();
    
    // 등록
    void createTodo(TodoValueVO valueVO);
    
    // 삭제
    void deleteTodo(Long id);
}