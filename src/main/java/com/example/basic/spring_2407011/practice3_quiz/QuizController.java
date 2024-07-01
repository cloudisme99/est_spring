package com.example.basic.spring_2407011.practice3_quiz;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class QuizController {
	private Quiz quiz;

	private QuizView view;

	public void startQuiz() {
		boolean isCorrect;
		view.displayQuestion(quiz.getQuestion());
		//view.getUserAnswer();
		//System.out.println("controllerR");
		if (view.getUserAnswer().equals(quiz.getAnswer())) {
			isCorrect = true;
		} else {
			isCorrect = false;
		}
		view.displayResult(isCorrect);
	}
}
