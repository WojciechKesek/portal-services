package com.travel_budy.portal_services.location.service;

import com.travel_budy.portal_services.location.client.LocationClient;
import com.travel_budy.portal_services.location.protocol.LocationResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LocationService {

    private final LocationClient locationClient;

    public LocationResponse getLocation(String city, String countryCode) {

        return locationClient.getLocation(city, countryCode);


    }
}
