package com.example.basic.spring_2407011.practice1;

public class AwsSesEmailSender implements EmailSender {

	@Override
	public void sendEmail(String to, String subject, String body) {
		// AWS SES기술을 활용한 메세지 전송 로직 구현
		System.out.println("Sending AWS SES email to " + to);
	}
}
