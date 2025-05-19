package com.question.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.question.modal.Question;
import com.question.service.QuestionService;


@RestController
@RequestMapping("/question")
public class QuestionController {


	private QuestionService questionService;

	public QuestionController(QuestionService questionService) {
		this.questionService=questionService;
	}
	
	
	@PostMapping
	public Question create(@RequestBody Question question) {
		
		return questionService.create(question);
	}
	
	@GetMapping
	public Iterable<Question> getAll() {
	return 	questionService.getAll();
	}
	@GetMapping("{questionid}")
	public Optional<Question> getByid(@PathVariable Long questionid) {
		return questionService.getById(questionid);
	}
	
	@GetMapping("/quizdet/{QuizId}")
	public List<Question> getByquizid_ques_det(@PathVariable Long QuizId){
		return questionService.getByquizid_ques_det(QuizId);
	}
}
