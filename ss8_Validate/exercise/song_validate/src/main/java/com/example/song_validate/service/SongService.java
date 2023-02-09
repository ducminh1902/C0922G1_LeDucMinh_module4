package com.example.song_validate.service;

import com.example.song_validate.model.Song;
import com.example.song_validate.reponsitory.ISongReponsitory;
import com.example.song_validate.service.impl.ISongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongService implements ISongService {

    @Autowired
    private ISongReponsitory songReponsitory;



    @Override
    public List<Song> findAll() {
        return songReponsitory.findAll();
    }

    @Override
    public Song add(Song song) {
        return songReponsitory.save(song);
    }
}
