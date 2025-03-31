package collection;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class properties_testData_demo {

	public static void main(String[] args) throws IOException {
		
		Properties pro=new Properties();
		
		
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\config.properties\\test.properties");
		pro.load(file);
		String myurl=pro.getProperty("url");
		System.out.println(myurl);
		
		

	}

}
