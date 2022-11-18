package com.alura.challengeBackEnd.dto;

import com.alura.challengeBackEnd.domain.model.Video;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public record VideoDTO (
        @NotNull
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
