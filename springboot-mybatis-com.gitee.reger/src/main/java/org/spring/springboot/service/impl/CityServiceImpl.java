package org.spring.springboot.service.impl;

import java.util.List;

import org.spring.springboot.dao.CityMapper;
import org.spring.springboot.domain.City;
import org.spring.springboot.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;

/**
 * 城市业务逻辑实现类
 *
 * @author colg
 */
@Service
public class CityServiceImpl implements CityService {

	@Autowired
	private CityMapper cityMapper;

	public List<City> findAllCity() {
		PageHelper.startPage(0, 10);
		return cityMapper.selectAll();
	}

	public City findCityById(Integer id) {
		return cityMapper.selectByPrimaryKey(id);
	}

	@Override
	public Integer saveCity(City city) {
		return cityMapper.insertSelective(city);
	}

	@Override
	public Integer updateCity(City city) {
		return cityMapper.updateByPrimaryKeySelective(city);
	}

	@Override
	public Integer deleteCity(Integer id) {
		return cityMapper.deleteByPrimaryKey(id);
	}

}
