package com.example.tomas.quiz.model;

import java.util.List;

/**
 * Created by tomas on 12.04.2018.
 */

public class QuizDetails {

    private float avgResult;

    private List<Question> questions;

    private List<Rate> rates;

    public QuizDetails(){

    }

    public float getAvgResult() {
        return avgResult;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public List<Rate> getRates() {
        return rates;
    }
}
