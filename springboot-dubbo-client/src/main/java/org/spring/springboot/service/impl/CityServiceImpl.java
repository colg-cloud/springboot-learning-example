package org.spring.springboot.service.impl;

import org.spring.springboot.domain.City;
import org.spring.springboot.service.CityDubboService;
import org.spring.springboot.service.CityService;
import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;

//@Component
@Service
public class CityServiceImpl implements CityService {

	@Reference
	private CityDubboService cityDubboService;

	@Override
	public City findCityByName(String cityName) {
		return cityDubboService.findCityByName(cityName);
	}
}
