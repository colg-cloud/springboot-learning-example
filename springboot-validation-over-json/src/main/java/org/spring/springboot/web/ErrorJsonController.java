package org.spring.springboot.web;

import org.spring.springboot.constant.CityErrorInfoEnum;
import org.spring.springboot.domain.City;
import org.spring.springboot.result.GlobalErrorInfoException;
import org.spring.springboot.result.ResultBody;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 错误码案例
 *
 * @author colg
 */
@RestController
public class ErrorJsonController {

	/**
	 * 获取城市接口
	 * 
	 * @param cityName
	 * @return
	 * @throws GlobalErrorInfoException
	 */
	@GetMapping(value = "/api/city")
	public ResultBody findOneCity(@RequestParam("cityName") String cityName) throws GlobalErrorInfoException {
		// 入参为空
		if (StringUtils.isEmpty(cityName)) {
			throw new GlobalErrorInfoException(CityErrorInfoEnum.PARAMS_NO_COMPLETE);
		}
		return new ResultBody(new City(1L, 2L, "温岭", "是我的故乡"));
	}
}