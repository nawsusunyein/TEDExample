package com.example.tedexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.VideoView;

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
    VideoView vdoGameVideoView;
    ProgressBar progressBar;
    RatingBar ratingBar;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_details);



        txtGameName = (TextView) findViewById(R.id.textGameN);
        txtGameRating = (TextView) findViewById(R.id.textGameR);
        txtGameReleasedDate = (TextView) findViewById(R.id.textGameReleaseDate);
        collapseToolLayout = (CollapsingToolbarLayout) findViewById(R.id.toolbarGameTitle);
        vdoGameVideoView = (VideoView) findViewById(R.id.vdoGameVideo);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        ratingBar = (RatingBar) findViewById(R.id.ratingBar);
        toolbar = (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                //Define Back Button Function
            }
        });

        Intent detailIntent = getIntent();
        String name = detailIntent.getExtras().getString("game_name");
        String rating = detailIntent.getExtras().getString("game_rating");
        String releaseDate = detailIntent.getExtras().getString("game_date");
        String imgURLString = detailIntent.getExtras().getString("game_bgImage");
        String clipString = detailIntent.getExtras().getString("game_clip");

        collapseToolLayout.setTitle(name);
        Uri video = Uri.parse(clipString);
        vdoGameVideoView.setVideoURI(video);
        vdoGameVideoView.start();
        progressBar.setVisibility(View.VISIBLE);
        vdoGameVideoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
                mp.start();
                mp.setOnVideoSizeChangedListener(new MediaPlayer.OnVideoSizeChangedListener() {
                    @Override
                    public void onVideoSizeChanged(MediaPlayer mp, int width, int height) {
                        mp.start();
                        progressBar.setVisibility(View.GONE);
                    }
                });

            }
        });
        ratingBar.setRating(Float.parseFloat(rating));
        txtGameName.setText(name);
        txtGameRating.setText(rating);
        txtGameReleasedDate.setText(releaseDate);

    }
}
