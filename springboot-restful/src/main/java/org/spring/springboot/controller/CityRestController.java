package org.spring.springboot.controller;

import org.spring.springboot.domain.City;
import org.spring.springboot.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 城市 Controller 实现 Restful HTTP 服务
 *
 * @author colg
 */
@RestController
public class CityRestController {

	@Autowired
	private CityService cityService;

	@GetMapping("/api/city/{id}")
	public City findOneCity(@PathVariable("id") Long id) {
		return cityService.findCityById(id);
	}

	@GetMapping("/api/city")
	public List<City> findAllCity() {
		return cityService.findAllCity();
	}

	@PostMapping("/api/city")
	public void createCity(@RequestBody City city) {
		cityService.saveCity(city);
	}

	@PutMapping("/api/city")
	public void modifyCity(@RequestBody City city) {
		cityService.updateCity(city);
	}

	@DeleteMapping("/api/city/{id}")
	public void modifyCity(@PathVariable("id") Long id) {
		cityService.deleteCity(id);
	}
}
