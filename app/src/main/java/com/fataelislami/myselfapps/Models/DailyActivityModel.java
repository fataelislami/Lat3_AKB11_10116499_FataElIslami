package com.fataelislami.myselfapps.Models;
/**
 * Nim : 10116499
 * Nama : Fata El Islami
 * Kelas : AKB-11
 * Latiha 3 UTS
 */
public class DailyActivityModel {
    private String title;
    private String description;

    public DailyActivityModel(String title, String description){
        this.title=title;
        this.description=description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
