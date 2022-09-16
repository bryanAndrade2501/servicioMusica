package com.company;

import java.util.Comparator;

public class ComparadorPorArtista implements Comparator<Musica> {
    public int compare(Musica musica1, Musica musica2) {
        return musica1.getArtista().compareTo(musica2.getArtista());
    }
}
