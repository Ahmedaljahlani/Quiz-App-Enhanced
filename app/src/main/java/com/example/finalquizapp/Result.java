package com.example.finalquizapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Result extends AppCompatActivity {

    RatingBar ratingBar;
    private TextView questionNumber;
    ArrayList<QuestionModel> questionModelArrayList;

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        ratingBar = findViewById(R.id.rating_bar);

        questionModelArrayList = (ArrayList<QuestionModel>) this.getIntent().getExtras().getSerializable("Pairs");
        RecyclerView recyclerView = findViewById(R.id.listView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        QuestionAdapter questionAdapter = new QuestionAdapter(Result.this, questionModelArrayList);
        recyclerView.setAdapter(questionAdapter);
//        listView.setVisibility(View.INVISIBLE);

        questionNumber = findViewById(R.id.idTVQuestionAttempted);
        String scores = getIntent().getStringExtra("Scores");
        questionNumber.setText(scores);


        String category = getIntent().getStringExtra("category");

        switch (scores) {
            case "1":
                ratingBar.setRating((float) 0.5);
                break;
            case "2":
                ratingBar.setRating((float) 1.0);
                break;
            case "3":
                ratingBar.setRating((float) 1.5);
                break;
            case "4":
                ratingBar.setRating((float) 2.0);
                break;
            case "5":
                ratingBar.setRating((float) 2.5);
                break;
            case "6":
                ratingBar.setRating((float) 3.0);
                break;
            case "7":
                ratingBar.setRating((float) 3.5);
                break;
            case "8":
                ratingBar.setRating((float) 4.0);
                break;
            case "9":
                ratingBar.setRating((float) 4.5);
                break;
            case "10":
                ratingBar.setRating((float) 5.0);
                break;
        }

        TextView rightAnswers = (TextView) findViewById(R.id.your_answers);
        rightAnswers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Result.this, ReviewAnswers.class);
                intent.putExtra("Pairs", questionModelArrayList);
                startActivity(intent);
            }
        });

        ImageView retryQuiz = (ImageView) findViewById(R.id.reTryingQuizz);
        retryQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(Result.this, YourAnswers.class);
//                intent.putExtra("Scores",scores);
//                startActivity(intent);
//                finish();
//
                Intent intent = new Intent(Result.this, QuizQuestionsActivity.class);
                intent.putExtra("category", category);
                startActivity(intent);
                finish();
            }
        });

        ImageView appHomeScreen = (ImageView) findViewById(R.id.homeScreen);
        appHomeScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Result.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}