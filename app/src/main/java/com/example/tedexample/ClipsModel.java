package com.example.tedexample;

import com.google.gson.annotations.SerializedName;

public class ClipsModel {

    @SerializedName("clip")
    private String clipName;

    public ClipsModel(String clipName){
        this.clipName = clipName;
    }

    public String getClipName(){return clipName;}
    public void setClipName(String clipName){
        this.clipName = clipName;
    }
}
