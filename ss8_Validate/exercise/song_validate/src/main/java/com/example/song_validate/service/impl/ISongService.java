package com.example.song_validate.service.impl;

import com.example.song_validate.model.Song;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface ISongService {
    Page<Song> findAll(Pageable pageable);

    Song add(Song song);

    Optional<Song> findById(int id);
}
