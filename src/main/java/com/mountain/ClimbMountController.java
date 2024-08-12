package com.mountain;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vo.mountain.ClimbMountSearchVO;

@Controller
@RequestMapping("/mountain")
public class ClimbMountController {

	// ClimbMount Get
    @GetMapping("")
    public String startPage(Model model, ClimbMountSearchVO searchVO) {    
        
        
        return "./Mountain/mountain.html";
    }
    
    // ClimbMount Post
    
    
    // ClimbMount Put
    
    
    // ClimbMount Delete
    
}