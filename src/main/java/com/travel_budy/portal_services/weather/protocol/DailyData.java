package com.travel_budy.portal_services.weather.protocol;

import lombok.Data;

import java.util.List;

@Data
public class DailyData {

    private List<String> time;
    private List<String> sunrise;
    private List<String> sunset;
}
