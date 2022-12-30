package com.alura.challengeBackEnd.service;

import com.alura.challengeBackEnd.domain.model.Video;
import com.alura.challengeBackEnd.domain.repository.VideosRepository;
import com.alura.challengeBackEnd.exception.DataNotFoundException;
import com.alura.challengeBackEnd.rest.dto.VideoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class VideosService {

    @Autowired
    private VideosRepository videosRepository;

    public VideosService(VideosRepository videosRepository) {
        this.videosRepository = videosRepository;
    }

    public Page<VideoDTO> getVideos(Pageable paginacao) {
            return videosRepository.findAllByAtivoTrue(paginacao).map(VideoDTO::new);
    }

    public VideoDTO getVideosById(Long id) {
        return videosRepository.findById(id).map(VideoDTO::new)
                .orElseThrow(() -> new DataNotFoundException("Video não encontrado"));
    }

    public VideoDTO postVideo(VideoDTO videoDTO) {
        return new VideoDTO(videosRepository.save(new Video(videoDTO)));
    }

    public VideoDTO atualizaVideo(Long id, VideoDTO videoDTO) {
        Optional<Video> video = videosRepository.findById(id);
        if(video.isPresent()) {
            if (videoDTO.url() != null) video.get().setUrl(videoDTO.url());
            if (videoDTO.descricao() != null) video.get().setDescricao(videoDTO.descricao());
            if (videoDTO.titulo() != null) video.get().setTitulo(videoDTO.titulo());
            return new VideoDTO(video.get());
        }
        else throw new DataNotFoundException("Video não encontrado");
    }

    public void deletaVideoPorId(Long id) {
        Video video = videosRepository.getReferenceById(id);
        video.setAtivo(false);
    }
}
