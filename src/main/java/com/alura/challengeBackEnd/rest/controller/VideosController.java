package com.alura.challengeBackEnd.rest.controller;

import com.alura.challengeBackEnd.rest.dto.VideoDTO;
import com.alura.challengeBackEnd.service.VideosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import static org.springframework.http.HttpStatus.*;

@RestController
@RequestMapping("/videos")
public class VideosController {

    @Autowired
    private VideosService videosService;

    @GetMapping
    @ResponseStatus(OK)
    public Page<VideoDTO> getVideos(@PageableDefault Pageable paginacao) {
        return videosService.getVideos(paginacao);
    }

    @GetMapping("{id}")
    @ResponseStatus(OK)
    public VideoDTO getVideosById (@PathVariable Long id) {
        return videosService.getVideosById(id);
    }

    @PostMapping
    @ResponseStatus(CREATED)
    @Transactional
    public VideoDTO postVideo (@RequestBody @Valid VideoDTO videoDTO) {
        return videosService.postVideo(videoDTO);
    }

    @PutMapping("{id}")
    @ResponseStatus(OK)
    @Transactional
    public VideoDTO atualizaVideo (@PathVariable Long id, @RequestBody VideoDTO VideoDTO) {
        return videosService.atualizaVideo(id, VideoDTO);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(NO_CONTENT)
    @Transactional
    public void deletaVideoPorId (@PathVariable Long id) {
        videosService.deletaVideoPorId(id);
    }
}
