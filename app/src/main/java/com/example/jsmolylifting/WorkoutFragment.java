package com.example.jsmolylifting;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class WorkoutFragment extends Fragment {
    View MyView;
    public Adapter4 mAdapter;
    public RecyclerView.LayoutManager mLayoutManager;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        MyView = inflater.inflate(R.layout.indiworkoutpage, container, false);
        return MyView;

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        RecyclerView mRecyclerView = view.findViewById(R.id.recyclerView);
        /* creating the cards */
        final ArrayList<Item4> ItemList = new ArrayList<>();

        ItemList.add(new Item4("Hang Snatch", "Heavy snatch training with less focus on technique and more on gaining overall strength."));
        ItemList.add(new Item4("Clean and Jerk Strength", "Heavy clean and jerk training with less focus on technique and more on gaining overall strength."));

        mLayoutManager = new LinearLayoutManager(getActivity());
        mAdapter = new Adapter4(ItemList);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);

        super.onViewCreated(view, savedInstanceState);
    }
}
