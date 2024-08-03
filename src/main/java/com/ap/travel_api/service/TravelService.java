package com.ap.travel_api.service;

import com.ap.travel_api.web.request.InsertTravelRateRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TravelService {

    public boolean insertTravelRate(InsertTravelRateRequest travelRateRequest) {
        return true;
    }

}
