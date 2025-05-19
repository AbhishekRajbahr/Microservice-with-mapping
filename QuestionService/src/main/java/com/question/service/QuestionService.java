package com.question.service;

import java.util.List;
import java.util.Optional;

import com.question.modal.Question;

public interface QuestionService {

	Question create (Question question);
	
	Optional<Question> getById(Long questionid);
	
	Iterable<Question> getAll();
	
	List<Question> getByquizid_ques_det(Long quizId);
	
}
