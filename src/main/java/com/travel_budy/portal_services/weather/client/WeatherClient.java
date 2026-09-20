package com.travel_budy.portal_services.weather.client;

import com.travel_budy.portal_services.weather.protocol.WeatherResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@RequiredArgsConstructor
public class WeatherClient {

    @Value("${weather.api.uri}")
    private String weatherApiUri;

    private final RestTemplate restTemplate;

    public WeatherResponse getWeather(String startDate, String endDate, double latitude, double longitude) {

        var url = String.format(weatherApiUri, latitude, longitude, startDate, endDate);

        return restTemplate.getForObject(url, WeatherResponse.class);
    }
}
