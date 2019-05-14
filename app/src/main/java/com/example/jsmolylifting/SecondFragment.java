package com.example.jsmolylifting;


import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class SecondFragment extends Fragment {
    public View MyView;
    Button snatchbutton;
    VideoView videov;
    MediaController mediaC;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        MyView = inflater.inflate(R.layout.tutorialspage, container, false);
        snatchbutton = MyView.findViewById(R.id.snatchbtn);
        videov = MyView.findViewById(R.id.snatchView);
        snatchbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                videoplay(v);
            }
        });
        mediaC = new MediaController(getActivity());

        return MyView;
    }


    public void videoplay(View v){
        String videopath = "android.resource://com.example.jsmolylifting/"+R.raw.snatch;
        Uri uri = Uri.parse(videopath);
        videov.setVideoURI(uri);
        videov.setMediaController(mediaC);
        mediaC.setAnchorView(videov);
        videov.start();

    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}
