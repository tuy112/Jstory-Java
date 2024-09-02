package com;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/error")
public class ErrorController {

    @ExceptionHandler(Exception.class)
    public String handleError(HttpServletRequest request, Exception ex, Map<String, Object> model) {
        Object status = request.getAttribute("javax.servlet.error.status_code");
        String errorMessage = ex.getMessage();

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