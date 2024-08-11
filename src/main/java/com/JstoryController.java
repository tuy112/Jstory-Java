package com;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vo.JstorySearchVO;

@Controller
@RequestMapping("")
public class JstoryController {

	// 대문
    @GetMapping("")
    public String startPage(Model model, JstorySearchVO searchVO) {    
        
        
        return "./index.html";
    }
    
    // 프로필
    @GetMapping("/profile")
    public String profilePage(Model model, JstorySearchVO searchVO) {    
        
        
        return "./pages/profile.html";
    }
    
    // 프로젝트
    @GetMapping("/project")
    public String projectPage(Model model, JstorySearchVO searchVO) {    
        
        
        return "./pages/project.html";
    }
}