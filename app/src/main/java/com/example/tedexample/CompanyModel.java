package com.example.tedexample;

import com.google.gson.annotations.SerializedName;

public class CompanyModel {
    @SerializedName("name")
    private String comName;


    CompanyModel(String comName){
        this.comName = comName;
    }

    public String getComName(){
        return comName;
    }

    public void setComName(String comName){
        this.comName = comName;
    }
}
