package com.quiz.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.quiz.modal.Question;

@FeignClient(url="http://localhost:8082",value="Question-Client")
public interface QuestionClient {
	
	@GetMapping("/question/quizdet/{quizId}")
	List<Question> getQuestionOfQuiz(@PathVariable Long quizId);

}
