package org.spring.springboot.config;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.assertEquals;

/**
 * Spring Boot MessageConfiguration 测试 - {@link MessageConfiguration}
 *
 * @author colg
 */
public class MessageConfigurationTest {

	private AnnotationConfigApplicationContext ctx;

	@Test
	public void testGetMessageBean() throws Exception {
		ctx = new AnnotationConfigApplicationContext(MessageConfiguration.class);
		assertEquals("message configuration", ctx.getBean("message"));
	}

	@Test
	public void testScanPackages() throws Exception {
		ctx = new AnnotationConfigApplicationContext();
		ctx.scan("org.spring.springboot");
		ctx.refresh();
		assertEquals("message configuration", ctx.getBean("message"));
	}
}
