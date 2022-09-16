package com.company;

import java.util.Comparator;

public class ComparadorPorNombreCancion implements Comparator<Musica> {
    public int compare(Musica musica1, Musica musica2){
        return musica1.getNombreDeCancion().compareTo(musica2.getNombreDeCancion());
    }
}
