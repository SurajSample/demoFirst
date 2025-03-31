package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class frame_demo 
{
  @Test
  public void f() throws InterruptedException 
  			{
	          // Step 1: Set up ChromeDriver
	         
	          WebDriver driver = new ChromeDriver();
	          
	          // Step 2: Open the URL
	          driver.get("https://demo.automationtesting.in/Frames.html");
	          driver.manage().window().maximize();

	          // Step 3: Click on "Iframe with in an Iframe" tab
	          driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();

	          // Step 4: Switch to the first (outer) frame
	          WebElement outerFrame = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
	          driver.switchTo().frame(outerFrame);

	          // Step 5: Switch to the inner frame
	          WebElement innerFrame = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
	          driver.switchTo().frame(innerFrame);

	          // Step 6: Locate the input field and enter text
	          WebElement inputBox = driver.findElement(By.xpath("//input[@type='text']"));
	          inputBox.sendKeys("Hello, Selenium!");

	          // Step 7: Switch back to the main page
	          driver.switchTo().parentFrame();
	          Thread.sleep(3000);
	          
	          WebElement mainFrameTXT=driver.findElement(By.xpath("//h5[text()='Nested iFrames']"));
	          System.out.println(mainFrameTXT.getText());
	          
	          // Step 8: Close the browser
	          //driver.quit();
	      
	  }

	  
	  
  
}
