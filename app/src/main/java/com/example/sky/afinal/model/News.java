package com.example.sky.afinal.model;

/**
 * Created by Sky on 23/01/2017.
 */

public class News {
    private String title;
    private String discription;
    private int image;

    public News(String title, String discription, int image) {
        this.title = title;
        this.discription = discription;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
