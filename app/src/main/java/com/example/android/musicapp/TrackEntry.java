package com.example.android.musicapp;

// {@link TrackEntry} represents a single track entry.
public class TrackEntry {

    // Author
    private String mAuthorName;

    // Title
    private String mTrackTitle;

    // Create a new TrackEntry object.
    // @param authorName is the name of the author of the track
    // @param trackTitle is the corresponding name of the track
    public TrackEntry(String authorName, String trackTitle) {
        mAuthorName = authorName;
        mTrackTitle = trackTitle;
    }

    // Get the name of the author/band/writer
    public String getAuthorName() {
        return mAuthorName;
    }

    // Get the title of the track
    public String getTrackTitle() {
        return mTrackTitle;
    }
}
