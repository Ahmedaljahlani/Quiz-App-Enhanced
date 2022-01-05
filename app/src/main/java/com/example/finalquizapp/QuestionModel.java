package com.example.finalquizapp;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

public class QuestionModel implements Serializable {

    private String question;
    private boolean answer;
    private boolean userAnswer;

    public QuestionModel(String question, boolean answer) {
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public boolean isAnswer() {
        return answer;
    }

    public void setAnswer(boolean answer) {
        this.answer = answer;
    }

    public boolean isUserAnswer() {
        return userAnswer;
    }

    public void setUserAnswer(boolean userAnswer) {
        this.userAnswer = userAnswer;
    }
}