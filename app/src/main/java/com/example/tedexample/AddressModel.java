package com.example.tedexample;

import com.google.gson.annotations.SerializedName;

public class AddressModel {
    @SerializedName("street")
    private String homeStreet;
    @SerializedName("city")
    private String homeCity;

    public AddressModel(String homeStreet,String homeCity){
        this.homeStreet = homeStreet;
        this.homeCity = homeCity;

    }

    public String getHomeStreet(){
        return homeStreet;
    }

    public String getHomeCity(){
        return homeCity;
    }

    public void setHomeStreet(String homeStreet){
        this.homeStreet = homeStreet;
    }

    public void setHomeCity(String homeCity){
        this.homeCity = homeCity;
    }
}
