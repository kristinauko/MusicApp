package com.example.android.musicapp;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MusicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        // Create a list of music tracks
        ArrayList<TrackEntry> entry = new ArrayList<TrackEntry>();
        entry.add(new TrackEntry("Sofi Tukker ", "Awoo"));
        entry.add(new TrackEntry("Lana Del Rey", "A Star For Nick"));
        entry.add(new TrackEntry("Sofi Tukker ", "Matadora"));
        entry.add(new TrackEntry("Lana Del Rey", "Move"));
        entry.add(new TrackEntry("Happyendless", "Power Forever"));
        entry.add(new TrackEntry("Sofi Tukker ", "Moon Tattoo"));
        entry.add(new TrackEntry("Beach House", "Turtle Island"));
        entry.add(new TrackEntry("Sofi Tukker ", "Baby I'm A Queen"));
        entry.add(new TrackEntry("Beach House", "Astronaut"));
        entry.add(new TrackEntry("Lana Del Rey", "Mermaid Hotel"));

        // Create an {@link SoundsAdapter}, data source is a list of {@link entry}s.
        // The Adapter creates lists each item in the list.
        SoundsAdapter adapter = new SoundsAdapter(this, entry);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list_tracks);

        // Make the ListView use the SoundsAdapter. It will display list items for each track in the list.
        listView.setAdapter(adapter);
    }
}