package com.example.tedexample;

import android.media.Image;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class DeveloperDataViewHolder extends RecyclerView.ViewHolder{

    ImageView imgDeveloper;
    TextView txtDevName;

    DeveloperDataViewHolder(View itemView){
        super(itemView);
        imgDeveloper = (ImageView) itemView.findViewById(R.id.imgDev);
        txtDevName = (TextView) itemView.findViewById(R.id.txtDevName);
    }

}
