package com.example.user.javacoretraining.classes.shop;

/**
 * Продавец, он же Товаровед
 * */
public class Seller extends User {

    private String title = "";
    private float rating = 0;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }
}
