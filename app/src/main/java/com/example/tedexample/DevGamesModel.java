package com.example.tedexample;

import com.google.gson.annotations.SerializedName;

public class DevGamesModel {

    @SerializedName("name")
    private String gameName;

    public DevGamesModel(String gameName){
        this.gameName = gameName;
    }

    public String getGameName(){
        return gameName;
    }

    public void setGameName(String gameName){
        this.gameName = gameName;
    }
}
