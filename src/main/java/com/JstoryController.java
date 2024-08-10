package com;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vo.JstorySearchVO;

@Controller
@RequestMapping("")
public class JstoryController {

    @GetMapping("")
    public String index(Model model, JstorySearchVO searchVO) {    
        // 템플릿에 전달할 데이터
        model.addAttribute("data", "hello world");
        
        return "./home/index.html";
    }
}