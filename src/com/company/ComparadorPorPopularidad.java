package com.company;


import java.util.Comparator;

public class ComparadorPorPopularidad implements Comparator<Musica> {

    public int compare(Musica musica1, Musica musica2) {
        return -(musica1.getPopularidad() - musica2.getPopularidad());
    }
}
