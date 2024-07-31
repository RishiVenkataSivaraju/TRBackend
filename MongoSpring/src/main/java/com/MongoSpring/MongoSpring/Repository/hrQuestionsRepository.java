package com.MongoSpring.MongoSpring.Repository;
import com.MongoSpring.MongoSpring.Model.hrQuestions;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface hrQuestionsRepository extends MongoRepository<hrQuestions, String> {
}
