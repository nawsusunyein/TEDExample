package com.example.tedexample;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class DevelopAdapter extends RecyclerView.Adapter<DeveloperDataViewHolder> {

    DevResultModel devResult;
    Context context;

    DevelopAdapter(DevResultModel devResult,Context context){
        this.devResult = devResult;
        this.context = context;
    }

    @NonNull
    @Override
    public DeveloperDataViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View userView = inflater.inflate(R.layout.item_dev_view,parent,false);
        DeveloperDataViewHolder developerDataViewHolder = new DeveloperDataViewHolder(userView);
        return developerDataViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull DeveloperDataViewHolder holder, int position) {
        final DevListModel devInfo = devResult.getDevResults().get(position);
        final int gameCount = devInfo.getGamesList().size();
        holder.bindDeveloperInfo(devInfo,context);
        holder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemClick(View view, int pos) {
                Intent devIntent = new Intent(context,DeveloperDetails.class);
                devIntent.putExtra("dev_name",devInfo.getDevName());
                devIntent.putExtra("dev_image",devInfo.getDevImage());
                devIntent.putExtra("dev_game_count",gameCount);
                context.startActivity(devIntent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return devResult.getDevResults().size();
    }
}
