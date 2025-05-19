package com.question.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.question.modal.Question;

public interface QuestionRepository extends CrudRepository<Question, Long> {

	@Query(nativeQuery = true, value = "select * from Question where quizid=:quizId")
	List<Question> getByquizid_ques_det(@Param("quizId") Long quizId);
}
