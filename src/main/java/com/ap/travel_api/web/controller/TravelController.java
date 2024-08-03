package com.ap.travel_api.web.controller;

import com.ap.travel_api.service.TravelService;
import com.ap.travel_api.web.request.InsertTravelRateRequest;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/travel-api")
@AllArgsConstructor
public class TravelController {

    private TravelService travelService;

    @PostMapping(path = "", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean insertTravelRate(@RequestBody InsertTravelRateRequest travelRateRequest) {
        return travelService.insertTravelRate(travelRateRequest);
    }
}
