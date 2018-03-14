package com.fixed.asset.common;

import java.util.Locale;
import java.util.ResourceBundle;

public class ConfigUtil {
	public static String getValue(String name){
			String value = null;
			try {
				 Locale local = Locale.getDefault();
			   ResourceBundle bundle = ResourceBundle.getBundle("config", local);
			   value = bundle.getString(name);
			 }
			 catch(Exception ex) {
				 ex.printStackTrace();
			 }
			return value;
	}
	
	
}
