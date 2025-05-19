package com.quiz.repository;

import org.springframework.data.repository.CrudRepository;

import com.quiz.modal.Quiz;

public interface QuizRepository extends CrudRepository<Quiz, Long>{

}
