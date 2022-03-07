package com.example.ratingsdataservice.controller;

import com.example.ratingsdataservice.model.Ratings;
import com.example.ratingsdataservice.model.UserRating;
import org.apache.catalina.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratingsData")
public class RatingsDataController {

    @RequestMapping("/movies/{movieId}")
    public Ratings getMovieRating(@PathVariable("movieId") String movieId) {
        return new Ratings(movieId, 4);
    }

    @RequestMapping("/user/{userId}")
    public UserRating getUserRatings(@PathVariable("userId") String userId) {
        UserRating userRating = new UserRating();
        userRating.initData(userId);
        return userRating;

    }

}