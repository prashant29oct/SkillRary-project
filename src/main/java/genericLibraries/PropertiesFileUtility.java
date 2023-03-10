package genericLibraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.Keys;

public class PropertiesFileUtility {
	
	private Properties property;
	/**
	 * This method is used to initialize properties file
	 * @param path
	 */
	
	public void propertiesInitialization(String path) {
	
		FileInputStream fis = null;
		try {
			 fis = new FileInputStream(path);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	
		property = new Properties();
		try {
			property.load(fis);
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
		/**
		 * This method is used to fetch the data from properties file
		 * @param key
		 * @return
		 */
		public String fetchProperty(String key) {
		return property.getProperty(key);
		}
	}

