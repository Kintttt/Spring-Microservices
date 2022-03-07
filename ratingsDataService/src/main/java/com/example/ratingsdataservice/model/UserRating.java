package com.example.ratingsdataservice.model;

import java.util.Arrays;
import java.util.List;

public class UserRating {
    private String userId;
    private List<Ratings> ratings;

    public String getUserId() {
        return userId;
    }

    public UserRating() {
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<Ratings> getRatings() {
        return ratings;
    }

    public void setRatings(List<Ratings> ratings) {
        this.ratings = ratings;
    }

    public void initData(String userId) {
        this.setUserId(userId);
        this.setRatings(Arrays.asList(
                new Ratings("100", 3),
                new Ratings("200", 4)
        ));
    }
}