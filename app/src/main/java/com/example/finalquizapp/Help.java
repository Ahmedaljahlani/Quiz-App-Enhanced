package com.example.finalquizapp;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Help extends AppCompatActivity {

    public static final String helpAnswer = "HELP_ANSWER";

    String help;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

        TextView textView = (TextView) findViewById(R.id.helping_txt_view);
        String help = getIntent().getStringExtra("help");

        textView.setText(help);
    }
}