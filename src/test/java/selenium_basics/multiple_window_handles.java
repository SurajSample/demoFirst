package selenium_basics;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class multiple_window_handles 
{
	WebDriver dr;
	
  @Test
  public void f() throws InterruptedException 
  {
	  dr=new ChromeDriver();
	  dr.manage().window().maximize();
	  dr.get("https://skpatro.github.io/demo/links/");
	  String mainPage=dr.getWindowHandle();
	  System.out.println(mainPage);
	  
	  Set<String> wids=dr.getWindowHandles();
	  ArrayList al=new ArrayList(wids);
	  
	  System.out.println(al.get(0));
	  
	  dr.findElement(By.xpath("//input[@name='NewTab']")).click();
	  Thread.sleep(10000);
	  WebElement ele=dr.findElement(By.xpath("//div[text()='qavalidation']"));
	  WebDriverWait wait =new WebDriverWait(dr, Duration.ofSeconds(30));
	  wait.until(ExpectedConditions.visibilityOf(ele));
	  
	  System.out.println(al.get(1));
	  //System.out.println(al.get(2));
  }
}
