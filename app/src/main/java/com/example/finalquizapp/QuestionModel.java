package com.example.finalquizapp;

import android.os.Parcel;
import android.os.Parcelable;

public class QuestionModel implements Parcelable {

    private String question;
    private String option1;
    private String option2;
    private String answer;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    String category;

    public QuestionModel(String question, String option1, String option2, String answer) {
        this.question = question;
        this.option1 = option1;
        this.option2 = option2;
        this.answer = answer;
    }

    protected QuestionModel(Parcel in) {
        question = in.readString();
        option1 = in.readString();
        option2 = in.readString();
        answer = in.readString();
    }

    public static final Creator<QuestionModel> CREATOR = new Creator<QuestionModel>() {
        @Override
        public QuestionModel createFromParcel(Parcel in) {
            return new QuestionModel(in);
        }

        @Override
        public QuestionModel[] newArray(int size) {
            return new QuestionModel[size];
        }
    };

    public QuestionModel() {

    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getOption1() {
        return option1;
    }

    public void setOption1(String option1) {
        this.option1 = option1;
    }

    public String getOption2() {
        return option2;
    }

    public void setOption2(String option2) {
        this.option2 = option2;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(question);
        dest.writeString(option1);
        dest.writeString(option2);
        dest.writeString(answer);
    }
}
