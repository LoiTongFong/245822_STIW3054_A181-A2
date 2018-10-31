
package com.mycompany.rta2;


import java.io.IOException;


public class Main {
    
    public static void main(String args[])throws IOException{
        try{
            Thread.sleep(1000);
            System.out.println("Reading The Excel File");
            Thread.sleep(500);
            Excel.readExcel();
            Thread.sleep(1000);
            System.out.println("Creating Excel File");
            Thread.sleep(1000);
            PdfData.convertData();
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
}
