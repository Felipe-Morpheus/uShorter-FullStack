package br.com.vulpicula.uShorter.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class Url {

    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String urlOriginal;
    private String urlCurta;
    private LocalDateTime dataCriacao;

    // * Construtor padrão da classe Url.
    public Url() {
    }
     //* Construtor com parâmetros da classe Url.
    public Url(Long id, String urlOriginal, String urlCurta, LocalDateTime dataCriacao) {
        this.id = id;
        this.urlOriginal = urlOriginal;
        this.urlCurta = urlCurta;
        this.dataCriacao = dataCriacao;
    }
    // Getters e setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrlOriginal() {
        return urlOriginal;
    }

    public void setUrlOriginal(String urlOriginal) {
        this.urlOriginal = urlOriginal;
    }

    public String getUrlCurta() {
        return urlCurta;
    }

    public void setUrlCurta(String urlCurta) {
        this.urlCurta = urlCurta;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }
}
