package com.example.basic.day240701.practice1;

public class SmtpEmailSender implements EmailSender {

	@Override
	public void sendEmail(String to, String subject, String body) {
		//SMTP 기술을 이용한
		System.out.println("Sending SMTP email to " + to);
	}
}
