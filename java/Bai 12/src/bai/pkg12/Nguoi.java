/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai.pkg12;

/**
 *
 * @author Linh Liv
 */
public class Nguoi extends NgaySinh {
    private String HoTen;
    private String GT;

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getGT() {
        return GT;
    }

    public void setGT(String GT) {
        if (GT.equalsIgnoreCase("Nam")||(GT.equalsIgnoreCase("Nu"))){
            this.loi=false;
            this.GT = GT.toUpperCase();
        }
        else{
            System.out.println("Nhap sai");
            this.loi=true;
        } 
        
    }

}
