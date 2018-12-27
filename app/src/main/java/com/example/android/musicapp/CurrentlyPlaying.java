package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class CurrentlyPlaying extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currently_playing);

        // Get information about the song
        Bundle information = getIntent().getExtras();

        // Get extras on song and artist name and find the view ID of the Views where this info
        // should be displayed
        final String currentTrackTitle = information.getString("trackTitle");
        TextView trackView = (TextView) findViewById(R.id.current_track_title);

        final String currentAuthorName = information.getString("authorName");
        TextView authorView = (TextView) findViewById(R.id.current_track_creator);

        // Insert the text from extras to the particular Views
        trackView.setText(currentTrackTitle);
        authorView.setText(currentAuthorName);

        // Make Toast message for rewinding
        ImageView rewind = findViewById(R.id.rewind_icon);
        rewind.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast.makeText(getBaseContext(), "Rewind: " + currentAuthorName + " - " +
                        currentTrackTitle, Toast.LENGTH_SHORT ).show();
            }
        });

        // Make Toast message for now playing track
        ImageView playing = findViewById(R.id.play_icon);
        playing.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast.makeText(getBaseContext(), "Now playing: " + currentAuthorName + " - " +
                        currentTrackTitle, Toast.LENGTH_SHORT ).show();
            }
        });

        // Make Toast message for pausing the track
        ImageView pause = findViewById(R.id.pause_icon);
        pause.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast.makeText(getBaseContext(), "Pause: " + currentAuthorName + " - " +
                        currentTrackTitle, Toast.LENGTH_SHORT ).show();
            }
        });

        // Make Toast message for stopping the track
        ImageView stop = findViewById(R.id.stop_icon);
        stop.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast.makeText(getBaseContext(), "Stop: " + currentAuthorName + " - " +
                        currentTrackTitle, Toast.LENGTH_SHORT ).show();
            }
        });

        // Make Toast message for forwarding the track
        ImageView forward = findViewById(R.id.forward_icon);
        forward.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast.makeText(getBaseContext(), "Forward: " + currentAuthorName + " - " +
                        currentTrackTitle, Toast.LENGTH_SHORT ).show();
            }
        });
    }
}

