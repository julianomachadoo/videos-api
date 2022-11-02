package com.alura.challengeBackEnd.rest.controller;

import com.alura.challengeBackEnd.domain.model.Video;
import com.alura.challengeBackEnd.service.VideosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.*;

@RestController
@RequestMapping("/videos")
public class VideosController {

    @Autowired
    private VideosService videosService;

    @GetMapping
    @ResponseStatus(OK)
    public List<Video> getVideos() {
        return videosService.getVideos();
    }

    @GetMapping("{id}")
    @ResponseStatus(OK)
    public Video getVideosById (@PathVariable Long id) {
        return videosService.getVideosById(id);
    }

    @PostMapping
    @ResponseStatus(CREATED)
    public Video postVideo (@RequestBody Video video) {
        return videosService.postVideo(video);
    }

    @PutMapping("{id}")
    @ResponseStatus(OK)
    public Video atualizaVideo (@PathVariable Long id, @RequestBody Video videos) {
        return videosService.atualizaVideo(id, videos);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(NO_CONTENT)
    public void deletaVideoPorId (@PathVariable Long id) {
        videosService.deletaVideoPorId(id);
    }
}
