package com.travel_budy.portal_services.location.api;

import com.travel_budy.portal_services.location.protocol.LocationRequest;
import com.travel_budy.portal_services.location.protocol.LocationResponse;
import com.travel_budy.portal_services.location.service.LocationService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/location")
@RequiredArgsConstructor
public class LocationController {

    private final LocationService locationService;

    @PostMapping
    public ResponseEntity<LocationResponse> getLocationCoordinates(@Valid @RequestBody LocationRequest request) {
        return ResponseEntity.ok(locationService.getLocation(request.getCity(), request.getCountryCode()));
    }
}
