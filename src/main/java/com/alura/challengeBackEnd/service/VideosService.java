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
        return videosRepository.findAll()
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
        Video videoNovo = new Video(getVideosById(id));
        videoNovo.setUrl(videoDTO.url());
        videoNovo.setDescricao(videoDTO.descricao());
        videoNovo.setTitulo(videoDTO.titulo());
        return new VideoDTO(videosRepository.save(videoNovo));
    }

    public void deletaVideoPorId(Long id) {
        getVideosById(id);
        videosRepository.deleteById(id);
    }
}
