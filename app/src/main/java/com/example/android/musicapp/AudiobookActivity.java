package com.example.android.musicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class AudiobookActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        // Create a list of audiobooks
        ArrayList<TrackEntry> entry = new ArrayList<TrackEntry>();
        entry.add(new TrackEntry("Anna Yen", "Sophia of Silicon Valley"));
        entry.add(new TrackEntry("Arthur Winter", "Smart Food: Diet and Nutrition for Maximum Brain Power"));
        entry.add(new TrackEntry("J. A. Baker", "The Peregrine "));
        entry.add(new TrackEntry("Dan Koeppel", "Banana: The Fate of the Fruit That Changed the World"));
        entry.add(new TrackEntry("Dan Egan", "The Death and Life of the Great Lakes"));
        entry.add(new TrackEntry("Gillian Anderson ", "We: A Manifesto for Women Everywhere"));
        entry.add(new TrackEntry("Michael Pollan", "How to Change Your Mind: The New Science of Psychedelics"));
        entry.add(new TrackEntry("Alice Feenay", "Sometimes I Lie"));
        entry.add(new TrackEntry("Min Jin Lee", "Pachinko"));
        entry.add(new TrackEntry("Svetlana Alexievich", "War's Unwomanly Face"));

        // Create an {@link SoundsAdapter}, data source is a list of {@link entry}s.
        // The Adapter creates lists each item in the list.
        SoundsAdapter adapter = new SoundsAdapter(this, entry);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list_tracks);

        // Make the ListView use the SoundsAdapter. It will display list items for each audiobook track in the list.
        listView.setAdapter(adapter);
    }
}

