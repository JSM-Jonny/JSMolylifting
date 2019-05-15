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
import android.widget.Toast;

import java.util.ArrayList;

public class FirstFragment extends Fragment {
    View MyView;

    // creating variables
    public Adapter mAdapter;
    public RecyclerView.LayoutManager mLayoutManager;
    private long backPressedTime;
    private Toast backToast;
    private ArrayList<Item> ItemList = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // creating the view from the workout page layout.
        MyView = inflater.inflate(R.layout.workoutpage, container, false);
        return MyView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        // Assigning the recyclerView in the layout to the recyclerView in this fragment
        RecyclerView mRecyclerView = view.findViewById(R.id.recyclerView);
        /* creating the cards */


        // adding content to the ArrayList that will be used to fill the cards in the associated recyclerView
        ItemList = new ArrayList<>();
        ItemList.add(new Item(R.drawable.dumbbell, "Snatch Strength", "Heavy snatch training with less focus on technique and more on gaining overall strength.", "1"));
        ItemList.add(new Item(R.drawable.snatch, "Snatch Technique", "Snatch training with a focus on building and solidifying good technique.", "2"));
        ItemList.add(new Item(R.drawable.cleanandjerk, "Clean and Jerk Technique Technique", "Clean and Jerk training with a focus on building and solidifying good technique.", "3"));

        // creating a Linear Layout Manager and using the activity associated to this fragment as the context
        mLayoutManager = new LinearLayoutManager(getActivity());
        mAdapter = new Adapter(ItemList);

        //setting the layout manager we just created to be used with this recyclerView
        mRecyclerView.setLayoutManager(mLayoutManager);
        // setting the adapter we just created to be used with this recyclerView
        mRecyclerView.setAdapter(mAdapter);

        // setting a listener that will run a method when one of the cards is pressed
        mAdapter.setOnItemClickListener(new Adapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {

            }
        });

        super.onViewCreated(view, savedInstanceState);
    }


   /* public void onBackPressed(){
        if(backPressedTime + 2000 > System.currentTimeMillis()){
            backToast.cancel();
            super.onBackPressed();
            return;
        } else{
            backToast = Toast.makeText(getActivity(), "Press back again to exit", Toast.LENGTH_SHORT);
            backToast.show();
        }

        backPressedTime = System.currentTimeMillis();
    }*/
}
