package brain;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {
	
	Properties prop = new Properties();
	
	public String getProp(String propName) throws IOException {
		
		   FileInputStream propFile = new FileInputStream("src\\main\\java\\config\\prod.properties");
		   prop.load(propFile);
		   return prop.getProperty(propName);
	}
	
	public void setProp(String key, String value) throws IOException {
		
		FileOutputStream propFile = new FileOutputStream("src\\main\\java\\config\\prod.properties");
		prop.setProperty(key, value);
		prop.store(propFile,"");
		propFile.close();
	}

}
	