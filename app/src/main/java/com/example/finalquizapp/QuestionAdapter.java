package com.example.finalquizapp;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class QuestionAdapter extends BaseAdapter {

    ArrayList<QuestionModel> questionModelArrayList;
    private Context mContext;
    int mResource;

    public QuestionAdapter(@NonNull Context context, @NonNull ArrayList<QuestionModel> objects) {
        this.mContext = context;
        this.questionModelArrayList = objects;

    }


    @Override
    public int getCount() {
        return questionModelArrayList.size();
    }

    @Nullable
    @Override
    public QuestionModel getItem(int position) {
        return questionModelArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(R.layout.row_item, parent, false);
        }
        QuestionModel questionModel = (QuestionModel) getItem(position);

        TextView textView = (TextView) convertView.findViewById(R.id.questionTV);
//        TextView option1=(TextView)convertView.findViewById(R.id.option1);
//        TextView option2=(TextView)convertView.findViewById(R.id.option2);
        TextView textView1 = (TextView) convertView.findViewById(R.id.answerTV);

        textView.setText(questionModel.getQuestion());
//        option1.setText(questionModel.getOption1());
//        option2.setText(questionModel.getOption2());
        textView1.setText(questionModel.getAnswer());
        if (textView1.getText().toString().equals("Yes")) {
            textView.setBackgroundColor(convertView.getResources().getColor(R.color.blue));
            textView.setTextColor(Color.WHITE);
            textView1.setBackgroundColor(convertView.getResources().getColor(android.R.color.holo_green_light));
            textView1.setTextColor(Color.WHITE);
        } else {
            textView.setBackgroundColor(convertView.getResources().getColor(R.color.blue));
            textView.setTextColor(Color.WHITE);
            textView1.setBackgroundColor(convertView.getResources().getColor(android.R.color.holo_red_dark));
            textView1.setTextColor(Color.WHITE);
        }
//        if (questionModel.getAnswer().trim().equals("Yes")&&questionModel.getOption1().equals("Yes")) {
//            textView.setBackgroundColor(convertView.getResources().getColor(R.color.blue));
//            textView.setTextColor(Color.WHITE);
//            textView1.setBackgroundColor(convertView.getResources().getColor(android.R.color.holo_green_light));
//            textView1.setTextColor(Color.WHITE);
//        } else {
//            textView.setBackgroundColor(convertView.getResources().getColor(R.color.blue));
//            textView.setTextColor(Color.WHITE);
//            textView1.setBackgroundColor(convertView.getResources().getColor(android.R.color.holo_red_dark));
//            textView1.setTextColor(Color.WHITE);
//        }

        return convertView;
    }
}