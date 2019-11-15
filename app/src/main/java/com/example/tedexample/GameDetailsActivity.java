package com.example.tedexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;

import com.bumptech.glide.Glide;
import com.google.android.material.appbar.CollapsingToolbarLayout;

import org.w3c.dom.Text;

public class GameDetailsActivity extends AppCompatActivity {

    TextView txtGameName;
    TextView txtGameRating;
    TextView txtGameReleasedDate;
    CollapsingToolbarLayout collapseToolLayout;
    ImageView imgGameProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_details);
       // getActionBar().hide();
        //txtGameName = (TextView) findViewById(R.id.txtGameN);
        //txtGameRating = (TextView) findViewById(R.id.txtGameR);
        //txtGameReleasedDate = (TextView) findViewById(R.id.txtGameRes);
        imgGameProfile = (ImageView) findViewById(R.id.imgGameImage);
        collapseToolLayout = (CollapsingToolbarLayout) findViewById(R.id.toolbarGameTitle);

        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);
        Intent detailIntent = getIntent();
        String name = detailIntent.getExtras().getString("game_name");
        String rating = detailIntent.getExtras().getString("game_rating");
        String releaseDate = detailIntent.getExtras().getString("game_date");
        String imgURLString = detailIntent.getExtras().getString("game_bgImage");

        //txtGameName.setText(name);
       // txtGameRating.setText(rating);
       // txtGameReleasedDate.setText(releaseDate);
        collapseToolLayout.setTitle(name);
        Glide.with(getApplicationContext()).load(imgURLString).into(imgGameProfile);

    }
}
