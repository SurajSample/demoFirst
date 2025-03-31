package NewTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class largest_ele_array 
{

	public static void main(String[] args) 
	{

		int[] ar = { 61, 2, 31,54, 40, 98, 7,68,21,74 };
		
		
		int max= ar[0];
		
		for(int i=1;i<=ar.length-1;i++)
		{
				if(ar[i]>max)
				{
					max=ar[i];
				}	
			}
			System.out.println("LArgest ele="+max);
		}

	}









	
	