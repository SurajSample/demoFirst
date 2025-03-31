package interv_mock;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class t2 
{
	public static void main(String[] args) 
	{
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://aquabottesting.com/tables-example2.html");
		
		//WebElement table=driver.findElement(By.xpath("(//table)[2]"));
		
		List<WebElement>rows=driver.findElements(By.xpath("(//table)[2]//tr"));
		
		ArrayList<String>ar=new ArrayList<String>();
		System.out.println(rows.size());
		for(WebElement row:rows)
		{
			List<WebElement> cells = row.findElements(By.tagName("td"));
			if(cells.size()>=2)
			{
				String name=cells.get(0).getText().trim();
				//System.out.println(name);
				
				String phone=cells.get(1).getText().trim();
				if(phone.equals("800-555-4222"))
				{
					ar.add(name);
				}
			}
		}
		System.out.println("Names="+String.join(",", ar));
	}
}
