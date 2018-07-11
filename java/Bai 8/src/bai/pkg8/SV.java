/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai.pkg8;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Linh Liv
 */
public class SV {

    public ArrayList<SV> sv = new ArrayList<>();
    private String Ten;
    private int Tuoi;

    public SV() {

    }

    public SV(String Ten, int Tuoi) {
        this.Ten = Ten;
        this.Tuoi = Tuoi;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public int getTuoi() {
        return Tuoi;
    }

    public void setTuoi(int Tuoi) {
        this.Tuoi = Tuoi;
    }

    public void nhapSV() {
        int i = 0;

        do {

            SV sv1 = new SV();
            System.out.println("Sinh Vien " + (i + 1));
            System.out.print("Nhap ten: ");
            sv1.setTen(new Scanner(System.in).nextLine());
            while (true) {
                try {
                    System.out.print("Nhap tuoi: ");
                    sv1.setTuoi(new Scanner(System.in).nextInt());
                    break;
                } catch (Exception e) {
                    System.out.println("Ban da nhap sai!");

                }
            }
            i++;
            System.out.print("Thoat[y]: ");
            sv.add(sv1);
        } while ("y".equals(new Scanner(System.in).nextLine()) == false);

    }

    public void xuatSV() {
        if (!sv.isEmpty()) {
            for (int i = 0; i < sv.size(); i++) {
                System.out.println("Sinh Vien " + (i + 1));
                System.out.println("Ten: " + sv.get(i).getTen());
                System.out.println("Tuoi: " + sv.get(i).getTuoi());
                System.out.println("");
            }
        }
        else
            System.out.println("Chua co sinh vien");

        System.out.println("Nhan [Enter] de ve Menu");
        Scanner scan = new Scanner(System.in);
        scan.nextLine();

    }

    public void TimSV() {
        System.out.println("Nhap ten sinh vien: ");
        String tenSV = new Scanner(System.in).nextLine();
        int tim = 0;
        for (int i = 0; i < sv.size(); i++) {
            if (tenSV.equals(sv.get(i).getTen())) {
                System.out.println("Sinh Vien " + (i + 1));
                System.out.println("Ten: " + tenSV);
                System.out.println("Tuoi: " + sv.get(i).getTuoi());
                System.out.println("");
                tim = 1;
            }

        }
        if (tim == 0) {
            System.out.println("Khong tim thay!");
        }
        System.out.println("Nhan [Enter] de quay lai menu!");
        Scanner scan = new Scanner(System.in);
        scan.nextLine();
    }

}
