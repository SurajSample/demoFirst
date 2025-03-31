package NewTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class swiggy_demo {

	public static void main(String[] args) 
	{
		WebDriver dr;
		dr=new ChromeDriver();
		dr.manage().window().maximize();
		
		dr.get("https://www.swiggy.com/");
		//WebElement ele=dr.findElement(By.className("sc-cMa-dbN cSbigE"));
		WebElement ele=dr.findElement(By.cssSelector(".cSbigE"));
		
		JavascriptExecutor js=(JavascriptExecutor)dr;
		js.executeScript("arguments[0].scrollIntoView();", ele);
		
		List<WebElement> images=dr.findElements(By.xpath("//img[contains(@src,'.png')]"));
		System.out.println("Total ele="+images.size());
		for(WebElement image:images)
		{
			String src=image.getAttribute("src");
			//System.out.println("SRC="+src);
			if(src.contains("Pizza.png"))
			{
				image.click();
				break;
			}
		}
		
	}

}
