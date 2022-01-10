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

    private ImageView backward, forward, help, backButton, about;
    int chance = 1;


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
        backButton = findViewById(R.id.back_btn);
        about = findViewById(R.id.app_icon);

        questionModelArrayList = new ArrayList<>();
        random = new Random();

        String category = getIntent().getStringExtra("category");
        questionModelArrayList = QuestionBank.getQuestions(category);
        current = random.nextInt(questionModelArrayList.size());
        setDataToView(current);

        subjectTitle.setText(category);
        passedQuestions = new ArrayList<>();

        previous = 0;

        backward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (previous > 0) {
                    previous--;
                    setDataToView(previous);
                } else {
                    Toast.makeText(QuizQuestionsActivity.this, "no questions", Toast.LENGTH_SHORT).show();
                }

                if (passedQuestions.size() <= previous) {
                    Toast.makeText(QuizQuestionsActivity.this, "No Questions to show", Toast.LENGTH_SHORT).show();
                }
            }
        });

        forward = findViewById(R.id.forward);
        forward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                questionModelArrayList.get(current);
                setDataToView(current);
            }
        });
        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //helping answer
                if (chance <= 4) {
                    chance++;
                    String helpAnswer;
                    String currentQuestion;

                    currentQuestion = String.valueOf(questionModelArrayList.get(current).getQuestion());
                    helpAnswer = String.valueOf(questionModelArrayList.get(current).isAnswer());

                    Intent intent = new Intent(QuizQuestionsActivity.this, Help.class);
                    intent.putExtra("helpQuestion", currentQuestion);
                    intent.putExtra("help", helpAnswer);
                    startActivity(intent);
                } else {
                    Toast.makeText(QuizQuestionsActivity.this, "No More chance", Toast.LENGTH_SHORT).show();

                }
            }
        });

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(QuizQuestionsActivity.this,SubjectsActivity.class);
                startActivity(intent);
                finish();
            }
        });

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(QuizQuestionsActivity.this, About.class);
                startActivity(intent);
            }
        });

        optionBtnTrue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (questionModelArrayList.get(current).isAnswer()) {
                    currentScore++;
                    questionModelArrayList.get(current).setUserAnswer(true);
                } else {
                    questionModelArrayList.get(current).setUserAnswer(false);
                }
                previous++;
                passedQuestions.add(questionModelArrayList.get(current));
                questionAttempted++;
                shuffleQuestions();
            }
        });

        optionBtnFalse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!questionModelArrayList.get(current).isAnswer()) {
                    currentScore++;
                    questionModelArrayList.get(current).setUserAnswer(true);
                } else {
                    questionModelArrayList.get(current).setUserAnswer(false);
                }
                previous++;
                passedQuestions.add(questionModelArrayList.get(current));
                questionAttempted++;
                shuffleQuestions();
            }
        });

    }

    private void shuffleQuestions() {
        if (questionAttempted <= 10) {
            for (int i = 0; i < passedQuestions.size(); i++) {
                if (passedQuestions.get(i) == questionModelArrayList.get(current)) {
                    questionModelArrayList.remove(current);
                }
            }
            current = random.nextInt(questionModelArrayList.size());
            setDataToView(current);
        } else {
            Toast.makeText(QuizQuestionsActivity.this, "All Passed", Toast.LENGTH_SHORT).show();
        }

    }

    private void setDataToView(int current) {
        questionNumber.setText("Questions Attempted:" + questionAttempted + "/10");
        TextView scores = (TextView) findViewById(R.id.scores);
        scores.setVisibility(View.INVISIBLE);
        //displaying scores
        scores.setText("" + currentScore);

        String category = getIntent().getStringExtra("category");
        if (questionAttempted == 10) {
            Intent intent = new Intent(QuizQuestionsActivity.this, Result.class);
            intent.putExtra("Pairs", passedQuestions);
            intent.putExtra("Scores", scores.getText());
            intent.putExtra("category", category);
            startActivity(intent);
            finish();
        } else {
            questionTV.setText(questionModelArrayList.get(current).getQuestion());
        }

    }
}