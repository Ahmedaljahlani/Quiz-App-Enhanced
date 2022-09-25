package com.example.finalquizapp.ui.main;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.finalquizapp.R;

public class Help extends AppCompatActivity {

    public static final String helpAnswer = "HELP_ANSWER";

    String help;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

        TextView helpQuestion=findViewById(R.id.questionForHelp);
        TextView textView =findViewById(R.id.helping_txt_view);

        String questionExtra=getIntent().getStringExtra("helpQuestion");
        String help = getIntent().getStringExtra("help");

        helpQuestion.setText(questionExtra);
        textView.setText(help.toUpperCase());

        ImageView backButton=findViewById(R.id.back_btn);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}