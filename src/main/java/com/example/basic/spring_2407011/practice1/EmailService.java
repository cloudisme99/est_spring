package com.example.basic.spring_2407011.practice1;

public class EmailService {

	private final EmailSender emailSender;

	public EmailService(EmailSender emailSender) {
		this.emailSender = emailSender;
	}

	public void sendEmail(String to, String subject, String body) {
		// AWS SES
		// ...
		emailSender.sendEmail(to, subject, body);
	}

}
