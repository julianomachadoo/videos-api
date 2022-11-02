package com.alura.challengeBackEnd.domain.repository;

import com.alura.challengeBackEnd.domain.model.Video;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideosRepository extends JpaRepository<Video, Long> {
}
