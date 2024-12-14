package com.joaobrandao.alura_musica.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Musica {

    private String cantor;

    private String titulo;

    private String idioma;

    private int anoDeLancamento;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    public Musica(String titulo, String cantor, String idioma, int anoDeLancamento) {
        this.cantor = cantor;
        this.titulo = titulo;
        this.idioma = idioma;
        this.anoDeLancamento = anoDeLancamento;
    }

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }
}
