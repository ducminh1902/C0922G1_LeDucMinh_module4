package com.example.song_validate.service;

import com.example.song_validate.model.Song;
import com.example.song_validate.reponsitory.ISongReponsitory;
import com.example.song_validate.service.impl.ISongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SongService implements ISongService {

    @Autowired
    private ISongReponsitory songReponsitory;



    @Override
    public Page<Song> findAll(Pageable pageable) {
        return songReponsitory.findAll(pageable);
    }

    @Override
    public Song add(Song song) {
        return songReponsitory.save(song);
    }

    @Override
    public Optional<Song> findById(int id) {
        return songReponsitory.findById(id);
    }
}
