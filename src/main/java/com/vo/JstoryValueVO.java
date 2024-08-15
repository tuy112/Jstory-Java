package com.vo;

import java.util.Map;
import lombok.Data;

@Data
public class JstoryValueVO {
    private String name;
    private String period;
    private Map<String, Object> tasks;
}