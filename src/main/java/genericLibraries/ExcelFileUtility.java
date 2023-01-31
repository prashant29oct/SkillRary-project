package genericLibraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.model.WorkbookRecordList;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * This class contains reusable methods to perform operations on the excel file
 * @Prashant
 *
 */
public class ExcelFileUtility {
	private Workbook workbook;
	/**
	 * This Method is used to initialize excel file
	 * @param excelPath
	 */
    
	public void excelInitialization(String excelpath) {
		
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(excelpath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		//Workbook workbook=null;
		try {
			workbook = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException | IOException e) {
			e.printStackTrace();
		} 
		
	}
	/**
	 * This method is used to fetch single data from excel file
	 * @param excelpath
	 * @param sheetName
	 * @param rowNum
	 * @param cellNum
	 * @return
	 */
	public String fetchDataFromExcel(String sheetName, int rowNum, int cellNum) {
		
		return workbook.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
	}
	
	/**
	 * This method is used to fetch the multiple data from excel
	 */
	
	
	public List<String> fetchDataFromExcel(String sheetName){
		List<String> list = new ArrayList<>();
		Sheet sheet = workbook.getSheet(sheetName);
		for(int i=0; i<4; i++) {
			String data = sheet.getRow(i).getCell(1).getStringCellValue();
			list.add(data);
		}
		return list;
		
	}
	
	/**
	 * This method is used to close the workbook
	 */	
public void closeworkbook() {
	try {
		workbook.close();
	} catch (IOException e) {
		e.printStackTrace();
	}
}

}
