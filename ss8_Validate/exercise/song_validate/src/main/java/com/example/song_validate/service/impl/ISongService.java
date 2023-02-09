package com.example.song_validate.service.impl;

import com.example.song_validate.model.Song;

import java.util.List;

public interface ISongService {
    List<Song> findAll();

    Song add(Song song);
}
