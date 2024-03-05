package com.example.aula0403;

import java.time.LocalDate;

public class Musica {
    private String nome;
    private String artista;

    // LocalDateTime -> recomendado usar no banco  1993-06-11 13:34:45
    private LocalDate dataLancamento; // 1993-06-11


    public Musica() {}

    public Musica(String nome, String artista, LocalDate dataLancamento) {
        this.nome = nome;
        this.artista = artista;
        this.dataLancamento = dataLancamento;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public LocalDate getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(LocalDate dataLancamento) {
        this.dataLancamento = dataLancamento;
    }
}
