package com.example.jsmolylifting;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;

public class ThirdFragment extends Fragment {
    View view;
    private Adapter2 mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private ArrayList<Item2> mItemList = new ArrayList<>();

    @SuppressLint("ResourceType")
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.kitpage, container, false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        RecyclerView mRecyclerView = view.findViewById(R.id.recyclerView);
        /* creating the cards */
        mItemList = new ArrayList<>();
        mItemList.add(new Item2(R.drawable.reebok, "Reebok Legacy Lifter", "£149.95", "Perfect for lifters of any skill level.", "https://www.reebok.co.uk/reebok-legacy-lifter/BD1793.html"));
        mItemList.add(new Item2(R.drawable.adidas4, "Adidas Powerlift 4", "£74.95", "A great choice for beginners.", "https://www.adidas.co.uk/powerlift-4-shoes/BC0343.html"));
        mItemList.add(new Item2(R.drawable.singlet, "WBCM Singlet", "£90.00", "A requirement for most weightlifting competitions.", "https://eu.warmbody-coldmind.com/collections/mens/products/mens-compression-singlet?variant=19038172610649"));
        mItemList.add(new Item2(R.drawable.knee, "SBD", "£64.99", "High-End knee sleeve choice, best choice available.", "https://www.sbdapparel.com/product/sbd-knee-sleeves-winter-range-2018/"));
        mItemList.add(new Item2(R.drawable.straps, "Wrist Straps", "£15.00", "A good accessory for doing hang exercises.", "https://eu.warmbody-coldmind.com/collections/mens/products/weightlifting-wrist-straps-4-options?variant=19038171725913"));

        mLayoutManager = new LinearLayoutManager(getActivity());
        mAdapter = new Adapter2(mItemList);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);

        mAdapter.setOnItemClickListener(new Adapter2.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                Log.d("its being run", "WOOOOOOOOOW");
                String url = mItemList.get(position).getmUrl();
                browser(url);
            }
        });



        super.onViewCreated(view, savedInstanceState);
    }
    public void browser(String url){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(browserIntent);
    }
}
