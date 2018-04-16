package org.spring.springboot.service;

import org.spring.springboot.domain.City;

/**
 * 城市业务 Dubbo 服务层
 *
 * @author colg
 */
public interface CityDubboService {

	/**
	 * 根据城市名称，查询城市信息
	 * 
	 * @param cityName
	 */
	City findCityByName(String cityName);
}
