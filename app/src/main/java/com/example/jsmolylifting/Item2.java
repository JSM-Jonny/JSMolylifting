package com.example.jsmolylifting;

import android.util.Log;

public class Item2 {
    private int mImageResource;
    private String mText1;
    private String mText2;
    private String mText3;
    private String mUrl;


    public Item2(int imageResource, String text1, String text2, String text3, String url){
        mImageResource = imageResource;
        mText1 = text1;
        mText2 = text2;
        mText3 = text3;
        mUrl = url;


    }

    public void browserRun(String url){



        Log.d("method change run", "method has been run 2");
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

    public String getmUrl(){
        return mUrl;
    }


}
