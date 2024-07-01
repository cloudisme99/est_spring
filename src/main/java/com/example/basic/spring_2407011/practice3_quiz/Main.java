package com.example.basic.spring_2407011.practice3_quiz;

public class Main {
	public static void main(String[] args) {
		Quiz quiz = new Quiz("오르미 백엔드 몇기야?", "5기");
		QuizView quizView = new QuizView();
		QuizController quizController = new QuizController(quiz, quizView);

		quizController.startQuiz();

	}
}
