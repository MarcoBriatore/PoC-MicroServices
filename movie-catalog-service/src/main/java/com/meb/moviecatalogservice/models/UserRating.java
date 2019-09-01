package com.meb.moviecatalogservice.models;

import java.util.List;

public class UserRating {

    private String userId;
    private List<Rating> ratings;

    public UserRating(String userId, List<Rating> ratings) {
        this.userId = userId;
        this.ratings = ratings;
    }


    public String getUserId() {
        return userId;
    }

    public List<Rating> getRatings() {
        return ratings;
    }
}
