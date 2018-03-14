package com.fixed.asset.common;

import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class StringDateConverter implements Converter<String, Date>{

	Logger logger =  LoggerFactory.getLogger(this.getClass());
	@Override
	public Date convert(String str) {
		logger.debug("执行类型转换String==>Date ::: "+str);
		try {
			return new SimpleDateFormat("yyyy-MM-dd").parse(str);
		}catch(Exception e) {
			logger.error("类型转换失败String==>Date ::: "+str,e);
			e.printStackTrace();
			return null;
		}
	}

}
