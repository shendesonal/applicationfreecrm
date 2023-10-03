package UtilityPackage;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

import TestBasePack.TestBase;

public class UtilityClass extends TestBase{

	public UtilityClass() throws IOException {
		super();}
		
		public static long PAGE_LOAD_TIMEOUT = 50;
		public static long IMPLICIT_WAIT = 50;
			
		public void frame(String frame) {
		driver.switchTo().frame(frame);}
				
				
	    public static String featchDatafromExcelSheet(String sheet,int row,int coloum) throws  IOException
					{
						String data;
						String path="\"C:\\Users\\sonal\\OneDrive\\Desktop\\Test.xlsx\"";
						FileInputStream file=new FileInputStream(path);
						data=WorkbookFactory.create(file).getSheet(sheet).getRow(row).getCell(coloum).getStringCellValue();
						try
						{
						   data=WorkbookFactory.create(file).getSheet(sheet).getRow(row).getCell(coloum).getStringCellValue();
							
						}
						catch(IllegalStateException e)
						{
						    double value=WorkbookFactory.create(file).getSheet(sheet).getRow(row).getCell(coloum).getNumericCellValue();
							data=Double.toString(value);
						}
						return data;
	}

}
