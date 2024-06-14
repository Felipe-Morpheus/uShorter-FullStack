package br.com.vulpicula.uShorter.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class UrlClick {
    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime horarioClique;

    @ManyToOne
    private Url url;
    // * Construtor padrão da classe UrlClick.
    public UrlClick() {
    }
    // * Construtor com parâmetros da classe UrlClick.
    public UrlClick(Long id, LocalDateTime horarioClique, Url url) {
        this.id = id;
        this.horarioClique = horarioClique;
        this.url = url;
    }
    // Getters e setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getHorarioClique() {
        return horarioClique;
    }

    public void setHorarioClique(LocalDateTime horarioClique) {
        this.horarioClique = horarioClique;
    }

    public Url getUrl() {
        return url;
    }

    public void setUrl(Url url) {
        this.url = url;
    }


}
