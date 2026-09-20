package com.travel_budy.portal_services.location.protocol;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class LocationResponse {

    private List<Coordinates> coordinates;

    @Data
    private static class Coordinates {

        private String name;
        private String countryCode;
        private double latitude;
        private double longitude;
    }
}
