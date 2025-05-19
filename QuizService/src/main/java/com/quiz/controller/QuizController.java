package com.quiz.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.modal.Question;
import com.quiz.modal.Quiz;
import com.quiz.service.QuestionClient;
import com.quiz.service.QuizService;

@RestController
@RequestMapping("/quiz")
public class QuizController {

	@Autowired
	private QuizService quizService;

	@Autowired
	private QuestionClient questionClient;

	@PostMapping
	public Quiz create(@RequestBody Quiz quiz) {
		// quizService.add(quiz);
		return quizService.add(quiz);
	}

	@GetMapping
	public Iterable<Quiz> get() {

		Iterable<Quiz> quizzes = quizService.get();
		for (Quiz quiz : quizzes) {
			quiz.setQuestion(questionClient.getQuestionOfQuiz(quiz.getQuizid()));
		}
		return quizzes;
	}

	@GetMapping("{id}")
	public Optional<Quiz> getone(@PathVariable long id) {
		Optional<Quiz> quizz = quizService.get(id);
		return quizz.map(q -> {
			q.setQuestion(questionClient.getQuestionOfQuiz(q.getQuizid()));
			return q; // Return the modified quiz
		});
	}

}
