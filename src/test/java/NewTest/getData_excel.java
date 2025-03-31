package NewTest;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class getData_excel {

	public static void main(String[] args) throws IOException 
	{
		
		//get all data
		
//		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\TestData\\Creden.xlsx");
//		XSSFWorkbook workbook=new XSSFWorkbook(file);
//		XSSFSheet sh=workbook.getSheet("Sheet1");
//		
//		int rowsize=sh.getLastRowNum();
//		System.out.println(rowsize);
//		
//		int colSize=sh.getRow(1).getLastCellNum();
//		System.out.println(colSize);
//		
//		//get all Dta
//		
//		//outer for loop - rows
//		for(int r=0;r<=rowsize;r++)
//		{
//			XSSFRow currentrow=sh.getRow(r);
//			if(currentrow==null)
//			{
//				continue; 
//			}
//			for(int c=0;c<colSize;c++)
//			{
//				
//				XSSFCell data=currentrow.getCell(c);
//				if(data==null)
//				{
//					continue;
//				}
//				System.out.print(data.toString()+" ");
//			}
//			System.out.println();
//		}
//		
		
		//get data only from specific row
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\TestData\\\\Creden.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sh=workbook.getSheet("Sheet1");
		
		XSSFRow firstRows=sh.getRow(1);
		int col=firstRows.getLastCellNum();
		
		for(int i=0;i<col;i++)
		{
			XSSFCell cell=firstRows.getCell(i);
			System.out.print(cell.toString()+" ");
		}
		
		workbook.close();
		file.close();

	}
}
