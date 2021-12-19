package com.example.finalquizapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Random;

public class QuizQuestionsActivity extends AppCompatActivity {

    int REQUEST_CODE_1;
    private TextView subjectTitle, questionTV, questionNumber;
    private Button optionBtnTrue, optionBtnFalse;
    ArrayList<QuestionModel> questionModelArrayList;

    ArrayList<QuestionModel> passedQuestions;
    ArrayList<QuestionModel> previousQuestions;
    Random random;
    int currentScore = 0, questionAttempted = 0, current = 0, previous;

    private ImageView backward, forward, help,backButton;
    int chance = 1;

    Model model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_questions);

        subjectTitle = findViewById(R.id.subjectName);
        questionTV = findViewById(R.id.idTVQuestions);
        questionNumber = findViewById(R.id.idTVQuestionAttempted);
        optionBtnTrue = findViewById(R.id.optionTrue);
        optionBtnFalse = findViewById(R.id.optionFalse);
        backward = findViewById(R.id.backward);
        help = findViewById(R.id.help);
        backButton=findViewById(R.id.back_btn);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        questionModelArrayList = new ArrayList<>();
        random = new Random();

        String category = getIntent().getStringExtra("category");
        questionModelArrayList = QuestionBank.getQuestions(category);
        current = random.nextInt(questionModelArrayList.size());
        setDataToView(current);

        subjectTitle.setText(category);
        passedQuestions = new ArrayList<QuestionModel>();

        backward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (questionAttempted >= 1 && questionAttempted <= 10 || optionBtnTrue.isPressed() && optionBtnFalse.isPressed()) {
                    previous = random.nextInt(passedQuestions.size());
                    setDataToView(previous);
                } else {
//                    previous++;
                    Toast.makeText(QuizQuestionsActivity.this, "No passed Questions", Toast.LENGTH_SHORT).show();
                }
            }
        });

        forward = findViewById(R.id.forward);
        forward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (questionAttempted > 1 || optionBtnTrue.isPressed() && optionBtnFalse.isPressed()) {
                    questionModelArrayList = QuestionBank.getQuestions(category);
                    current = random.nextInt(passedQuestions.size());
                    questionNumber.setText("Question Attempted:" + questionAttempted + "/10");
                    questionTV.setText(passedQuestions.get(current).getQuestion());
                } else {
                    Toast.makeText(QuizQuestionsActivity.this, "Please check your answers", Toast.LENGTH_SHORT).show();
                }
            }
        });
        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //helping answer
                if (chance <= 1) {
                    chance++;
                    String helpAnswer;
                    helpAnswer = questionModelArrayList.get(current).getAnswer().trim().toString();
                    Intent intent = new Intent(QuizQuestionsActivity.this, Help.class);
                    intent.putExtra("help", helpAnswer);
                    startActivity(intent);
                } else {
                    Toast.makeText(QuizQuestionsActivity.this, "No More chance", Toast.LENGTH_SHORT).show();

                }
            }
        });


        optionBtnTrue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (questionModelArrayList.get(current).getAnswer().trim().toLowerCase().equals(optionBtnTrue.getText().toString().trim().toLowerCase())) {
                    currentScore++;
                }
                passedQuestions.add(questionModelArrayList.get(current));
                questionAttempted++;
                current = random.nextInt(questionModelArrayList.size());
                setDataToView(current);
            }
        });

        optionBtnFalse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (questionModelArrayList.get(current).getAnswer().trim().toLowerCase().equals(optionBtnFalse.getText().toString().trim().toLowerCase())) {
                    currentScore++;
                }
                passedQuestions.add(questionModelArrayList.get(current));
                questionAttempted++;
                current = random.nextInt(questionModelArrayList.size());
                setDataToView(current);
            }
        });

    }

    private void setDataToView(int current) {
        questionNumber.setText("Question Attempted:" + questionAttempted + "/10");
        TextView scores = (TextView) findViewById(R.id.scores);
        scores.setVisibility(View.INVISIBLE);
        //displaying scores
        scores.setText("" + currentScore);

        if (questionAttempted == 10) {
            Intent intent = new Intent(QuizQuestionsActivity.this, Result.class);
            intent.putParcelableArrayListExtra("Pairs", passedQuestions);
            intent.putExtra("Scores", scores.getText());
            startActivity(intent);
            this.finish();
        } else {
            questionTV.setText(questionModelArrayList.get(current).getQuestion());
            optionBtnTrue.setText(questionModelArrayList.get(current).getOption1());
            optionBtnFalse.setText(questionModelArrayList.get(current).getOption2());
        }

    }
}