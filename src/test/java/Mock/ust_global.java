package Mock;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ust_global 
{
	WebDriver dr;
  @Test
  public void f() throws InterruptedException 
  {
	  dr=new ChromeDriver();
	  dr.manage().deleteAllCookies();

	  dr.manage().window().maximize();
	  dr.get("https://www.ust.com/");
	  //hower element
	  
	  //WebElement cookie = dr.findElement(By.xpath("//button[contains(text(),'Accept')]"));
	  WebDriverWait wait=new WebDriverWait(dr, Duration.ofSeconds(30));
	  wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//button[contains(text(),'Accept')]"))));
	  
	  try 
	  {
          WebElement acceptCookies = dr.findElement(By.xpath("//button[contains(text(),'Accept')]"));
          acceptCookies.click();
      } 
	  catch (Exception e) 
	  {
          System.out.println("Cookies popup not found or already accepted.");
      }
	  
	  WebElement ele=dr.findElement(By.xpath("//button[text()='What we do']"));
	  
	  Actions act=new Actions(dr);
	  
	  act.moveToElement(ele).perform();
	  Thread.sleep(5000);
	  WebElement digi=dr.findElement(By.xpath("//span[text()='Digital Business Transformation']"));
	  JavascriptExecutor js=(JavascriptExecutor)dr;
	  js.executeScript("arguments[0].click();", digi);
	  
  }
}
