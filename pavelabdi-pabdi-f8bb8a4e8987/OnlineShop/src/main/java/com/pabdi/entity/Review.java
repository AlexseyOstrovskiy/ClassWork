package com.pabdi.entity;

public class Review {

    private String reviewText;

    private Rate reviewRate;

    private User reviewUser;

    public Review(){

    }

    public String getReviewText() {
        return reviewText;
    }

    public void setReviewText(String reviewText) {
        this.reviewText = reviewText;
    }

    public Rate getReviewRate() {
        return reviewRate;
    }

    public void setReviewRate(Rate reviewRate) {
        this.reviewRate = reviewRate;
    }

    public User getReviewUser() {
        return reviewUser;
    }

    public void setReviewUser(User reviewUser) {
        this.reviewUser = reviewUser;
    }
}
