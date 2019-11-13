package com.example.tedexample;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIService {

    @GET("/users")
    Call<List<UsersModel>> getAllUsers();

    @GET("/games")
    Call<GameResultModel> getAllGames();
}
