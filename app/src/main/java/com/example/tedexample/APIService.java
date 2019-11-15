package com.example.tedexample;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIService {

    @GET("/games")
    Call<GameResultModel> getAllGames();

    @GET("/developers")
    Call<DevResultModel> getAllDevs();
}
