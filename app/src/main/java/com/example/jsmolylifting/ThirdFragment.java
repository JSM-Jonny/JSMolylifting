package com.example.jsmolylifting;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;

public class ThirdFragment extends Fragment {
    View view;
    Button browsertest;
    private Adapter2 mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private ArrayList<Item2> mItemList = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.kitpage, container, false);
        //browsertest = MyView.findViewById(R.id.btn_browser);
        //browsertest.setOnClickListener(new View.OnClickListener(){

            /*@Override
            public void onClick(View v) {
                browser1(v);
            }
        });*/
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        RecyclerView mRecyclerView = view.findViewById(R.id.recyclerView);
        /* creating the cards */
        mItemList = new ArrayList<>();
        mItemList.add(new Item2(R.drawable.dumbbell, "Reebok Legacy Lifter", "£150", R.drawable.dumbbell, "Nike Romaleo 3xd", "£170", "https://www.reebok.co.uk/reebok-legacy-lifter/BD1793.html", "\"https://www.nike.com/gb/t/romaleos-3-xd-training-shoe-JC5JSR\""));
        //mItemList.add(new Item2(R.drawable.dumbbell, "Adidas Powerlift 3", "£80", R.drawable.dumbbell, "Adidas AdiPower", "£170"));
        //mItemList.add(new Item2(R.drawable.dumbbell, "SBD", "£70", R.drawable.dumbbell, "Strength Shop", "£40"));
        //mItemList.add(new Item2(R.drawable.dumbbell, "Wrist Wraps", "£10", R.drawable.dumbbell, "Thumb Tape", "£6"));

        mLayoutManager = new LinearLayoutManager(getActivity());
        mAdapter = new Adapter2(mItemList);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);



        super.onViewCreated(view, savedInstanceState);
    }

    public void browser1(View view, String url){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(browserIntent);
    }

    public void changeItem(int position, String text, ArrayList<Item2> ItemList){
        ItemList.get(position).changeText1(text);
        mAdapter.notifyItemChanged(position);
    }

    public void changeItem2(int position, String text, ArrayList<Item2> ItemList){
        ItemList.get(position).changeText2(text);
        mAdapter.notifyItemChanged(position);
    }
}
