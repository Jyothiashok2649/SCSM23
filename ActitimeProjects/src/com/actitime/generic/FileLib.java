package com.actitime.generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class FileLib 
{


	public String getpropertydata(String key) throws IOException {
		FileInputStream fls=new FileInputStream("./data/comman.property");
	    Properties p=new Properties();
      	p.load(fls);
	    String data = p.getProperty(key);
	    return data;
	}
	public String getExcelfile(String sheetname,int row,int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fls=new FileInputStream("./data/testscript.xlsx");
		Workbook wb = WorkbookFactory.create(fls);
		String data = wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		return data;
	}
	

}
