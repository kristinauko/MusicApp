package com.example.android.musicapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Set;

public class SoundsAdapter extends ArrayAdapter<TrackEntry> {

    public SoundsAdapter(Context context, ArrayList<TrackEntry> entry) {
        // Initialized the ArrayAdapter's internal storage for the context and the list.
        super(context, 0, entry);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.items_list, parent, false);

        }

        // Get the TrackEntry object located at the specific position in the list
        final TrackEntry currentTrackEntry = getItem(position);

        // Find the TextView in the items_list.xml layout with the ID creator_name
        final TextView authorTextView = (TextView) listItemView.findViewById(R.id.creator_name);

        // Get the author name from the current TrackEntry object and set this text on the name TextView
        authorTextView.setText(currentTrackEntry.getAuthorName());

        // Find the TextView in the items_list.xml layout with the ID track_title
        TextView titleTextView = (TextView) listItemView.findViewById(R.id.track_title);

        // Get the track title from the current TrackEntry object and set this text on the name TextView
        titleTextView.setText(currentTrackEntry.getTrackTitle());

        // Set OnClickListener on the list view items, it will be used to pass the track title and artist name
        // to CurrentlyPlaying.class
        listItemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent currentlyPlayingIntent = new Intent(getContext(), CurrentlyPlaying.class);
                currentlyPlayingIntent.putExtra("authorName", currentTrackEntry.getAuthorName());
                currentlyPlayingIntent.putExtra("trackTitle", currentTrackEntry.getTrackTitle());
                getContext().startActivity(currentlyPlayingIntent);
            }
        });

        // Return the whole list item layout (2 TextViews), so that it can be shown in the ListView
        return listItemView;
    }
}
