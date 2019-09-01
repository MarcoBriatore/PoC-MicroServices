package com.meb.ratingsdataservice.models;

import java.util.List;

public class UserRating {

    private String userId;
    private List<Rating> ratings;

    public UserRating() {
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setRatings(List<Rating> ratings) {
        this.ratings = ratings;
    }

    public String getUserId() {
        return userId;
    }

    public List<Rating> getRatings() {
        return ratings;
    }
}
