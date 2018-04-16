package org.spring.springboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * swagger2 配置
 *
 * @author colg
 */
@Configuration
// 启用Swagger2
@EnableSwagger2
public class Swagger2 {

	@Bean
	public Docket docket() {
		return new Docket(DocumentationType.SWAGGER_2)
					.apiInfo(apiInfo())
					.select()
					.apis(RequestHandlerSelectors.basePackage("org.spring.springboot.controller"))
					.paths(PathSelectors.any())
					.build();
	}
	
	/**
	 * 设置api基本信息
	 * @return
	 */
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
					.title("Spring Boot中使用Swgger2构建RESTful API")
					.description("Spring Boot 整合 Swgger2 Demo")
					.termsOfServiceUrl("https://blog.csdn.net/NorRinInTheSky")
					.contact(new Contact("colg", "https://blog.csdn.net/NorRinInTheSky", "121529654@qq.com"))
					.version("1.0.0")
					.build();
	}
}
