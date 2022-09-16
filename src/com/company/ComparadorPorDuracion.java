package com.company;

import java.util.Comparator;

public class ComparadorPorDuracion implements Comparator<Musica> {
    public int compare(Musica musica1, Musica musica2) {
        return (int)(-(musica1.getDuracionDeCancion()*100-musica2.getDuracionDeCancion()*100));
    }
}
