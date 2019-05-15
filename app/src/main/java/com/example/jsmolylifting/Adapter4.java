package com.example.jsmolylifting;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;


public class Adapter4 extends RecyclerView.Adapter<Adapter4.ExampleViewHolder> {
    private ArrayList<Item4> mList;

    public static class ExampleViewHolder extends RecyclerView.ViewHolder {
        public TextView mTextView1;
        public TextView mTextView2;

        public ExampleViewHolder(View itemView) {
            super(itemView);
            mTextView1 = itemView.findViewById(R.id.textView);
            mTextView2 = itemView.findViewById(R.id.textView2);
        }
    }

    public Adapter4(ArrayList<Item4> itemlist){
        mList = itemlist;
    }

    @NonNull
    @Override
    public ExampleViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.workoutcard, viewGroup, false);
        ExampleViewHolder evh = new ExampleViewHolder(v);
        return evh;
    }

    @Override
    public void onBindViewHolder(@NonNull ExampleViewHolder exampleViewHolder, int i) {
        Item4 currentItem = mList.get(i);
        if()
        exampleViewHolder.mTextView1.setText();
        exampleViewHolder.mTextView2.setText();
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }


}
