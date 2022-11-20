package com.alura.challengeBackEnd.service;

import com.alura.challengeBackEnd.domain.model.Video;
import com.alura.challengeBackEnd.domain.repository.VideosRepository;
import com.alura.challengeBackEnd.exception.DataNotFoundException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;

@SpringBootTest
class VideosServiceTest {

//    public static final long ID = 1L;
//    private VideosService videosService;
//
//    @Mock
//    private VideosRepository videosRepository;
//
//    @BeforeEach
//    public void beforeEach() {
//        MockitoAnnotations.openMocks(this);
//        this.videosService = new VideosService(videosRepository);
//    }
//
//    @Test
//    void listarVideosComSucesso() {
//        List<Video> videos = videos();
//        when(videosRepository.findAll()).thenReturn(videos);
//
//        List<Video> videosTeste = videosService.getVideos();
//
//        assertNotNull(videosTeste);
//        assertEquals(3, videosTeste.size());
//
//        assertEquals(ID,videosTeste.get(0).getId());
//        assertEquals("Teste1",videosTeste.get(0).getTitulo());
//        assertEquals("Descrição de teste 1",videosTeste.get(0).getDescricao());
//        assertEquals("https://www.youtube.com/watch?v=StKAATHjwA0&ab_channel=GameV",videos.get(0).getUrl());
//
//        assertEquals(2L,videosTeste.get(1).getId());
//        assertEquals("Teste2",videosTeste.get(1).getTitulo());
//        assertEquals("Descrição de teste 2",videosTeste.get(1).getDescricao());
//        assertEquals("https://www.youtube.com/watch?v=XL0GkPWeYvY&ab_channel=Shirrako",videos.get(1).getUrl());
//
//        assertEquals(3L,videosTeste.get(2).getId());
//        assertEquals("Teste3",videosTeste.get(2).getTitulo());
//        assertEquals("Descrição de teste 3",videosTeste.get(2).getDescricao());
//        assertEquals("https://www.youtube.com/watch?v=FYNL6XHO5ZQ&ab_channel=MeteoroBrasil",videos.get(2).getUrl());
//    }
//
//    @Test
//    void getVideosById() {
//        List<Video> videos = videos();
//        when(videosRepository.findById(ID)).thenReturn(Optional.ofNullable(videos.get((int) ID - 1)));
//
//        Video videoTeste = videosService.getVideosById(ID);
//
//        assertNotNull(videoTeste);
//        assertEquals(ID, videoTeste.getId());
//        assertEquals("Teste1", videoTeste.getTitulo());
//        assertEquals("Descrição de teste 1", videoTeste.getDescricao());
//        assertEquals("https://www.youtube.com/watch?v=StKAATHjwA0&ab_channel=GameV", videoTeste.getUrl());
//    }
//
//    @Test
//    void getVideosByIdComExcecao() {
//        when(videosRepository.findById(anyLong())).thenThrow(DataNotFoundException.class);
//        try {
//            videosService.getVideosById(150L);
//            fail("Não lançou exceção");
//        } catch (Exception e) {
////            assertEquals("Video não encontrado", e.getMessage());
//        }
//    }
//
//    @Test
//    void postVideoComSucesso() {
//        Video videoTeste = videosService.postVideo(
//                new Video("TesteNovo", "Descrição de teste novo", "https://www.youtube.com/watch?v=IdA9000t808&ab_channel=Shirrako"));
//
//        assertNotNull(videoTeste);
//        assertEquals(1L, videoTeste.getId());
//        assertEquals("TesteNovo", videoTeste.getTitulo());
//        assertEquals("Descrição de teste novo", videoTeste.getDescricao());
//        assertEquals("https://www.youtube.com/watch?v=IdA9000t808&ab_channel=Shirrako", videoTeste.getUrl());
//        assertEquals(Video.class, videoTeste.getClass());
//    }
//
//    @Test
//    void atualizaVideo() {
//    }
//
//    @Test
//    void deletaVideoPorId() {
//    }
//
//    private List<Video> videos() {
//        List<Video> videos = new ArrayList<>();
//
//        Video videos1 = new Video(ID, "Teste1", "Descrição de teste 1", "https://www.youtube.com/watch?v=StKAATHjwA0&ab_channel=GameV");
//        Video videos2 = new Video(2L, "Teste2", "Descrição de teste 2", "https://www.youtube.com/watch?v=XL0GkPWeYvY&ab_channel=Shirrako");
//        Video videos3 = new Video(3L, "Teste3", "Descrição de teste 3", "https://www.youtube.com/watch?v=FYNL6XHO5ZQ&ab_channel=MeteoroBrasil");
//
//        videos.addAll(Arrays.asList(videos1, videos2, videos3));
//        return videos;
//    }
}