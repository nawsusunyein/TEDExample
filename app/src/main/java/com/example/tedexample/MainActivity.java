package com.example.tedexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tl_tablayout);
        TabItem tabVideos = (TabItem) findViewById(R.id.tabVideo);
        TabItem tabInfo = (TabItem) findViewById(R.id.tabAboutSpeaker);


    }
}
