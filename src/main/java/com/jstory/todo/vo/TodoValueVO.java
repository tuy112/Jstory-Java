package com.jstory.todo.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class TodoValueVO {
    private Long id;
    private String contents;
    private String completeYn;
    
    // 등록, 수정
    private LocalDateTime regDate;
    private LocalDateTime modDate;
}