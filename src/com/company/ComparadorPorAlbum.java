package com.company;

import java.util.Comparator;

public class ComparadorPorAlbum implements Comparator<Musica> {
    public int compare(Musica musica1, Musica musica2) {
        return musica1.getAlbum().compareTo(musica2.getAlbum());
    }
}
