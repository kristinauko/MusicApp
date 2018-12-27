package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        //Find the View that shows the Music category
        TextView music = (TextView) findViewById(R.id.song_view);

        // Set OnClickListener on the View
        music.setOnClickListener(new View.OnClickListener() {
            @Override
            // The code in this method will be executed when the Music category is clicked on.
            public void onClick(View v) {

                // Create new intent to open MusicActivity
                Intent musicIntent = new Intent(MainActivity.this, MusicActivity.class);

                // Start new activity
                startActivity(musicIntent);
            }
        });

        // Find the View that shows the Podcast category
        TextView podcast = (TextView) findViewById(R.id.podcast_view);

        // Set click listener on the View
        podcast.setOnClickListener(new View.OnClickListener() {
            @Override
            // The code in this method will be executed when the Music category is clicked on.
            public void onClick(View view) {

                // Create new intent to open PodcastActivity
                Intent podcastIntent = new Intent(MainActivity.this, PodcastActivity.class);

                // Start new activity
                startActivity(podcastIntent);
            }
        });

        // Find the View that shows the Audiobooks category
        TextView audiobook = (TextView) findViewById(R.id.audiobook_view);

        // Set click listener on the View
        audiobook.setOnClickListener(new View.OnClickListener() {
            @Override
            // The code in this method will be executed when the Music category is clicked on.
            public void onClick(View v) {

                // Create new intent to open AudiobookActivity
                Intent audiobookIntent = new Intent(MainActivity.this, AudiobookActivity.class);

                // Start new activity
                startActivity(audiobookIntent);
            }
        });
    }
}