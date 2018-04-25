package com.example.lounah.trains.model.entity;

import android.arch.persistence.room.Ignore;

public class Something {

    private int id;
    private String content;
    private String imgURL;

    @Ignore
    public Something() {}

    public Something(int id, String content, String imgURL) {
        this.id = id;
        this.content = content;
        this.imgURL = imgURL;
    }

    public int getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public String getImgURL() {
        return imgURL;
    }
}
