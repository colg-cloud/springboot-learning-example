package org.spring.springboot.web;

import java.util.Collections;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Spring Boot HelloWorld 案例
 *
 * @author colg
 */
@RestController
public class HelloWorldController {

	@RequestMapping("/")
	public Map<String, Object> sayHello() {
		return Collections.singletonMap("Hello, World!", "Spring Boot");
	}
}
