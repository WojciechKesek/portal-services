package com.travel_budy.portal_services.weather.protocol;

import lombok.Getter;

@Getter
public class WeatherRequest {

    private double latitude;
    private double longitude;
    private String startDate;
    private String endDate;
}
