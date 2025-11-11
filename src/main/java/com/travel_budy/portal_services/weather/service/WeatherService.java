package com.travel_budy.portal_services.weather.service;

import com.travel_budy.portal_services.weather.client.WeatherClient;
import com.travel_budy.portal_services.weather.protocol.WeatherResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WeatherService {

    private final WeatherClient weatherClient;

    public WeatherResponse getWeather(String startDate, String endDate, double latitude, double longitude) {
        return weatherClient.getWeather(startDate, endDate, latitude, longitude);
    }
}
