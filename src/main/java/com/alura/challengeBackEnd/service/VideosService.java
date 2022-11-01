package com.alura.challengeBackEnd.service;

import com.alura.challengeBackEnd.domain.model.Videos;
import com.alura.challengeBackEnd.domain.repository.VideosRepository;
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

    public List<Videos> getVideos() {
        return videosRepository.findAll();
    }
}
