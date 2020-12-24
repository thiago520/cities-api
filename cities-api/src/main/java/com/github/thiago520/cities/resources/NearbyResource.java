package com.github.thiago520.cities.resources;

import com.github.thiago520.cities.entities.City;
import com.github.thiago520.cities.service.DistanceService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/nearby")
public class NearbyResource {

    private DistanceService distanceService;

    public NearbyResource(DistanceService distanceService) {
        this.distanceService = distanceService;
    }

    @GetMapping
    public List<City> nearby(@RequestParam( name = "city_id") final Long cityId,
                             @RequestParam( name = "radius") final Double radius) {

       return distanceService.nearby(cityId,  radius);
    }
}
