package com.example.jsmolylifting;

import android.util.Log;

public class Item {
    private int mImageResource;
    private String mText1;
    private String mText2;
    private String mText3;

    public Item(int imageResource, String text1, String text2, String id){
        mImageResource = imageResource;
        mText1 = text1;
        mText2 = text2;
        mText3 = id;
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

    public String getmText3(){
        return mText3;
    }
}
