/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai.pkg8;

import java.util.Scanner;

/**
 *
 * @author Linh Liv
 */
public class Bai8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bai8 B8 = new Bai8();
        B8.menu();

    }

    public void menu() {
        boolean ok = true;
        SV sv=new SV();
        do {
            System.out.println("[1]. Nhap danh sach sinh vien");
            System.out.println("[2]. Hien danh sach sinh vien");
            System.out.println("[3]. Tim ten");
            System.out.println("[4]. Thoat");
            System.out.print("Nhap: ");
            Scanner scan = new Scanner(System.in);
            try{
                switch (scan.nextInt()) {
                    case 1: {
                        sv.nhapSV();
                        ok = false;
                        break;
                    }
                    
                    case 2: {
                        sv.xuatSV();
                        ok = false;
                        break;
                    }
                    case 3: {
                        sv.TimSV();
                        ok = false;
                        break;
                    }
                    case 4: {
                        ok = true;
                        break;
                    }
                    default: {
                        System.out.println("Ban da nhap sai!");
                        ok = false;
                    }
                }
            }
            catch (Exception e){
                System.out.println("Ban da nhap sai!");
                ok=false;
            }
        } while (ok == false);
    }   
}
