package com.fixed.asset.common;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class StringIntegerConverter implements Converter<String, Integer>{

	Logger logger =  LoggerFactory.getLogger(this.getClass());
	@Override
	public Integer convert(String str) {
		logger.debug("执行类型转换String==>Integer"+str);
		try {
			return Integer.parseInt(str);
		}catch(Exception e) {
			logger.error("类型转换失败String==>Integer"+str);
			e.printStackTrace();
			return null;
		}
	}

}
