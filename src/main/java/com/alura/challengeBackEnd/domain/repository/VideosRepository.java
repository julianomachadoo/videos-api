package com.alura.challengeBackEnd.domain.repository;

import com.alura.challengeBackEnd.domain.model.Video;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideosRepository extends JpaRepository<Video, Long> {
    Page<Video> findAllByAtivoTrue(Pageable paginacao);
}
