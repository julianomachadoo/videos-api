package com.alura.challengeBackEnd.service;

import com.alura.challengeBackEnd.domain.model.Video;
import com.alura.challengeBackEnd.domain.repository.VideosRepository;
import com.alura.challengeBackEnd.rest.dto.VideoDTO;
import com.alura.challengeBackEnd.exception.DataNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class VideosService {

    @Autowired
    private VideosRepository videosRepository;

    public VideosService(VideosRepository videosRepository) {
        this.videosRepository = videosRepository;
    }

    public List<VideoDTO> getVideos() {
        return videosRepository.findAllByAtivoTrue()
                .stream().map(VideoDTO::new).collect(Collectors.toList());
    }

    public VideoDTO getVideosById(Long id) {
        return videosRepository.findById(id).map(VideoDTO::new)
                .orElseThrow(() -> new DataNotFoundException("Video não encontrado"));
    }

    public VideoDTO postVideo(VideoDTO videoDTO) {
        return new VideoDTO(videosRepository.save(new Video(videoDTO)));
    }

    public VideoDTO atualizaVideo(Long id, VideoDTO videoDTO) {
        Video video = videosRepository.getReferenceById(id);
        if (videoDTO.url() != null) video.setUrl(videoDTO.url());
        if (videoDTO.descricao() != null) video.setDescricao(videoDTO.descricao());
        if (videoDTO.titulo() != null) video.setTitulo(videoDTO.titulo());
        return new VideoDTO(video);
    }

    public void deletaVideoPorId(Long id) {
        Video video = videosRepository.getReferenceById(id);
        video.setAtivo(false);
    }
}
