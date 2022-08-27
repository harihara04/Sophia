package com.Sindhu.ReuseablePackage;

import java.io.File;
import java.util.HashMap;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelOperation {
	
	String filepath;
	Sheet sh;

	public ExcelOperation(String sheetName) {

		try {
			filepath =System.getProperty("usr.dir")+PropertiesOperation.getPropertyValueByKey("STestData");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		File testdataFile = new File(filepath);

		Workbook wb = null;

		try {
			wb = WorkbookFactory.create(testdataFile);
		} catch (Exception e) {
		}

		sh = wb.getSheet(sheetName);
	}

	@SuppressWarnings("deprecation")
	public HashMap<String,String> getTestDataInMap(int rowNum){

		HashMap<String,String> hm = new HashMap<String,String>();

		for(int i=0; i<sh.getRow(0).getLastCellNum();i++) {
			sh.getRow(rowNum).getCell(i).setCellType(CellType.STRING);
			hm.put(sh.getRow(0).getCell(i).toString(), sh.getRow(rowNum).getCell(i).toString());

		}
		return hm;

	}


}
