package com.example.finalquizapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SubjectsActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subjects);

        recyclerView = findViewById(R.id.idCourseRV);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));

        myAdapter = new MyAdapter(this, getMyList());
        recyclerView.setAdapter(myAdapter);

        ImageView imageView=findViewById(R.id.app_icon);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SubjectsActivity.this,About.class);
                startActivity(intent);
            }
        });

    }

    @NonNull
    private ArrayList<Model> getMyList() {
        ArrayList<Model> models = new ArrayList<>();
        Model m = new Model();

        m.setId(1);
        m = new Model();
        m.setPath(QuizQuestionsActivity.class);
        m.setTitle("Calculus");
        m.setImg(R.drawable.calculus);
        m.setCategory("Calculus");
        models.add(m);

        m.setId(2);
        m = new Model();
        m.setPath(QuizQuestionsActivity.class);
        m.setTitle("Artificial Intelligence");
        m.setImg(R.drawable.artificial_intelligence);
        m.setCategory("Artificial_Intelligence");
        models.add(m);

        m.setId(3);
        m = new Model();
        m.setPath(QuizQuestionsActivity.class);
        m.setTitle("Machine Learning");
        m.setImg(R.drawable.machine_learning);
        m.setCategory("Machine_Learning");
        models.add(m);

        m.setId(4);
        m = new Model();
        m.setPath(QuizQuestionsActivity.class);
        m.setTitle("Networking");
        m.setImg(R.drawable.networking);
        m.setCategory("Networking");
        models.add(m);

        m.setId(5);
        m = new Model();
        m.setPath(QuizQuestionsActivity.class);
        m.setTitle("Software Engineering");
        m.setImg(R.drawable.softareengineering);
        m.setCategory("Software_Engineering");
        models.add(m);

        m.setId(6);
        m = new Model();
        m.setPath(QuizQuestionsActivity.class);
        m.setTitle("English Language");
        m.setImg(R.drawable.english);
        m.setCategory("English");
        models.add(m);

        m.setId(1);
        return models;
    }
}