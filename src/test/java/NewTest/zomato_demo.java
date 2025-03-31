package NewTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class zomato_demo {

	public static void main(String[] args) {
		WebDriver dr;
		dr=new ChromeDriver();
		dr.manage().window().maximize();
		
		dr.get("https://www.zomato.com/");
		//to scroll element
		WebElement ele=dr.findElement(By.xpath("//p[contains(text(),'Pop')]"));
		JavascriptExecutor js=(JavascriptExecutor)dr;
		js.executeScript("arguments[0].scrollIntoView();", ele);
		
		
		//
		List<WebElement> places=dr.findElements(By.xpath("//p[contains(text(),'places')]//..//h5"));
		System.out.println("Total Places="+places.size());
		
		for(WebElement place:places)
		{
			String inp=place.getText();
			System.out.println(inp);
			if(inp.contains("Koreg")) 
			{
				place.click();
				break;
			}
		}
		
		
		

	}

}
