package com.ap.travel_api.domain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name = "accommodation")
public class Accommodation {
    private UUID accommodationId;
    private float price;
    private int rate;
    private int numberOfPeople;
    private int numberOfBeds;
    // the locality can be fetched from the associated travel entity (?)
//    private String locality;

    public Accommodation() {}

    public Accommodation(UUID accommodationId, float price, int rate, int numberOfPeople, int numberOfBeds) {
        this.accommodationId = accommodationId;
        this.price = price;
        this.rate = rate;
        this.numberOfPeople = numberOfPeople;
        this.numberOfBeds = numberOfBeds;
    }

    public UUID getAccommodationId() {
        return accommodationId;
    }

    public void setAccommodationId(UUID accommodationId) {
        this.accommodationId = accommodationId;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }
}
