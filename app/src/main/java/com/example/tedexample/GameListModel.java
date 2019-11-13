package com.example.tedexample;

import com.google.gson.annotations.SerializedName;

public class GameListModel {

    @SerializedName("name")
    private String gameName;
    @SerializedName("released")
    private String gameReleasedDate;
    @SerializedName("background_image")
    private String gameBackgroundImage;
    @SerializedName("rating")
    private String gameRating;
    @SerializedName("clip")
    private ClipsModel clipInfo;

    public GameListModel(String gameName,String gameReleasedDate,String gameBackgroundImage,String gameRating,ClipsModel clipInfo){
        this.gameName = gameName;
        this.gameReleasedDate = gameReleasedDate;
        this.gameBackgroundImage = gameBackgroundImage;
        this.gameRating = gameRating;
        this.clipInfo = clipInfo;
    }

    public String getGameName(){return gameName;}
    public String getGameReleasedDate(){return gameReleasedDate;}
    public String getGameBackgroundImage(){return gameBackgroundImage;}
    public String getGameRating(){return gameRating;}
    public ClipsModel getClipInfo(){return clipInfo;}

    public void setGameName(String gameName){
        this.gameName = gameName;
    }

    public void setGameReleasedDate(String gameReleasedDate){
        this.gameReleasedDate = gameReleasedDate;
    }

    public void setGameBackgroundImage(String gameBackgroundImage){
        this.gameBackgroundImage = gameBackgroundImage;
    }

    public void setGameRating(String gameRating){
        this.gameRating = gameRating;
    }

    public void setClipInfo(ClipsModel clipInfo){
        this.clipInfo = clipInfo;
    }
}
