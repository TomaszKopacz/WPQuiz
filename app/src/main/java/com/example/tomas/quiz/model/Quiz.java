package com.example.tomas.quiz.model;

/**
 * Created by tomas on 11.04.2018.
 *
 * Class representing quiz.
 */

public class Quiz {

    private String title;
    private int questions;
    private Photo mainPhoto;

    /**
     * Constructor.
     */
    public Quiz(){

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getQuestionsCount() {
        return questions;
    }

    public void setQuestionsCount(int questions) {
        this.questions = questions;
    }

    public Photo getPhoto() {
        return mainPhoto;
    }

    public void setPhoto(Photo photo) {
        this.mainPhoto = photo;
    }
}
