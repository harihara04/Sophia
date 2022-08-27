package com.Sindhu.ReuseablePackage;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.commons.lang3.StringUtils;

public class PropertiesOperation {
	
static Properties prop = new Properties();
	
	public static String getPropertyValueByKey(String key) throws Exception {
		
		FileInputStream fis = new FileInputStream("C:/Users/User/eclipse-workspace/Sophia/src/main/java/com/Sindhu/Config/config.propperties");
		prop.load(fis);
		
		String value = prop.getProperty(key).toString();
		
		if (StringUtils.isEmpty(value)) {
		
			throw new Exception("Value is not Speciified"+ key);
		}
		return value ;
		
	}

}
