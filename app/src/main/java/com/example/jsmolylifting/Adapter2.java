package com.example.jsmolylifting;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;


public class Adapter2 extends RecyclerView.Adapter<Adapter2.ExampleViewHolder> {
    private ArrayList<Item2> mList;
    private OnItemClickListener mListener;
    private OnItemClickListener imageListener;

    public interface OnItemClickListener{
        void onItemClick(View view);
        void onItemClick2(View view);
    }

    public void setOnItemClickListener(OnItemClickListener listener){
        mListener = listener;
    }

    public static class ExampleViewHolder extends RecyclerView.ViewHolder {
        public ImageView mImageView;
        public TextView mTextView1;
        public TextView mTextView2;
        public ImageView mImageViewA;
        public TextView mTextView1A;
        public TextView mTextView2A;

        public ExampleViewHolder(View itemView, final OnItemClickListener listener) {
            super(itemView);
            mImageView = itemView.findViewById(R.id.imageView);
            mTextView1 = itemView.findViewById(R.id.textView);
            mTextView2 = itemView.findViewById(R.id.textView2);
            mImageViewA = itemView.findViewById(R.id.imageView2);
            mTextView1A = itemView.findViewById(R.id.textViewA);
            mTextView2A = itemView.findViewById(R.id.textView2A);

            mImageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });

            mImageViewA.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {

                }
            });
        }
    }

    public Adapter2(ArrayList<Item2> itemlist){
        mList = itemlist;
    }

    @NonNull
    @Override
    public ExampleViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.kitcard, viewGroup, false);
        ExampleViewHolder evh = new ExampleViewHolder(v, mListener);
        return evh;
    }

    @Override
    public void onBindViewHolder(@NonNull ExampleViewHolder exampleViewHolder, int i) {
        Item2 currentItem = mList.get(i);
        exampleViewHolder.mImageView.setImageResource(currentItem.getmImageResource());
        exampleViewHolder.mTextView1.setText(currentItem.getmText1());
        exampleViewHolder.mTextView2.setText(currentItem.getmText2());

    }

    @Override
    public int getItemCount() {
        return mList.size();
    }


}
