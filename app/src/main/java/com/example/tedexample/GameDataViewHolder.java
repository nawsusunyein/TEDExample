package com.example.tedexample;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class GameDataViewHolder extends RecyclerView.ViewHolder {

    ImageView imgGameProgile;
    TextView txtGameName;
    TextView txtReleasedDate;
    TextView txtRating;

    GameDataViewHolder(View itemView){
        super(itemView);
        txtGameName = (TextView) itemView.findViewById(R.id.txtGameName);
        txtRating = (TextView) itemView.findViewById(R.id.txtRating);
        txtReleasedDate = (TextView) itemView.findViewById(R.id.txtReleaseDate);
    }
}
