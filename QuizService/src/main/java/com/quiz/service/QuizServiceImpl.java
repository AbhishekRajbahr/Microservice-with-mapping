package com.quiz.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.modal.Quiz;
import com.quiz.repository.QuizRepository;

@Service
public class QuizServiceImpl implements QuizService{

	@Autowired
	private QuizRepository  quizRepository;  
	
	@Override
	public Quiz add(Quiz quiz) {
		
	return	quizRepository.save(quiz);
	
	}

	@Override
	public Iterable<Quiz> get() {
		// TODO Auto-generated method stub
		return quizRepository.findAll();
	}

	@Override
	public Optional<Quiz> get(Long id) {
		// TODO Auto-generated method stub
		return quizRepository.findById(id);
	}

}
