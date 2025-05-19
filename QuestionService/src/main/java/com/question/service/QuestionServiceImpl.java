package com.question.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.question.modal.Question;
import com.question.repository.QuestionRepository;

@Service
public class QuestionServiceImpl implements QuestionService{

	@Autowired
	private QuestionRepository questionRepository;
	
	
	@Override
	public Question create(Question question) {
		// TODO Auto-generated method stub
		return questionRepository.save(question);
	}

	@Override
	public Optional<Question> getById(Long questionid) {
		// TODO Auto-generated method stub
		return questionRepository.findById(questionid);
	}

	@Override
	public Iterable<Question> getAll() {
		// TODO Auto-generated method stub
		return questionRepository.findAll();
	}

	@Override
	public List<Question> getByquizid_ques_det(Long quizId) {
		// TODO Auto-generated method stub
		return questionRepository.getByquizid_ques_det(quizId);
	}

}
