package com.example.tedexample;

import android.content.Context;
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
        holder.txtDevName.setText(devResult.getDevResults().get(position).getDevName());
        Glide.with(context).load(devResult.getDevResults().get(position).getDevImage()).into(holder.imgDeveloper);
    }

    @Override
    public int getItemCount() {
        return devResult.getDevResults().size();
    }
}
