package com.example.moviectalogueservice.model;

import java.util.Arrays;
import java.util.List;

public class UserRating {

    private String userId;
    private List<Ratings> ratings;

    public String getUserId() {
        return userId;
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

}