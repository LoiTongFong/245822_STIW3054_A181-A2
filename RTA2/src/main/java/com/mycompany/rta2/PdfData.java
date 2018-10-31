
package com.mycompany.rta2;



import java.io.FileOutputStream;
import java.io.IOException;
import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;



public class PdfData {
    
      
    public static void convertData()throws IOException{
      
        try {
            Document document = new Document() {};
            PdfWriter.getInstance(document,new FileOutputStream( "C:\\Users\\Tong Fong\\Desktop\\Result.pdf"));


            PdfPTable table = new PdfPTable(new float[]{10,50,20,15,10,40});

            for (int j = 4; j < 158; j++) {
                
                table.addCell(Excel.tableData.get(j).getNo());
                table.addCell(Excel.tableData.get(j).getName());
                table.addCell(Excel.tableData.get(j).getFideID());
                table.addCell(Excel.tableData.get(j).getFed());
                table.addCell(Excel.tableData.get(j).getRtg());
                table.addCell(Excel.tableData.get(j).getClubOrCity());

            }
            document.open();
            document.add(table);
            document.close();
            System.out.println("Pdf File had Created");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
