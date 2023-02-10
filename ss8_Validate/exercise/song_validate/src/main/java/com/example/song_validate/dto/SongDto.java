package com.example.song_validate.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class SongDto {

    private int id;
    @NotEmpty
    @Size(min = 1,max = 800,message = "không được quá 800 chữ")
    @Pattern(regexp = "^[a-zA-Z0-9]+$", message = "tên  bài hát không được chứa kí tự đặc biệt")
    private String name;

    @NotEmpty
    @Size(min = 1,max = 300, message = "không được quá 300 chữ")
    @Pattern(regexp ="^[a-zA-Z0-9]+$" ,message = "tên nghệ sĩ không được chứa kí tự đặc biệt" )
    private String artist;

    @NotEmpty
    @Size(min = 1 ,max = 1000,message = "không được quá 1000 chữ")
    @Pattern(regexp ="^[a-z ,A-Z0-9]+$",message = "thể loại được chứa dấu (,) nhưng không được chứa kí tự đặc biệt" )
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
