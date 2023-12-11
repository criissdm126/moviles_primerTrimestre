package com.example.gridviewpersonalizado;

public class Ejemplo {

    private  String titulo;
    private  String subtitulo;
    private  String urlFoto;
    private  Integer numeroEjemplo;

    public Ejemplo(){

    }

    public Ejemplo(String titulo, String subtitulo, String urlFoto, Integer numeroEjemplo) {
        this.titulo = titulo;
        this.subtitulo = subtitulo;
        this.urlFoto = urlFoto;
        this.numeroEjemplo = numeroEjemplo;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSubtitulo() {
        return subtitulo;
    }

    public void setSubtitulo(String subtitulo) {
        this.subtitulo = subtitulo;
    }

    public String getUrlFoto() {
        return urlFoto;
    }

    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }

    public Integer getNumeroEjemplo() {
        return numeroEjemplo;
    }

    public void setNumeroEjemplo(Integer numeroEjemplo) {
        this.numeroEjemplo = numeroEjemplo;
    }
}
