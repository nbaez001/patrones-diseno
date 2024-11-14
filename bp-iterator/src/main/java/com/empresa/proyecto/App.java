package com.empresa.proyecto;

import com.empresa.proyecto.collection.Playlist;
import com.empresa.proyecto.iterator.SongIterator;
import com.empresa.proyecto.model.Song;

public class App {
    public static void main(String[] args) {
        Playlist playlist = new Playlist(3);
        playlist.addSong(new Song("Yesterday", "The Beatles"));
        playlist.addSong(new Song("Imagine", "John Lennon"));
        playlist.addSong(new Song("Bohemian Rhapsody", "Queen"));

        SongIterator iterator = playlist.createIterator();
        while (iterator.hasNext()) {
            Song song = iterator.next();
            System.out.println(song);
        }
    }
}
