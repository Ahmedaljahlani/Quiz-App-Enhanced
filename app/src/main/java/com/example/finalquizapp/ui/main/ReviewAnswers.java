package com.example.finalquizapp.ui.main;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.finalquizapp.R;
import com.example.finalquizapp.pojo.QuestionModel;

import java.util.ArrayList;

public class ReviewAnswers extends AppCompatActivity {

    public static final String ExtraData = "EXTRA_DATA";
    public ArrayList<QuestionModel> questionModelArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review_answers);

        questionModelArrayList= (ArrayList<QuestionModel>) this.getIntent().getExtras().getSerializable("Pairs");
        RecyclerView recyclerView = findViewById(R.id.listView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        QuestionAdapter questionAdapter = new QuestionAdapter(ReviewAnswers.this, questionModelArrayList);
        recyclerView.setAdapter(questionAdapter);


        ImageView backButton=findViewById(R.id.back_btn);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}