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

public class FirstFragment extends Fragment {
    View MyView;
    public Adapter mAdapter;
    public RecyclerView.LayoutManager mLayoutManager;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        MyView = inflater.inflate(R.layout.workoutpage, container, false);
        return MyView;

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        RecyclerView mRecyclerView = view.findViewById(R.id.recyclerView);
        /* creating the cards */
        final ArrayList<Item> ItemList = new ArrayList<>();

        ItemList.add(new Item(R.drawable.dumbbell, "Snatch Strength", "Heavy snatch training with less focus on technique and more on gaining overall strength."));
        ItemList.add(new Item(R.drawable.dumbbell, "Clean and Jerk Strength", "Heavy clean and jerk training with less focus on technique and more on gaining overall strength."));
        ItemList.add(new Item(R.drawable.snatch, "Snatch Technique", "Snatch training with a focus on building and solidifying good technique."));
        ItemList.add(new Item(R.drawable.cleanandjerk, "Clean and Jerk Technique Technique", "Clean and Jerk training with a focus on building and solidifying good technique."));
        ItemList.add(new Item(R.drawable.dumbbell, "Warm Up", "Warm your body up to prepare for your workout"));

        mLayoutManager = new LinearLayoutManager(getActivity());
        mAdapter = new Adapter(ItemList);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);

        mAdapter.setOnItemClickListener(new Adapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                changeItem(position, "test", ItemList);
            }
        });

        super.onViewCreated(view, savedInstanceState);
    }

    public void changeItem(int position, String text, ArrayList<Item> ItemList){
        ItemList.get(position).changeText1(text);
        mAdapter.notifyItemChanged(position);
    }
}
