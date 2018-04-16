package org.spring.springboot.controller;

import org.spring.springboot.domain.City;
import org.spring.springboot.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

import java.util.List;

/**
 * 城市 Controller 实现 Restful HTTP 服务
 *
 * @author colg
 */
@Api(value = "城市 Controller 实现 Restful HTTP 服务", tags = {"城市操作接口"})
@RestController
public class CityRestController {

	@Autowired
	private CityService cityService;

	@ApiOperation(value = "获取城市信息", notes = "根据城市id获取城市信息")
	@ApiImplicitParam(name = "id", value = "城市id", required = true, dataType = "java.lang.Long", paramType = "path")
	@GetMapping("/api/city/{id}")
	public City findOneCity(@PathVariable("id") Long id) {
		return cityService.findCityById(id);
	}

	@ApiOperation(value = "获取城市信息列表", notes = "获取全部城市信息")
	@GetMapping("/api/city")
	public List<City> findAllCity() {
		return cityService.findAllCity();
	}

	@ApiOperation(value = "创建城市信息", notes = "根据City对象创建城市信息")
	@ApiImplicitParam(name = "city", value = "City对象", required = true, dataTypeClass = City.class, paramType = "body")
	@PostMapping("/api/city")
	public void createCity(@RequestBody City city) {
		cityService.saveCity(city);
	}

	@ApiOperation(value = "修改城市信息", notes = "根据City对象修改城市信息")
	@ApiImplicitParam(name = "city", value = "City对象", required = true, dataTypeClass = City.class, paramType = "body")
	@PutMapping("/api/city")
	public void modifyCity(@RequestBody City city) {
		cityService.updateCity(city);
	}

	@ApiOperation(value = "删除城市信息", notes = "根据城市id删除城市信息")
	@ApiImplicitParam(name = "id", value = "城市id", required = true, dataType = "java.lang.Long", paramType = "path")
	@DeleteMapping("/api/city/{id}")
	public void modifyCity(@PathVariable("id") Long id) {
		cityService.deleteCity(id);
	}
}
