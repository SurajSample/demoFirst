package selenium_basics;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class alert_handle {
	
	WebDriver dr;
  @Test
  public void f() throws InterruptedException {
	  dr=new ChromeDriver();
	  dr.manage().window().maximize();
//	  Set<Cookie>cookies=dr.manage().getCookies();
//	  for(Cookie cookie:cookies)
//	  {
//		 System.out.println(cookie.getName()+"-"+cookie.getValue());
//	  }
	  dr.get("https://demo.automationtesting.in/Alerts.html");
	  WebElement btn=dr.findElement(By.xpath("//button[contains(text(),'alert')]")); btn.click();
	  
	  Alert al=dr.switchTo().alert(); 
	  Thread.sleep(3000);  
	  al.accept();
	  	
	  
	  WebDriverWait wait=new WebDriverWait(dr, Duration.ofSeconds(10));
	  wait.until(ExpectedConditions.visibilityOf(btn));
	  
	  
  }
}
