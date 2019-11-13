package com.example.tedexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class GameDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_details);
        TextView txtGameName = (TextView) findViewById(R.id.txtName);
        Intent detailIntent = getIntent();
        String name = detailIntent.getExtras().getString("game_name");
        txtGameName.setText(name);

    }
}
