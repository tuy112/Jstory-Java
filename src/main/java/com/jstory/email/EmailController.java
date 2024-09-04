package com.jstory.email;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jstory.email.dto.MailDto;

@RestController
@RequestMapping("/mail")
public class EmailController {

	private final EmailService mailService;

    public EmailController(EmailService mailService) {
        this.mailService = mailService;
    }

    @PostMapping
    public ResponseEntity<String> sendMail(@RequestBody MailDto mailDto) {
        
        try {
            mailService.sendMail(mailDto);
            return ResponseEntity.ok("JH에게 성공적으로 이메일을 보냈습니다!");
        } catch (Exception e) {
            return ResponseEntity.status(500).body("이메일 보내기 실패..");
        }
    }
}