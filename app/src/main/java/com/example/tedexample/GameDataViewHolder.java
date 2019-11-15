package com.example.tedexample;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import androidx.recyclerview.widget.RecyclerView;

public class GameDataViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

    ImageView imageViewGameProfile;
    TextView txtGameName;
    RatingBar rdGameRatingBar;
    private ItemClickListener itemClickListener;

    GameDataViewHolder(View itemView){
        super(itemView);
        imageViewGameProfile = (ImageView) itemView.findViewById(R.id.imgGameProfile);
        txtGameName = (TextView) itemView.findViewById(R.id.txtGameName);
        rdGameRatingBar = (RatingBar) itemView.findViewById(R.id.rdGameRatingBar);
        itemView.setOnClickListener(this);
    }

    public void bindGameListData(GameListModel gameInfo, Context context){
        Glide.with(context).load(gameInfo.getGameBackgroundImage()).into(imageViewGameProfile);
        txtGameName.setText(gameInfo.getGameName());
        rdGameRatingBar.setRating(Float.parseFloat(gameInfo.getGameRating()));
    }


    @Override
    public void onClick(View v) {
        this.itemClickListener.onItemClick(v,getLayoutPosition());
    }

    public void setItemClickListener(ItemClickListener ic){
        this.itemClickListener = ic;
    }
}
