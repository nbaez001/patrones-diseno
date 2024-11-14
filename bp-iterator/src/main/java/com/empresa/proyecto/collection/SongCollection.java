package com.empresa.proyecto.collection;

import com.empresa.proyecto.iterator.SongIterator;

public interface SongCollection {
    SongIterator createIterator();
}
