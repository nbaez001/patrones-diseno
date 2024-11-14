package com.empresa.proyecto.collection;

import com.empresa.proyecto.iterator.PlaylistIterator;
import com.empresa.proyecto.iterator.SongIterator;
import com.empresa.proyecto.model.Song;

public class Playlist implements SongCollection {
    private Song[] songs;
    private int count = 0;

    public Playlist(int size) {
        songs = new Song[size];
    }

    public void addSong(Song song) {
        if (count < songs.length) {
            songs[count++] = song;
        }
    }

    @Override
    public SongIterator createIterator() {
        return new PlaylistIterator(this);
    }

    public Song[] getSongs() {
        return songs;
    }
}
