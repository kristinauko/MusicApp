package com.example.android.musicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PodcastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        // List of podcasts
        ArrayList<TrackEntry> entry = new ArrayList<TrackEntry>();
        entry.add(new TrackEntry("Long Now Seminars", "Benjamin Grant Overview: Earth and Civilization in the Macroscope"));
        entry.add(new TrackEntry("Long Now Seminars", "Kishore Mahbubani: Has the West Lost it? Can Asia Save It?"));
        entry.add(new TrackEntry("Long Now Seminars", "Steven Pinker: A New Enlightenment"));
        entry.add(new TrackEntry("Long Now Seminars", "Michael Frachetti: Open Source Civilization and the Unexpected Origins of Silk Road"));
        entry.add(new TrackEntry("Long Now Seminars", "Charles C. Mann: The Wizard and the Prophet"));
        entry.add(new TrackEntry("Long Now Seminars", "Elena Bennett: Seeds of a Good Anthropocene"));
        entry.add(new TrackEntry("Long Now Seminars", "Renee Wegrzyn: Engineering Gene Safety"));
        entry.add(new TrackEntry("Long Now Seminars", "David Grinspoon: Earth in Human Hands"));
        entry.add(new TrackEntry("Long Now Seminars", "Nick Case: Seeing Whole Systems"));
        entry.add(new TrackEntry("Long Now Seminars", "Carolyn Porco: Searching for Life in the Solar System"));

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