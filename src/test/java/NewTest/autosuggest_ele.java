package NewTest;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class autosuggest_ele 
{
	private int val=10;
	
	
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver dr;
		dr=new ChromeDriver();
		dr.get("https://www.google.com/");
		dr.findElement(By.xpath("//textarea[@title='Search']")).sendKeys("happiest minds");
		
		System.out.println("Title="+dr.getTitle());
		
		WebDriverWait wait=new WebDriverWait(dr, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//ul[@role='listbox']//li")));
		
		List<WebElement> allEle=dr.findElements(By.xpath("//ul[@role='listbox']//li"));
	
		System.out.println("Total elements="+allEle.size());
		
		for(WebElement ele:allEle)
		{
			if(ele.getText().equals("happiest minds careers"))
			{
				ele.click();
			}
		}
		
	}
}
