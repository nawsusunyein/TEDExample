package com.example.tedexample;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class GameAdapter extends RecyclerView.Adapter<GameDataViewHolder>{

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
        final GameListModel gameInfo = gameList.getGameResult().get(position);
        holder.bindGameListData(gameInfo,context);
        holder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemClick(View view, int pos) {
                Intent gameDetailsIntent = new Intent(context,GameDetailsActivity.class);
                gameDetailsIntent.putExtra("game_name",gameInfo.getGameName());
                gameDetailsIntent.putExtra("game_rating",gameInfo.getGameRating());
                gameDetailsIntent.putExtra("game_date",gameInfo.getGameRating());
                gameDetailsIntent.putExtra("game_bgImage",gameInfo.getGameBackgroundImage());
                context.startActivity(gameDetailsIntent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return gameList.getGameResult().size();
    }
}
