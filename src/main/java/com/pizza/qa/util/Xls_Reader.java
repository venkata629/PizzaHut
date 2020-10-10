package com.pizza.qa.util;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFCreationHelper;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Xls_Reader {
	public String path;
	
	public FileInputStream fis = null;
	public FileOutputStream fileOut = null;
	public XSSFWorkbook workbook = null;
	public static XSSFSheet sheet = null;
	public XSSFRow row = null;
	public XSSFCell cell = null;

	public Xls_Reader(String path) {

		this.path = path;
		try {
			fis = new FileInputStream(path);
			workbook = new XSSFWorkbook(fis);
			sheet = workbook.getSheetAt(0);
			fis.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	// returns the row count in a sheet

	public int getRowCount(String sheetName) {
		int index = workbook.getSheetIndex(sheetName);
		if (index == -1)
			return 0;
		else {
			sheet = workbook.getSheetAt(index);
			int number = sheet.getLastRowNum() + 1;
			return number;
		}

	}
	
	
	public static XSSFWorkbook wb;
	public static XSSFSheet sheet1;

	/**
	 * @param filePath  excel file path
	 * @param sheetName sheet name in xlsx file
	 * @return excel data
	 * @throws InvalidFormatException
	 * @throws IOException
	 */
	
	public static String filePath = "C:\\Users\\Venkata Chaganti\\eclipse-workspace\\PizzaMavenProject\\src\\main\\resources\\com\\pizza\\qa\\testdata\\PizzaHut_GuestUserDetails.xlsx" ;
	public static String sheetName = "GuestUser";
	public static Object[][] readExcel(String filePath, String sheetName) throws InvalidFormatException, IOException {
		FileInputStream file = new FileInputStream(filePath);
		wb = new XSSFWorkbook(file);
		sheet = wb.getSheet(sheetName);
		int rowCount = sheet.getLastRowNum();
		int column = sheet.getRow(0).getLastCellNum();
		Object[][] data = new Object[rowCount][column];
		for (int i = 1; i <= rowCount; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < column; j++) {
				XSSFCell cell = row.getCell(j);
				DataFormatter formatter = new DataFormatter();
				String val = formatter.formatCellValue(cell);
				data[i - 1][j] = val;
			}
		}
		return data;
	}

			// returns true if data is set successfully else false
	public boolean setCellData(String sheetName, String colName, int rowNum, String data) {
		try {
			fis = new FileInputStream(path);
			workbook = new XSSFWorkbook(fis);

			if (rowNum <= 0)
				return false;

			int index = workbook.getSheetIndex(sheetName);
			int colNum = -1;
			if (index == -1)
				return false;

			sheet = workbook.getSheetAt(index);

			row = sheet.getRow(0);
			for (int i = 0; i < row.getLastCellNum(); i++) {
				// System.out.println(row.getCell(i).getStringCellValue().trim());
				if (row.getCell(i).getStringCellValue().trim().equals(colName))
					colNum = i;
			}
			if (colNum == -1)
				return false;

			sheet.autoSizeColumn(colNum);
			row = sheet.getRow(rowNum - 1);
			if (row == null)
				row = sheet.createRow(rowNum - 1);

			cell = row.getCell(colNum);
			if (cell == null)
				cell = row.createCell(colNum);

			// cell style
			// CellStyle cs = workbook.createCellStyle();
			// cs.setWrapText(true);
			// cell.setCellStyle(cs);
			cell.setCellValue(data);

			fileOut = new FileOutputStream(path);

			workbook.write(fileOut);

			fileOut.close();

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	// returns true if data is set successfully else false
	// public boolean setCellData(String sheetName,String colName,int rowNum,
	// String data,String url){
	// //System.out.println("setCellData setCellData******************");
	// try{
	// fis = new FileInputStream(path);
	// workbook = new XSSFWorkbook(fis);
	//
	// if(rowNum<=0)
	// return false;
	//
	// int index = workbook.getSheetIndex(sheetName);
	// int colNum=-1;
	// if(index==-1)
	// return false;
	//
	//
	// sheet = workbook.getSheetAt(index);
	// //System.out.println("A");
	// row=sheet.getRow(0);
	// for(int i=0;i<row.getLastCellNum();i++){
	// //System.out.println(row.getCell(i).getStringCellValue().trim());
	// if(row.getCell(i).getStringCellValue().trim().equalsIgnoreCase(colName))
	// colNum=i;
	// }
	//
	// if(colNum==-1)
	// return false;
	// sheet.autoSizeColumn(colNum);
	// row = sheet.getRow(rowNum-1);
	// if (row == null)
	// row = sheet.createRow(rowNum-1);
	//
	// cell = row.getCell(colNum);
	// if (cell == null)
	// cell = row.createCell(colNum);
	//
	// cell.setCellValue(data);
	// XSSFCreationHelper createHelper = workbook.getCreationHelper();
	//
	// //cell style for hyperlinks
	// //by default hypelrinks are blue and underlined
	// CellStyle hlink_style = workbook.createCellStyle();
	// XSSFFont hlink_font = workbook.createFont();
	// hlink_font.setUnderline(XSSFFont.U_SINGLE);
	// hlink_font.setColor(IndexedColors.BLUE.getIndex());
	// hlink_style.setFont(hlink_font);
	// //hlink_style.setWrapText(true);
	//
	// XSSFHyperlink link = createHelper.createHyperlink(Xls_Reader.LINK_FILE);
	// link.setAddress(url);
	// cell.setHyperlink(link);
	// cell.setCellStyle(hlink_style);
	//
	// fileOut = new FileOutputStream(path);
	// workbook.write(fileOut);
	//
	// fileOut.close();
	//
	// }
	// catch(Exception e){
	// e.printStackTrace();
	// return false;
	// }
	// return true;
	// }

	// returns true if sheet is created successfully else false
	public boolean addSheet(String sheetname) {

		FileOutputStream fileOut;
		try {
			workbook.createSheet(sheetname);
			fileOut = new FileOutputStream(path);
			workbook.write(fileOut);
			fileOut.close();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	// returns true if sheet is removed successfully else false if sheet does
	// not exist
	public boolean removeSheet(String sheetName) {
		int index = workbook.getSheetIndex(sheetName);
		if (index == -1)
			return false;

		FileOutputStream fileOut;
		try {
			workbook.removeSheetAt(index);
			fileOut = new FileOutputStream(path);
			workbook.write(fileOut);
			fileOut.close();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	// returns true if column is created successfully
	public boolean addColumn(String sheetName, String colName) {
		// System.out.println("**************addColumn*********************");

		try {
			fis = new FileInputStream(path);
			workbook = new XSSFWorkbook(fis);
			int index = workbook.getSheetIndex(sheetName);
			if (index == -1)
				return false;

			XSSFCellStyle style = workbook.createCellStyle();
			// style.setFillForegroundColor(HSSFColor.GREY_40_PERCENT.index);
			// style.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);

			sheet = workbook.getSheetAt(index);

			row = sheet.getRow(0);
			if (row == null)
				row = sheet.createRow(0);

			// cell = row.getCell();
			// if (cell == null)
			// System.out.println(row.getLastCellNum());
			if (row.getLastCellNum() == -1)
				cell = row.createCell(0);
			else
				cell = row.createCell(row.getLastCellNum());

			cell.setCellValue(colName);
			cell.setCellStyle(style);

			fileOut = new FileOutputStream(path);
			workbook.write(fileOut);
			fileOut.close();

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

		return true;

	}

	// removes a column and all the contents
	public boolean removeColumn(String sheetName, int colNum) {
		try {
			if (!isSheetExist(sheetName))
				return false;
			fis = new FileInputStream(path);
			workbook = new XSSFWorkbook(fis);
			sheet = workbook.getSheet(sheetName);
			XSSFCellStyle style = workbook.createCellStyle();
			// style.setFillForegroundColor(HSSFColor.GREY_40_PERCENT.index);
			@SuppressWarnings("unused")
			XSSFCreationHelper createHelper = workbook.getCreationHelper();
			// style.setFillPattern(XSSFCellStyle.NO_FILL);
			for (int i = 0; i < getRowCount(sheetName); i++) {
				row = sheet.getRow(i);
				if (row != null) {
					cell = row.getCell(colNum);
					if (cell != null) {
						cell.setCellStyle(style);
						row.removeCell(cell);
					}
				}
			}
			fileOut = new FileOutputStream(path);
			workbook.write(fileOut);
			fileOut.close();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;

	}

	// find whether sheets exists
	public boolean isSheetExist(String sheetName) {
		int index = workbook.getSheetIndex(sheetName);
		if (index == -1) {
			index = workbook.getSheetIndex(sheetName.toUpperCase());
			if (index == -1)
				return false;
			else
				return true;
		} else
			return true;
	}

	// returns number of columns in a sheet
	public int getColumnCount(String sheetName) {
		// check if sheet exists
		if (!isSheetExist(sheetName))
			return -1;

		sheet = workbook.getSheet(sheetName);
		row = sheet.getRow(0);

		if (row == null)
			return -1;

		return row.getLastCellNum();

	}

	
	public int getCellRowNum(String sheetName, String colName, String cellValue) {

		for (int i = 2; i <= getRowCount(sheetName); i++) {
			if (getCellData(sheetName, colName, i).equalsIgnoreCase(cellValue)) {
				return i;
			}
		}
		return -1;

	}
	private String getCellData(String sheetName, String colName, int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
