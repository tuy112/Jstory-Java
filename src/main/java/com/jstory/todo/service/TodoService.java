package com.jstory.todo.service;

import java.util.List;

import com.jstory.todo.vo.TodoValueVO;

public interface TodoService {
    List<TodoValueVO> getTodoList();
}