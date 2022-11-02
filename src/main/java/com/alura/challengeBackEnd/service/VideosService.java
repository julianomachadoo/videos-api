package com.alura.challengeBackEnd.service;

import com.alura.challengeBackEnd.domain.model.Video;
import com.alura.challengeBackEnd.domain.repository.VideosRepository;
import com.alura.challengeBackEnd.exception.DataNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideosService {

    @Autowired
    private VideosRepository videosRepository;

    public VideosService(VideosRepository videosRepository) {
        this.videosRepository = videosRepository;
    }

    public List<Video> getVideos() {
        return videosRepository.findAll();
    }

    public Video getVideosById(Long id) {
        return videosRepository.findById(id)
                .orElseThrow(() -> new DataNotFoundException("Video não encontrado"));
    }

    public Video postVideo(Video video) {
        return videosRepository.save(video);
    }

    public Video atualizaVideo(Long id, Video videos) {
        Video videoNovo = getVideosById(id);
        videoNovo.setUrl(videos.getUrl());
        videoNovo.setDescricao(videos.getDescricao());
        videoNovo.setTitulo(videos.getTitulo());
        return videosRepository.save(videoNovo);
    }

    public void deletaVideoPorId(Long id) {
        getVideosById(id);
        videosRepository.deleteById(id);
    }
}
