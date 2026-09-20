package com.travel_budy.portal_services.weather.protocol;

import lombok.Data;

import java.util.List;

@Data
public class HourlyData {
    private List<String> time;
    private List<Double> temperature_2m;
    private List<Double> rain;
    private List<Double> wind_speed_10m;
}
