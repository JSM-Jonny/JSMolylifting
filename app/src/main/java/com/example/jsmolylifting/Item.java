package com.example.jsmolylifting;

import android.util.Log;

public class Item {
    private int mImageResource;
    private String mText1;
    private String mText2;

    public Item(int imageResource, String text1, String text2){
        mImageResource = imageResource;
        mText1 = text1;
        mText2 = text2;
    }

    public void changeText1(String text){
        mText1 = text;
        Log.d("method change text", "method has been run");
        Log.d("content of text", text);
    }

    public int getmImageResource(){
        return mImageResource;
    }

    public String getmText1(){
        return mText1;
    }

    public String getmText2(){
        return mText2;
    }
}
