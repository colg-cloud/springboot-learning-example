package org.spring.springboot.web;

import java.util.HashMap;
import java.util.Map;

import org.spring.springboot.property.HomeProperties;
import org.spring.springboot.property.UserProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Spring Boot HelloWorld 案例
 *
 * @author colg
 */
@RestController
public class HelloWorldController {

	@Autowired
	private HomeProperties homeProperties;

	@Autowired
	private UserProperties userProperties;

	@RequestMapping("/")
	public Map<String, Object> sayHello() {
		Map<String, Object> map = new HashMap<>();
		map.put("homeProperties", homeProperties);
		map.put("userProperties", userProperties);
		return map;
	}
}
