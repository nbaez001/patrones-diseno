package com.empresa.proyecto.iterator;

import com.empresa.proyecto.collection.Playlist;
import com.empresa.proyecto.model.Song;

public class PlaylistIterator implements SongIterator {
    private Song[] cache;
    private int position = 0;

    public PlaylistIterator(Playlist playlist) {
        this.cache = playlist.getSongs();
    }

    @Override
    public boolean hasNext() {
        return position < cache.length && cache[position] != null;
    }

    @Override
    public Song next() {
        return cache[position++];
    }
}
