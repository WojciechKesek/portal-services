package com.travel_budy.portal_services.location.client;

import com.travel_budy.portal_services.location.protocol.LocationResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@RequiredArgsConstructor
public class LocationClient {

    @Value("${location.api.uri}")
    private String locationApiUri;

    private final RestTemplate restTemplate;

    public LocationResponse getLocation(String city, String countryCode) {

        var url = String.format(locationApiUri, city, countryCode);

        return restTemplate.getForObject(url, LocationResponse.class);
    }
}
