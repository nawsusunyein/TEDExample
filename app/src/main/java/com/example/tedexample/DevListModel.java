package com.example.tedexample;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DevListModel {

    @SerializedName("name")
    private String devName;
    @SerializedName("image_background")
    private String devImage;
    @SerializedName("games")
    private List<DevGamesModel> gamesList;

    public DevListModel(String devName,String devImage,List<DevGamesModel> gamesList){
        this.devName = devName;
        this.devImage = devImage;
        this.gamesList = gamesList;
    }

    public String getDevName(){
        return devName;
    }

    public String getDevImage(){
        return devImage;
    }

    public List<DevGamesModel> getGamesList(){
        return gamesList;
    }

    public void setDevName(String devName){
        this.devName = devName;
    }

    public void setDevImage(String devImage){
        this.devImage = devImage;
    }

    public void setGamesList(List<DevGamesModel> gamesList){
        this.gamesList = gamesList;
    }
}
