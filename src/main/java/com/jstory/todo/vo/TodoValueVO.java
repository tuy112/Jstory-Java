package com.jstory.todo.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class TodoValueVO {
    private Integer id;
    private String contents;
    private String completeYn;
    
    // 등록, 수정
    private LocalDateTime regDate;
    private String regId;
    private LocalDateTime modDate;
    private String modId;
}