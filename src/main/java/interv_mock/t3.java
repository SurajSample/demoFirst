package interv_mock;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class t3 
{

	public static void main(String[] args) 
	{
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	            // Open the webpage
	            driver.get("https://aquabottesting.com/tables-example2.html");

	            // Locate Table 2
	            WebElement table = driver.findElement(By.xpath("(//table)[1]"));

	            // Get all rows of the table
	            List<WebElement> rows = table.findElements(By.tagName("tr"));

	            // Iterate through each row
	            for (WebElement row : rows) {
	                List<WebElement> cells = row.findElements(By.tagName("td"));
	                
	                    String rowData = "";
	                    
	                    for (WebElement cell : cells) {
	                        // Check if the cell contains an image with 'checkmark' in the src attribute
	                        List<WebElement> checkmarkImages = cell.findElements(By.xpath("//img[contains(@alt, 'checkmark')]") );
	                        
	                    }
	                    
	                    // Print row data if the 'Available' image is present
	                    
	                    
	                        System.out.println(rowData);
	                    }
	}
}