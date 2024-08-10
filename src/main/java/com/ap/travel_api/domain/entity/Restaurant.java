package com.ap.travel_api.domain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "restaurant")
public class Restaurant {

    private UUID restaurantId;
    private String country;
    private String locality;
    private String season;
    private String description;
    private int rate;
    private List<String> accommodations; // todo: this needs to be changed to a list of Accommodation objects
    private List<String> restaurants;   // todo: this needs to be changed to a list of Restaurant objects

    public Restaurant() {}

    public Restaurant(UUID travelId, String country, String locality, String season, String description, int rate, List<String> accommodations, List<String> restaurants) {
        this.restaurantId = travelId;
        this.country = country;
        this.locality = locality;
        this.season = season;
        this.description = description;
        this.rate = rate;
        this.accommodations = accommodations;
        this.restaurants = restaurants;
    }

    public UUID getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(UUID restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public List<String> getAccommodations() {
        return accommodations;
    }

    public void setAccommodations(List<String> accommodations) {
        this.accommodations = accommodations;
    }

    public List<String> getRestaurants() {
        return restaurants;
    }

    public void setRestaurants(List<String> restaurants) {
        this.restaurants = restaurants;
    }
}
