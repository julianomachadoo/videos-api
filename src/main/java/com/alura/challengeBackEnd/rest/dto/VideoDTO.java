package com.alura.challengeBackEnd.rest.dto;

import com.alura.challengeBackEnd.domain.model.Video;

import javax.validation.constraints.NotBlank;

public record VideoDTO (
        Long id,
        @NotBlank
        String titulo,
        @NotBlank
        String descricao,
        @NotBlank
        String url
){

        public VideoDTO (Video video) {
                this(video.getId(), video.getTitulo(), video.getDescricao(), video.getUrl());
        }
}
