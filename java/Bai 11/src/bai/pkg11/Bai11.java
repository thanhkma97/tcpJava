/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai.pkg11;

import java.util.Scanner;

/**
 *
 * @author Linh Liv
 */
public class Bai11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bai11 b11 = new Bai11();
        b11.menu();
    }

    public void menu() {
        int chon = 0;
        do {
            try {
                System.out.println("[1]. Thao tac voi hinh vuong");
                System.out.println("[2]. Thao tac voi hinh chu nhat");
                System.out.println("[3]. Ket thuc");
                System.out.print("Chon: ");
                switch (chon = new Scanner(System.in).nextInt()) {
                    case 1: {
                        hv();
                        break;
                    }
                    case 2: {
                        hcn();
                        break;
                    }
                    default: {
                        break;
                    }
                }
            } catch (Exception e) {
                Sai();
            }
        } while (chon != 3);
    }

    public void hv() {
        do {
            try {
                System.out.print("Nhap canh n: ");
                float n;
                n = Float.parseFloat(new Scanner(System.in).nextLine());
                HinhVuong hv = new HinhVuong();
                hv.setCanh(n);
                hv.ChuVi();
                hv.DienTich();
                hv.VeHinh();
                dung();
                break;
            } catch (NumberFormatException e) {
                Sai();
            }
        } while (true);
    }

    public void dung() {
        System.out.println("Nhan [Enter] de ve menu");
        new Scanner(System.in).nextLine();
    }

    public void hcn() {
        do {
            try {
                System.out.print("Nhap chieu dai: ");
                float dai;
                dai = Float.parseFloat(new Scanner(System.in).nextLine());
                HinhCN cn = new HinhCN(); 
                cn.setDai(dai);
                System.out.print("Nhap rong: ");
                float rong;
                rong = Float.parseFloat(new Scanner(System.in).nextLine());                               
                cn.setRong(rong);
                cn.ChuVi();
                cn.DienTich();
                cn.VeHinh();
                dung();
                break;
            } catch (NumberFormatException e) {
                Sai();
            }
        } while (true);
    }

    public void Sai() {
        System.out.println("Ban da nhap sai");
        System.out.println("[Enter] de tiep tuc");
        new Scanner(System.in).nextLine();
    }

}
