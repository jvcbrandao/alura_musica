package com.joaobrandao.alura_musica.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Artista {

    private String nome;
    private String nacionalidade;
    private Date dataDeNascimento;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    public Artista(String nome, String nacionalidade, Date dataDeNascimento) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(Date dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }
}
