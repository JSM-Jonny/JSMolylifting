package com.example.jsmolylifting;

import android.util.Log;

public class Item2 {
    private int mImageResource;
    private String mText1;
    private String mText2;
    private int mImageResourceA;
    private String mText1A;
    private String mText2A;
    private String mUrl;
    private String mUrl2;

    public Item2(int imageResource, String text1, String text2, int imageResourceA, String text1A, String text2A, String url, String url2){
        mImageResource = imageResource;
        mText1 = text1;
        mText2 = text2;
        mImageResourceA = imageResourceA;
        mText1A = text1A;
        mText2A = text2A;
        mUrl = url;
        mUrl2 = url2;

    }

    public void changeText1(String text){
        mText1 = text;
        Log.d("method change text 2", "method has been run 2");
        Log.d("content of text 2", text);
    }

    public void changeText2(String text){
        mText1A = text;
        Log.d("method change text 2A", "method has been run 2A");
        Log.d("content of text 2A", text);
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

    public int getmImageResourceA(){
        return mImageResourceA;
    }

    public String getmText1A(){
        return mText1A;
    }

    public String getmText2A(){
        return mText2A;
    }

    public String getmUrl(){
        return mUrl;
    }

    public String getmUrl2(){
        return mUrl2;
    }
}
