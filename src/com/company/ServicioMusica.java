package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class ServicioMusica {
    private ArrayList<Musica> catalogoMusica = new ArrayList<Musica>();

    public void agregarMusica(Musica musica) {
        catalogoMusica.add(musica);
    }

    public void visualizarCatalogoPorPopularidad() {
        Collections.sort(catalogoMusica, new ComparadorPorPopularidad());
        System.out.println("Catálogo de musica ordenado por popularidad"+ "\n" + catalogoMusica);
    }

    public void visualizarCatalogoPorGenero() {
        Collections.sort(catalogoMusica, new ComparadorPorGenero());
        System.out.println(catalogoMusica);
    }

    public void visualizarCatalogoPorArtista() {
        Collections.sort(catalogoMusica, new ComparadorPorArtista());
        System.out.println(catalogoMusica);
    }

    public void visualizarCatalogoPorAlbum() {
        Collections.sort(catalogoMusica, new ComparadorPorAlbum());
        System.out.println(catalogoMusica);
    }

    public void visualizarCatalogoPorNombreCancion() {
        Collections.sort(catalogoMusica, new ComparadorPorNombreCancion());
        System.out.println(catalogoMusica);
    }

    public void visualizarCatalogoPorDuracion() {
        Collections.sort(catalogoMusica, new ComparadorPorDuracion());
        System.out.println(catalogoMusica);
    }

    @Override
    public String toString() {
        return "catalogoMusica: " + "\n" + catalogoMusica;
    }
}
