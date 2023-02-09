package com.example.song_validate.reponsitory;

import com.example.song_validate.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISongReponsitory extends JpaRepository<Song,Integer> {

}
