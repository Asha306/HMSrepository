package GenaricFileUtilityForHK;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
public String getdatafromPropertfile(String key) throws IOException {
	FileInputStream fis = new FileInputStream("./commondata/Healthkart.properties");
	Properties prop = new Properties();
	prop.load(fis);
	String data = prop.getProperty(key);

	
	
	
	
	
	return data;
	
	
	
	
}
	
	
	
}
