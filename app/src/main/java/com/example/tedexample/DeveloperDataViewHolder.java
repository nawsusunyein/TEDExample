package com.example.tedexample;

import android.content.Context;
import android.media.Image;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import androidx.recyclerview.widget.RecyclerView;

public class DeveloperDataViewHolder extends RecyclerView.ViewHolder{

    ImageView imgDeveloper;
    TextView txtDevName;

    DeveloperDataViewHolder(View itemView){
        super(itemView);
        imgDeveloper = (ImageView) itemView.findViewById(R.id.imgDev);
        txtDevName = (TextView) itemView.findViewById(R.id.txtDevName);
    }

    public void bindDeveloperInfo(DevListModel devInfo, Context context){
        txtDevName.setText(devInfo.getDevName());
        Glide.with(context).load(devInfo.getDevImage()).into(imgDeveloper);
    }

}
