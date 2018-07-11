/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai.pkg12;

import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author Linh Liv
 */
public class Bai12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bai12 B12 = new Bai12();
        B12.menu();
    }
   
    
    QLGV qlgv=new QLGV();
    QLNhanVien qlnv=new QLNhanVien();
    public void menu() {
        int chon = 0;
        while (chon != 3) {
            System.out.println("[1]. Nhap va hien thi danh sach giao vien");
            System.out.println("[2]. Nhap va hien thi danh sach nhan vien");
            System.out.println("[3]. Ket thuc");
            System.out.print("Chon: ");
            
            switch (chon=new Scanner(System.in).nextInt()) {
                case 1: {
                    qlgv.nhapGV();
                    qlgv.xuatGV();
                    break;
                }
                case 2: {
                    qlnv.nhapNV();
                    qlnv.xuatNV();
                    break;
                }
                case 3: {
                    break;
                }
            }            
        }

    }
    

}
