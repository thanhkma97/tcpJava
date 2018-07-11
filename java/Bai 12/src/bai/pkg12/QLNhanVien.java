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
public class QLNhanVien {

    int i = 0;
    ArrayList<NhanVien> nv = new ArrayList<>();

    public void nhapNV() {
       
        do {
            NhanVien NV = new NhanVien();
            System.out.println("Nhan Vien " + (i + 1));
            System.out.print("Ten: ");
            NV.setHoTen(new Scanner(System.in).nextLine());
            do{
            System.out.print("Gioi Tinh (Nam/Nu): ");
            NV.setGT(new Scanner(System.in).nextLine());
            }while(NV.loi==true);
            do{
            System.out.print("NgayThangNam (25/10/1997): ");          
            NV.NgaySinh(new Scanner(System.in).nextLine());                     
            }while(NV.loi==true);
            System.out.print("Cong Viec: ");
            NV.setCongViec(new Scanner(System.in).nextLine());
            System.out.print("Phong: ");
            NV.setSoPhong(new Scanner(System.in).nextLine());
            i++;
            nv.add(NV);
        } while (TiepTuc() == 0);
    }
     public void xuatNV(){
            char c=' ';
            System.out.println("Danh Sach Nhan Vien:");
            System.out.printf("STT%-10cHoTen%-20cNgaySinh%-10cGT%-10cCongViec%-10cPhong\n",c,c,c,c,c);
            for (int j=0;j<i;j++){
                System.out.printf("%-13d%-25s%-18s%-12s%-18s%-15s\n",j+1,nv.get(j).getHoTen(),nv
                .get(j).getNgaySinh(),nv.get(j).getGT(),nv.get(j).getCongViec(),nv.get(j).getSoPhong());
            }      
            System.out.println("");
     }
     public int TiepTuc(){
        System.out.print("Thoat [y]: ");
        String tt=new Scanner(System.in).nextLine();
        if (tt.equals("y")||tt.equals("Y"))
            return 1;
        else
            return 0;
    }
}
