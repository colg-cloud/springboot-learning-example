package org.spring.springboot.core;

/**
 * entity的基类，建议所有实体类都继承
 *
 * @author colg
 */
public abstract class BaseEntity {

	/*	@Override
		public String toString() {
			return JSON.toJSONString(
				this,
				SerializerFeature.WriteDateUseDateFormat,
				SerializerFeature.WriteMapNullValue,
				SerializerFeature.DisableCircularReferenceDetect
			);
		}*/
}
