package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Musica musica1 = new Musica("Pop", "Selena Gomez", "Lose", "Lose you", 4, 200);
        Musica musica2 = new Musica("Electronica", "Avicci", "Av", "Levels", 3, 100);
        Musica musica3 = new Musica("Bachata", "Romeo Santos", "Rose", "Mía", 3.6, 150);

        ServicioMusica catalogoDeMusica = new ServicioMusica();

            catalogoDeMusica.agregarMusica(musica1);
            catalogoDeMusica.agregarMusica(musica2);
            catalogoDeMusica.agregarMusica(musica3);

        catalogoDeMusica.visualizarCatalogoPorPopularidad();
        catalogoDeMusica.visualizarCatalogoPorGenero();
        catalogoDeMusica.visualizarCatalogoPorArtista();
        catalogoDeMusica.visualizarCatalogoPorAlbum();
        catalogoDeMusica.visualizarCatalogoPorNombreCancion();
        catalogoDeMusica.visualizarCatalogoPorDuracion();
    }
}
