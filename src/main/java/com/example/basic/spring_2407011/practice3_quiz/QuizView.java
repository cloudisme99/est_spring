package com.example.basic.spring_2407011.practice3_quiz;

import java.util.Scanner;

public class QuizView {
	private String answer;
	//private String question;

	public void quiz(Quiz quiz) {
		this.answer = quiz.getAnswer();
		String question = quiz.getQuestion();
	}

	public void displayQuestion(String question) {
		System.out.println(question);
	}

	public String getUserAnswer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("답을 입력해주세요");
		String userAnswer = sc.nextLine();
		sc.close();
		System.out.println("입력한 답: " + userAnswer);
		return userAnswer;
	}

	public void displayResult(boolean isCorrect) {
		if (isCorrect) {
			System.out.println("정답입니다.");
		} else {
			System.out.println("오답입니다.");
		}
	}
}
