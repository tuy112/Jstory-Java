package com.jstory.todo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.jstory.todo.service.TodoService;
import com.jstory.todo.vo.TodoValueVO;

@Service
public class TodoServiceImpl implements TodoService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    // 조회
    @Override
    public List<TodoValueVO> getTodoList() {
        String sql = "SELECT id, contents, completeYn, regDate FROM todo";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(TodoValueVO.class));
    }
    
    // 등록
    @Override
    public void createTodo(TodoValueVO valueVO) {
        jdbcTemplate.update("INSERT INTO todo (contents, completeYn, regDate) VALUES (?, ?, NOW())",
            valueVO.getContents(), valueVO.getCompleteYn());
    }
    
    // 삭제
    @Override
    public void deleteTodo(Long id) {
        String sql = "DELETE FROM todo WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }
}