package com.jstory.email;

import org.springframework.stereotype.Service;

import com.jstory.email.dto.MailDto;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EmailService {

	public void sendMail(MailDto mailDto) {
        // 여기에 메일 발송 로직을 구현해야 합니다.
        sendEmail(mailDto.getTo(), mailDto.getSubject(), mailDto.getText());
    }
	
	private void sendEmail(String to, String subject, String text) {
        // 실제 메일 발송 로직을 구현합니다.
        System.out.println("Sending email to: " + to);
        System.out.println("Subject: " + subject);
        System.out.println("Text: " + text);
    }
}