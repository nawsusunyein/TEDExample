package com.example.tedexample;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GameResultModel {
    @SerializedName("results")
    private List<GameListModel> gameResult;


    public GameResultModel(List<GameListModel> gameResult){
        this.gameResult = gameResult;
    }

    public List<GameListModel> getGameResult(){return gameResult;}

    public void setGameResult(List<GameListModel> gameResult){
        this.gameResult = gameResult;
    }

}
