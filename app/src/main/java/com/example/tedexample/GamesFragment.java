package com.example.tedexample;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class GamesFragment extends Fragment {

    RecyclerView recyclerGameView;
    GameAdapter gameAdapter;
    List<UsersModel> userList;
    GameResultModel gamesList;
    View gameView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        gameView = inflater.inflate(R.layout.fragment_games, container, false);
        APIService service = RetrofitClient.getRetrofitInstance().create(APIService.class);
        Call<GameResultModel> callGameList = service.getAllGames();

        /*call.enqueue(new Callback<List<UsersModel>>() {
            @Override
            public void onResponse(Call<List<UsersModel>> call, Response<List<UsersModel>> response) {
                loadUserList(response.body());
            }

            @Override
            public void onFailure(Call<List<UsersModel>> call, Throwable t) {
               // Toast.makeText(MainActivity.this,"Unable to load user",Toast.LENGTH_LONG).show();
            }
        });*/


        callGameList.enqueue(new Callback<GameResultModel>() {
            @Override
            public void onResponse(Call<GameResultModel> call, Response<GameResultModel> response) {
                setGameList(response.body());
            }

            @Override
            public void onFailure(Call<GameResultModel> call, Throwable t) {

            }
        });
        return gameView;
    }


    private void loadUserList(List<UsersModel> usersList){
        /*userList = usersList;
        recyclerGameView = (RecyclerView) gameView.findViewById(R.id.recyclerGameView);
        gameAdapter = new GameAdapter(userList,getContext());
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerGameView.setLayoutManager(layoutManager);
        recyclerGameView.setAdapter(gameAdapter);*/
    }

    private void setGameList(GameResultModel gameList){
        gamesList = gameList;
        recyclerGameView = (RecyclerView) gameView.findViewById(R.id.recyclerGameView);
        gameAdapter = new GameAdapter(gameList,getContext());
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerGameView.setLayoutManager(layoutManager);
        recyclerGameView.setAdapter(gameAdapter);
    }

}
