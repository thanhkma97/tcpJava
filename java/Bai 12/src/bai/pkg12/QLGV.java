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
public class QLGV {

    ArrayList<GiaoVien> gv = new ArrayList<>();
    int i = 0;

    public void nhapGV() {
        
        do {
            GiaoVien GV = new GiaoVien();
            System.out.println("Giao Vien " + (i + 1));
            System.out.print("Ten: ");            
            GV.setHoTen(new Scanner(System.in).nextLine());
            do{
            System.out.print("Gioi Tinh (Nam/Nu): ");            
            GV.setGT(new Scanner(System.in).nextLine());
            }while(GV.loi==true);
            do {
                System.out.print("NgayThangNam (25/10/1997): ");
                GV.NgaySinh(new Scanner(System.in).nextLine());
            } while (GV.loi == true);
            System.out.print("Chuyen nganh: ");
            GV.setChNganh(new Scanner(System.in).nextLine());
            i++;
            gv.add(GV);
            System.out.println("ok");
        } while (TiepTuc() == 0);
    }

    public void xuatGV() {
        char c = ' ';
        System.out.println("Danh Sach Giao Vien:");
        System.out.printf("STT%-10cHoTen%-20cNgaySinh%-10cGT%-5cChuyenNganh\n", c, c, c, c);
        for (int j = 0; j < i; j++) {
            System.out.printf("%-13d%-25s%-18s%-7s%s\n", j + 1, gv.get(j).getHoTen(), gv
                    .get(j).getNgaySinh(), gv.get(j).getGT(), gv.get(j).getChNganh());
        }
        System.out.println("");
    }

    public int TiepTuc() {
        System.out.print("Thoat [y]: ");
        String tt = new Scanner(System.in).nextLine();
        if (tt.equals("y") || tt.equals("Y")) {
            return 1;
        } else {
            return 0;
        }
    }

}
