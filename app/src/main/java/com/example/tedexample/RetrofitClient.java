package com.example.tedexample;

import android.app.Application;

import java.io.IOException;

import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {
    private static Retrofit retrofit;
    private static final String BASE_URL = "https://rawg-video-games-database.p.rapidapi.com";
    public static Retrofit getRetrofitInstance(){
        if(retrofit == null){
            retrofit = new retrofit2.Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(new OkHttpClient().newBuilder()
                            .addInterceptor(new Interceptor() {
                                @Override
                                public Response intercept(Chain chain) throws IOException {
                                    Request original = chain.request();
                                    HttpUrl originalHttpUrl = original.url();

                                    HttpUrl newUrl = originalHttpUrl.newBuilder()
                                            .build();

                                    Request newRequest = original.newBuilder()
                                            .header("X-RapidAPI-Host", "rawg-video-games-database.p.rapidapi.com")
                                            .header("X-RapidAPI-Key", "3dc2a36d24mshdb45101497dc102p10bc92jsn5591140bc56d")
                                            .url(newUrl)
                                            .method(original.method(), original.body())
                                            .build();

                                    return chain.proceed(newRequest);

                                }
                            })
                            .build()
                    ).build();

        }
        return retrofit;
    }

}
