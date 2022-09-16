package com.company;

public class Musica {
    private String generoMusical;
    private String artista;
    private String album;
    private String nombreDeCancion;
    private double duracionDeCancion;
    private int popularidad;

    public Musica(String generoMusical, String artista, String album, String nombreDeCancion, double duracionDeCancion, int popularidad) {
        this.generoMusical = generoMusical;
        this.artista = artista;
        this.album = album;
        this.nombreDeCancion = nombreDeCancion;
        this.duracionDeCancion = duracionDeCancion;
        this.popularidad = popularidad;
    }

    public int getPopularidad() {
        return popularidad;
    }

    public String getGeneroMusical() {
        return generoMusical;
    }

    public String getArtista() {
        return artista;
    }

    public String getAlbum() {
        return album;
    }

    public String getNombreDeCancion() {
        return nombreDeCancion;
    }

    public double getDuracionDeCancion() {
        return duracionDeCancion;
    }

    @Override
    public String toString() {
        return "Musica{" + generoMusical + ", " +
                artista + ", " +
                album + ", " +
                nombreDeCancion + ", " +
                duracionDeCancion + ", " +
                popularidad +
                '}' + "\n";
    }

}
