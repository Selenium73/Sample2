package pkg1;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Read_Excel {

	
		public static void main(String[] args) throws Throwable{

			getTestData("Sheet1");

		}

		public static Object getTestData(String sheetName) throws Throwable{

			File file = new File("C:\\Users\\Praveen.Sunkara\\Desktop\\Collections_Difference2.xls");
			FileInputStream fis = new FileInputStream(file);

			Workbook workbook = WorkbookFactory.create(fis);

			Sheet sheet = workbook.getSheet(sheetName);

			Object data[][] = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
			
			for(int i = 0;i<sheet.getLastRowNum();i++){

				for(int j = 0;j<sheet.getRow(i).getLastCellNum();j++){

					System.out.println(sheet.getRow(i+1).getCell(j).toString());

				}
			}return data;

		}

	}


