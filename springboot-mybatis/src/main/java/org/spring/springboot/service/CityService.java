package org.spring.springboot.service;

import java.util.List;

import org.spring.springboot.domain.City;

/**
 * 城市业务逻辑接口类
 *
 * @author colg
 */
public interface CityService {

	/**
	 * 根据城市名称，查询城市信息列表
	 * 
	 * @param cityName
	 */
	List<City> queryCityByName(String cityName);
}
