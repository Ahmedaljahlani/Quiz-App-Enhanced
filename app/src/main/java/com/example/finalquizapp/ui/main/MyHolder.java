package com.example.finalquizapp.ui.main;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.finalquizapp.ItemClickListener;
import com.example.finalquizapp.R;

public class MyHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    ImageView mImageView;
    TextView mTitle;
    ItemClickListener itemClickListener;

    public MyHolder(@NonNull View itemView) {
        super(itemView);

        this.mImageView = itemView.findViewById(R.id.idIVcourseIV);
        this.mTitle = itemView.findViewById(R.id.idTVCourse);
        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        this.itemClickListener.onItemClickListener(v, getLayoutPosition());


    }

    public void setItemClickListener(ItemClickListener ic) {
        this.itemClickListener = ic;
    }
}