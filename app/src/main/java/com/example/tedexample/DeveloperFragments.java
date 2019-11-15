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
import android.widget.ProgressBar;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class DeveloperFragments extends Fragment {


    View devView;
    DevResultModel developerList;
    RecyclerView recyclerDevView;
    TextView textDevName;
    DevelopAdapter developAdapter;
    ProgressBar pgrDevBar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        devView = inflater.inflate(R.layout.fragment_developer_fragments, container, false);
        pgrDevBar = (ProgressBar) devView.findViewById(R.id.pgrDevList);
        APIService service = RetrofitClient.getRetrofitInstance("https://rawg-video-games-database.p.rapidapi.com","rawg-video-games-database.p.rapidapi.com","3dc2a36d24mshdb45101497dc102p10bc92jsn5591140bc56d").create(APIService.class);
        Call<DevResultModel> callDevRes = service.getAllDevs();
        pgrDevBar.setVisibility(View.VISIBLE);
        callDevRes.enqueue(new Callback<DevResultModel>() {
            @Override
            public void onResponse(Call<DevResultModel> call, Response<DevResultModel> response) {
                setDeveloperList(response.body());
            }

            @Override
            public void onFailure(Call<DevResultModel> call, Throwable t) {

            }
        });
        return devView;
    }

    private void setDeveloperList(DevResultModel devList){
        developerList = devList;
        recyclerDevView = (RecyclerView) devView.findViewById(R.id.recyclerDevView);
        developAdapter = new DevelopAdapter(developerList,getContext());
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerDevView.setLayoutManager(layoutManager);
        recyclerDevView.setAdapter(developAdapter);
        pgrDevBar.setVisibility(View.GONE);
    }

}
