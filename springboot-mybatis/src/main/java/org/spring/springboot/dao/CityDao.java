package org.spring.springboot.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.spring.springboot.domain.City;

/**
 * 城市 DAO 接口类
 *
 * @author colg
 */
public interface CityDao {

	/**
	 * 根据城市名称，模糊查询城市信息
	 *
	 * @param cityName
	 *            城市名
	 */
	List<City> queryByName(@Param("cityName") String cityName);
}
