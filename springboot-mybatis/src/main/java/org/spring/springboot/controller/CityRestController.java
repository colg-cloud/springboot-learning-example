package org.spring.springboot.controller;

import java.util.List;

import org.spring.springboot.domain.City;
import org.spring.springboot.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * City Controller
 *
 * @author colg
 */
@RestController
public class CityRestController {

    @Autowired
    private CityService cityService;

    @GetMapping("/api/city")
    public List<City> findOneCity(@RequestParam(value = "cityName", required = true) String cityName) {
        return cityService.queryCityByName(cityName);
    }

}
