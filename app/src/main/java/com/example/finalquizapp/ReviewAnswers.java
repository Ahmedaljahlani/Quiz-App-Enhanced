package com.example.finalquizapp;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ReviewAnswers extends AppCompatActivity {

    public static final String ExtraData = "EXTRA_DATA";

    public TextView question1, question2, question3, question4, question5, question6, question7, question8, question9, question10;
    public TextView answer1, answer2, answer3, answer4, answer5, answer6, answer7, answer8, answer9, answer10;
    public ArrayList<QuestionModel> questionModelArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review_answers);

        questionModelArrayList = this.getIntent().getParcelableArrayListExtra("Pairs");
        ListView listView = findViewById(R.id.listView);
        QuestionAdapter questionAdapter = new QuestionAdapter(ReviewAnswers.this, questionModelArrayList);
        listView.setAdapter(questionAdapter);
    }
}