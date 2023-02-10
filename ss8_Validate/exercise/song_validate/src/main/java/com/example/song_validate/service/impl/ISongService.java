package com.example.song_validate.service.impl;

import com.example.song_validate.model.Song;

import java.util.List;
import java.util.Optional;

public interface ISongService {
    List<Song> findAll();

    Song add(Song song);

    Optional<Song> findById(int id);
}
