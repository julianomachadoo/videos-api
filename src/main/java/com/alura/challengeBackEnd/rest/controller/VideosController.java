package com.alura.challengeBackEnd.rest.controller;

import com.alura.challengeBackEnd.domain.model.Videos;
import com.alura.challengeBackEnd.service.VideosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/videos")
public class VideosController {

    @Autowired
    private VideosService videosService;

    @GetMapping
    @ResponseStatus(OK)
    public List<Videos> getVideos() {
        return videosService.getVideos();
    }

}
