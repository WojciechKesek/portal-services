package com.travel_budy.portal_services.weather.protocol;

import lombok.Data;

@Data
public class WeatherResponse {

    private double latitude;
    private double longitude;
    private double generationtime_ms;
    private int utc_offset_seconds;
    private String timezone;

    private DailyData daily;
    private HourlyData hourly;
}
