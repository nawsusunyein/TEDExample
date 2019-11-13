package com.example.tedexample;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import androidx.recyclerview.widget.RecyclerView;

public class GameDataViewHolder extends RecyclerView.ViewHolder {

    ImageView imageViewGameProfile;
    TextView txtGameName;
    TextView txtReleasedDate;
    TextView txtRating;

    GameDataViewHolder(View itemView){
        super(itemView);
        imageViewGameProfile = (ImageView) itemView.findViewById(R.id.imgGameProfile);
        txtGameName = (TextView) itemView.findViewById(R.id.txtGameName);
        txtRating = (TextView) itemView.findViewById(R.id.txtRating);
        txtReleasedDate = (TextView) itemView.findViewById(R.id.txtReleaseDate);
    }

    public void bindGameListData(GameListModel gameInfo, Context context){
        String ratingValue = gameInfo.getGameRating().toString() + " Rating";
        Glide.with(context).load(gameInfo.getGameBackgroundImage()).into(imageViewGameProfile);
        txtGameName.setText(gameInfo.getGameName());
        txtRating.setText(ratingValue);
        txtReleasedDate.setText(gameInfo.getGameReleasedDate());
    }


}
