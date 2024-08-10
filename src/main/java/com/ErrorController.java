package com;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/error")
public class ErrorController {

	@GetMapping("")
	// HTTP 상태 코드, 오류 메시지, 타임스탬프를 모델에 추가
	public String handleError(HttpServletRequest request, Map<String, Object> model) {
        Object status = request.getAttribute("javax.servlet.error.status_code");
        Object errorMessage = request.getAttribute("javax.servlet.error.message");

        if (status != null) {
            model.put("status", status);
        } else {
            model.put("status", "Unknown");
        }

        if (errorMessage != null) {
            model.put("error", errorMessage);
        } else {
            model.put("error", "No message available");
        }

        model.put("timestamp", new java.util.Date());

        return "error";
    }
}