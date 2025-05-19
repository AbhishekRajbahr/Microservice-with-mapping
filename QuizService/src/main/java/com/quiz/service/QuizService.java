package com.quiz.service;

import java.util.List;
import java.util.Optional;

import com.quiz.modal.Quiz;

public interface QuizService {

	
	Quiz add(Quiz quiz);
	
	Iterable<Quiz> get();
	
	Optional<Quiz> get(Long id);
	
}
