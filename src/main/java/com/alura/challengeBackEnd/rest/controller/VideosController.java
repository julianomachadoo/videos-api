package com.alura.challengeBackEnd.rest.controller;

import com.alura.challengeBackEnd.rest.dto.VideoDTO;
import com.alura.challengeBackEnd.service.VideosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

import static org.springframework.http.HttpStatus.*;

@RestController
@RequestMapping("/videos")
public class VideosController {

    @Autowired
    private VideosService videosService;

    @GetMapping
    @ResponseStatus(OK)
    public List<VideoDTO> getVideos() {
        return videosService.getVideos();
    }

    @GetMapping("{id}")
    @ResponseStatus(OK)
    public VideoDTO getVideosById (@PathVariable Long id) {
        return videosService.getVideosById(id);
    }

    @PostMapping
    @ResponseStatus(CREATED)
    public VideoDTO postVideo (@RequestBody @Valid VideoDTO videoDTO) {
        return videosService.postVideo(videoDTO);
    }

    @PutMapping("{id}")
    @ResponseStatus(OK)
    public VideoDTO atualizaVideo (@PathVariable Long id, @RequestBody @Valid VideoDTO VideoDTO) {
        return videosService.atualizaVideo(id, VideoDTO);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(NO_CONTENT)
    public void deletaVideoPorId (@PathVariable Long id) {
        videosService.deletaVideoPorId(id);
    }
}
