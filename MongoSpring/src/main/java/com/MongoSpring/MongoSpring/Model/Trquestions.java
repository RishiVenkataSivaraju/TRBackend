package com.MongoSpring.MongoSpring.Model;


import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Collection;
@Document(collection = "trQuestions")
public class Trquestions {
    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    private String option;

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    private String question;

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    private String answer;

}


