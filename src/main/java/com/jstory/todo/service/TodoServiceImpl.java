package com.jstory.todo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.jstory.todo.vo.TodoValueVO;

@Service
public class TodoServiceImpl implements TodoService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<TodoValueVO> getTodoList() {
        String sql = "SELECT id, contents, completeYn, regDate, regId, modDate, modId FROM todo";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(TodoValueVO.class));
    }
}