package com.company;

import java.util.Comparator;

public class ComparadorPorGenero implements Comparator<Musica> {
    public int compare(Musica musica1, Musica musica2) {
        return musica1.getGeneroMusical().compareTo(musica2.getGeneroMusical());
    }
}
