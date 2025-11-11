package com.travel_budy.portal_services.weather.api;

import com.travel_budy.portal_services.weather.protocol.WeatherRequest;
import com.travel_budy.portal_services.weather.protocol.WeatherResponse;
import com.travel_budy.portal_services.weather.service.WeatherService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/historical-weather")
@RequiredArgsConstructor
public class WeatherController {

    private final WeatherService weatherService;

    @PostMapping
    public ResponseEntity<WeatherResponse> getHistoricalWeather(@RequestBody WeatherRequest weatherRequest) {
        return ResponseEntity.ok(weatherService.getWeather(weatherRequest.getStartDate(), weatherRequest.getEndDate(),
                weatherRequest.getLatitude(), weatherRequest.getLongitude()));
    }
}
