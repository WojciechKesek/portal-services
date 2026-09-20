package com.travel_budy.portal_services.weather.protocol;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WeatherRequest {

    private double latitude;
    private double longitude;
    private String startDate;
    private String endDate;
}
