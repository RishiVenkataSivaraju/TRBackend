package com.MongoSpring.MongoSpring.Service;

import com.MongoSpring.MongoSpring.Model.hrQuestions;
import com.MongoSpring.MongoSpring.Repository.hrQuestionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class hrQuestionsService {
    private final hrQuestionsRepository questionsRepository;

    @Autowired
    public hrQuestionsService(hrQuestionsRepository questionsRepository) {
        this.questionsRepository = questionsRepository;
    }
    public hrQuestions sendQuestions(hrQuestions hrQuestions) {
        return questionsRepository.save(hrQuestions);

    }
    public List<hrQuestions> getAllQuestions() {
        List<hrQuestions> questions = questionsRepository.findAll();
        return questions;
    }
}
