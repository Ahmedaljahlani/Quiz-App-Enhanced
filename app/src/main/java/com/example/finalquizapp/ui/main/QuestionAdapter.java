package com.example.finalquizapp.ui.main;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.finalquizapp.R;
import com.example.finalquizapp.pojo.QuestionModel;

import java.util.ArrayList;

public class QuestionAdapter extends RecyclerView.Adapter<QuestionAdapter.MyHolder> {

    ArrayList<QuestionModel> questionModelArrayList;
    private Context mContext;
    int mResource;

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item, parent, false);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int i) {
        QuestionModel questionModel = questionModelArrayList.get(i);

        holder.textViewQuestion.setText(questionModelArrayList.get(i).getQuestion());
        holder.textViewAnswer.setText(String.valueOf(questionModelArrayList.get(i).isAnswer()));

        if (questionModelArrayList.get(i).isUserAnswer()) {
            holder.textViewAnswer.setTextColor(Color.BLACK);
            holder.textViewAnswer.setBackgroundColor(Color.GREEN);
        } else {
            holder.textViewAnswer.setBackgroundColor(Color.RED);
            holder.textViewAnswer.setTextColor(Color.WHITE);
        }
    }

    public QuestionAdapter(Context context, ArrayList<QuestionModel> questionModelArrayList) {
        this.mContext = context;
        this.questionModelArrayList = questionModelArrayList;

    }

    @Override
    public int getItemCount() {
        return questionModelArrayList.size();
    }


    public static class MyHolder extends RecyclerView.ViewHolder {

        TextView textViewQuestion, textViewAnswer, textViewUserAnswer;

        public MyHolder(@NonNull View itemView) {
            super(itemView);

            textViewQuestion = itemView.findViewById(R.id.questionTV);
            textViewAnswer = itemView.findViewById(R.id.answerTV);
        }
    }
}