package com.ielts.reading.listening.writing.speaking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class VideoDetailView extends YouTubeBaseActivity {
    private YouTubePlayerView youTubePlayerView;

    private String videoid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_detail_view);
        setTitle("Watch Videos");
        youTubePlayerView = (YouTubePlayerView) findViewById(R.id.player);
        Intent intent = getIntent();
        videoid = intent.getStringExtra("videoId");
        String title= intent.getStringExtra("title");
        TextView titleVideo= (TextView)findViewById(R.id.titleVideo);

        titleVideo.setText(title);
        Toast.makeText(this, videoid, Toast.LENGTH_SHORT).show();

        youTubePlayerView.initialize("AIzaSyAhBTxMTNqY_sHQMAy4Y4vOF6-zlaThLlI", new YouTubePlayer.OnInitializedListener() {


            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {


                youTubePlayer.loadVideo(videoid);
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        });

    }


}