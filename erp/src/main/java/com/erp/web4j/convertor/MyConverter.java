package com.erp.web4j.convertor;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyConverter implements Converter<String,Date> {
	@Override
	public Date convert(String s) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date parse = null;
		try {
			parse = simpleDateFormat.parse(s);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return parse;
	}
}
