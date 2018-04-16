package org.spring.springboot.controller;

import org.spring.springboot.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * 城市 Controller 实现 Restful HTTP 服务
 *
 * @author colg
 */
@Controller
public class CityController {

	@Autowired
	private CityService cityService;

	@GetMapping("/api/city/{id}")
	public String findOneCity(Model model, @PathVariable("id") Long id) {
		model.addAttribute("city", cityService.findCityById(id));
		return "city";
	}

	@GetMapping("/api/city")
	public String findAllCity(Model model) {
		model.addAttribute("cityList", cityService.findAllCity());
		return "cityList";
	}
}
