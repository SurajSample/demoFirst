package NewTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class propertiesTestData 
{
	public static void main(String[] args) 
	{
		Properties property=new Properties();
		
		try
		{
			FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\config.properties\\test.properties");
			property.load(file);
			file.close();
			
			String url=property.getProperty("url");
			System.out.println(url);
			
		}
		catch(IOException e)
		{
			System.out.println("Unable to read values"+e.getMessage());
		}
		
	}
}
