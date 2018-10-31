
package com.mycompany.rta2;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Excel{
    
    public static ArrayList<Table> tableData = new ArrayList<Table>();


    public static void readExcel() throws IOException{
        
      try{ 
           FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Tong Fong\\Desktop\\ChessResultsList.xlsx");
           XSSFWorkbook wb = new XSSFWorkbook(fileInputStream);
           XSSFSheet sheet=wb.getSheetAt(0);
           DataFormatter dataFormatter = new DataFormatter();
          Iterator<Row> rowIterator = sheet.rowIterator();


          while (rowIterator.hasNext()) {
              Row row = rowIterator.next();
              String no = dataFormatter.formatCellValue(row.getCell(0));
              String name = dataFormatter.formatCellValue(row.getCell(2));
              String fideID = dataFormatter.formatCellValue(row.getCell(3));
              String fed = dataFormatter.formatCellValue(row.getCell(4));
              String rtg = dataFormatter.formatCellValue(row.getCell(5));
              String clubOrCity = dataFormatter.formatCellValue(row.getCell(6));
              tableData.add(new Table(no, name, fideID, fed, rtg, clubOrCity));


          }

           wb.close();
           fileInputStream.close();
           System.out.println("Excel File had readed");
      }catch(Exception e){
          e.printStackTrace();
      }
    }
    
 }