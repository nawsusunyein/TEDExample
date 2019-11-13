package com.example.tedexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class GameAdapter extends RecyclerView.Adapter<GameDataViewHolder>{

    private List<UsersModel> userList;
    private GameResultModel gameList;
    Context context;

    GameAdapter(GameResultModel gameList,Context context){
        this.gameList = gameList;
        this.context = context;
    }

    @NonNull
    @Override
    public GameDataViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View userView = inflater.inflate(R.layout.item_game_view,parent,false);
        GameDataViewHolder gameDataViewHolder = new GameDataViewHolder(userView);
        return gameDataViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull GameDataViewHolder holder, int position) {
        holder.txtGameName.setText(gameList.getGameResult().get(position).getGameName());
        holder.txtRating.setText(gameList.getGameResult().get(position).getGameRating());
        holder.txtReleasedDate.setText(gameList.getGameResult().get(position).getGameReleasedDate());
    }

    @Override
    public int getItemCount() {
        return gameList.getGameResult().size();
    }
}
