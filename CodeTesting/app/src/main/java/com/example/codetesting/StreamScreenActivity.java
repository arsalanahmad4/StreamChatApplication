package com.example.codetesting;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class StreamScreenActivity extends AppCompatActivity {

    VideoView vid;
    MediaController m;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stream_screen);

        vid = findViewById(R.id.videoView);

    }

    public void playVideo(View v) {
//        m = new MediaController(this);
//        vid.setMediaController(m);
//
//        String path = "android.resource://com.aasemjs.videoplaydemo/"+R.raw.forest;
//
//        Uri u = Uri.parse(path);
//
//        vid.setVideoURI(u);
//
//        vid.start();

    }

}
