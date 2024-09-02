package com.jstory.todo.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TodoSearchVO {
    
    // table
//    private String searchStartDate;
//    private String searchEndDate;
    private String searchText;
    private Integer pageNo;
    
}