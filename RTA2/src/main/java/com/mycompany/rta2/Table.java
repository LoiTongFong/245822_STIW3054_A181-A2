
package com.mycompany.rta2;

public class Table {
    
private String no, name, fideID, fed, rtg, clubOrCity;

    public Table( String no,String name, String fideID, String fed, String rtg, String clubOrCity){
         this.no = no;
         this.name = name;
         this.fideID = fideID;
         this.fed = fed;
         this.rtg = rtg; 
         this.clubOrCity = clubOrCity;
    }
   
    public void setNo(String no) {
        this.no = no;
     }
    
    public String getNo() {
        return no;
    }

     public void setName(String name) {
        this.name = name;
     }
     
    public String getName() {
        return name;
    }

     public void setFideID(String fideID) {
        this.fideID = fideID;
     }
     
    public String getFideID() {
        return fideID;
    }

     public void setFed(String Fed) {
        this.fed = fed;
     }
     
    public String getFed() {
        return fed;
    }

    public void setRtg(String rtg) {
        this.rtg = rtg;
    }
     
    public String getRtg() {
        return rtg;
    }

     public void setClubOrCity(String clubOrCity) {
        this.clubOrCity = clubOrCity;
    }
     
    public String getClubOrCity() {
        return clubOrCity;
    }
} 

