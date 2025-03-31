package NewTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class data_provider_demo 
{
	@DataProvider(name="loginData")
	public Object[][] getLogin()
	{
		return new Object[][] 
				{
					{"suraj","1234"}
				};
	}
	
	@Test(dataProvider="loginData")
	public void testLogin(String UN,String pwd) 
	{
		System.out.println("My userName="+UN+" "+"My PWD="+pwd);
	}
}
