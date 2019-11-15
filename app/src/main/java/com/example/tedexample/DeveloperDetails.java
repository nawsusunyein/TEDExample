package com.example.tedexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DeveloperDetails extends AppCompatActivity {


    ImageView imgDeveloper;
    TextView textDeveloperName;
    TextView textGameCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_developer_details);
        textDeveloperName = (TextView) findViewById(R.id.textDeveloperName);
        textGameCount = (TextView) findViewById(R.id.txtNumberOfGames);
        imgDeveloper = (ImageView) findViewById(R.id.imgDeveloper);
        Intent detailIntent = getIntent();
        String devName = detailIntent.getExtras().getString("dev_name");
        String devImage = detailIntent.getExtras().getString("dev_image");
        int devGameCount = detailIntent.getExtras().getInt("dev_game_count");

        Glide.with(getApplicationContext()).load(devImage).into(imgDeveloper);
        textDeveloperName.setText(devName);
        textGameCount.setText(String.valueOf(devGameCount));
        
    }
}
