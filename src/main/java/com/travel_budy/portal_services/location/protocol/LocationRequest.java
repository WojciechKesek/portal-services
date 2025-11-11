package com.travel_budy.portal_services.location.protocol;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Getter
public class LocationRequest {

    @NotEmpty
    private String city;
    @NotEmpty
    private String countryCode;
}
