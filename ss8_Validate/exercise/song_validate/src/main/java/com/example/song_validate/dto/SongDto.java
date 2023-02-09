package com.example.song_validate.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

public class SongDto {

    private int id;
    @NotEmpty
    @Max(800)
    @Pattern(regexp = "^[a-z ,A-Z0-9]+$")
    private String name;

    @NotEmpty
    @Max(300)
    @Pattern(regexp ="^[a-z ,A-Z0-9]+$" )
    private String artist;

    @NotEmpty
    @Max(1000)
    @Pattern(regexp ="^[a-z ,A-Z0-9]+$" )
    private String type;

    public SongDto() {
    }

    public SongDto(int id, String name, String artist, String type) {
        this.id = id;
        this.name = name;
        this.artist = artist;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
