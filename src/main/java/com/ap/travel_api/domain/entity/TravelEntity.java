package com.ap.travel_api.domain.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.springframework.lang.Nullable;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "travel_entity")
public class TravelEntity {

    private UUID travelId;
    private String country;
    private String locality;
    private String season;
    private String description;
    private int rate;
    private List<String> accommodations; // todo: this needs to be changed to a list of Accommodation objects
    private List<String> restaurants;   // todo: this needs to be changed to a list of Restaurant objects

    public TravelEntity(){}

    public TravelEntity(UUID travelId, String country, String locality, String season, String description,
                        int rate, List<String> accommodations, List<String> restaurants) {
        this.travelId = travelId;
        this.country = country;
        this.locality = locality;
        this.season = season;
        this.description = description;
        this.rate = rate;
        this.accommodations = accommodations;
        this.restaurants = restaurants;
    }

    public UUID getTravelId() {
        return travelId;
    }

    public void setTravelId(UUID travelId) {
        this.travelId = travelId;
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

    @Nullable
    public List<String> getAccommodations() {
        return accommodations;
    }

    public void setAccommodations(List<String> accommodations) {
        this.accommodations = accommodations;
    }

    @Nullable
    public List<String> getRestaurants() {
        return restaurants;
    }

    public void setRestaurants(List<String> restaurants) {
        this.restaurants = restaurants;
    }
}
