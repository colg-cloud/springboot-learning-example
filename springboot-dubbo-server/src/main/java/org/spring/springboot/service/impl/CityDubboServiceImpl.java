package org.spring.springboot.service.impl;

import org.spring.springboot.dao.CityDao;
import org.spring.springboot.domain.City;
import org.spring.springboot.service.CityDubboService;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;

/**
 * 城市业务 Dubbo 服务层实现层
 * 
 * 注册为 Dubbo 服务 {@link com.alibaba.dubbo.config.annotation.Service}
 *
 * @author colg
 */
@Service
public class CityDubboServiceImpl implements CityDubboService {

	@Autowired
	private CityDao cityDao;

	public City findCityByName(String cityName) {
		return cityDao.findByName(cityName);
	}
}
