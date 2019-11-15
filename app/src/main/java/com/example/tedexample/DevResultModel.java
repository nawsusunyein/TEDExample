package com.example.tedexample;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DevResultModel {

    @SerializedName("results")
    private List<DevListModel> devResults;

    public DevResultModel(List<DevListModel> devResults){
        this.devResults = devResults;
    }

    public List<DevListModel> getDevResults(){
        return devResults;
    }

    public void setDevResults(List<DevListModel> devResults){
        this.devResults = devResults;
    }
}
