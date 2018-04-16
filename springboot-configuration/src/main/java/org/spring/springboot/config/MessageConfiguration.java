package org.spring.springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 
 *
 * @author Yang Lei
 */
@Configuration
public class MessageConfiguration {

	@Bean
	public String message() {
		return "message configuration";
	}
}
