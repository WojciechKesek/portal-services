package com.travel_budy.portal_services.location.protocol;

import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LocationRequest {

    @NotEmpty
    private String city;
    @NotEmpty
    private String countryCode;

}
