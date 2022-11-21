package com.alura.challengeBackEnd.domain.model;

import com.alura.challengeBackEnd.rest.dto.VideoDTO;
import org.hibernate.validator.constraints.URL;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import java.util.Objects;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
public class Video {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    @NotBlank
    private String titulo;
    @NotBlank
    private String descricao;
    @NotBlank
    @URL
    private String url;

    public Video() {
    }

    public Video(VideoDTO videoDTO) {
        this.titulo = videoDTO.titulo();
        this.descricao = videoDTO.descricao();
        this.url = videoDTO.url();
    }

    public Video(String titulo, String descricao, String url) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.url = url;
    }

    public Video(Long id, String titulo, String descricao, String url) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.url = url;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Video video = (Video) o;
        return Objects.equals(id, video.id) && Objects.equals(titulo, video.titulo) && Objects.equals(descricao, video.descricao) && Objects.equals(url, video.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, titulo, descricao, url);
    }
}
