package com.fataelislami.myselfapps.Models;
/**
 * Nim : 10116499
 * Nama : Fata El Islami
 * Kelas : AKB-11
 * Latihan 3 UTS
 * Tanggal : 30 April 2019
 */
public class MusicModel {
    private int id,image;
    private String title;
    private String artist;
    private String duration;
    private int path;

    public MusicModel(int id, int image, String title, String artist, String duration, int path) {
        this.id = id;
        this.image = image;
        this.title = title;
        this.artist = artist;
        this.duration = duration;
        this.path = path;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPath() {
        return path;
    }

    public void setPath(int path) {
        this.path = path;
    }
}
