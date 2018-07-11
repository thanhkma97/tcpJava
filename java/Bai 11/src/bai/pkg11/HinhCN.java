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
public class HinhCN implements TuGiac {

    private float dai, rong;

    public float getDai() {
        return dai;
    }

    public void setDai(float dai) {
        while (dai <= 0) {
            if (dai <= 0) {
                System.out.println("Dai >=0");
            }
            System.out.print("Nhap lai dai: ");
            dai = Float.parseFloat(new Scanner(System.in).nextLine());
        }
        this.dai = dai;
    }

    public float getRong() {
        return rong;
    }

    public void setRong(float rong) {
        while (rong <= 0 || this.dai <= rong) {
            if (rong <= 0) {
                System.out.println("Rong >=0");
            }
            if (rong >= this.dai) {
                System.out.println("Dai>Rong");
            }
            System.out.print("Nhap lai rong:");
            rong = Float.parseFloat(new Scanner(System.in).nextLine());
        }
        this.rong = rong;
    }

    @Override
    public void DienTich() {
        System.out.println("S: " + this.dai * this.rong);
    }

    @Override
    public void ChuVi() {
        System.out.println("Chu vi: " + (this.dai + this.rong) * 2);
    }

    public void VeHinh() {
        System.out.println("Ve Hinh Chu Nhat");
        for (int i = 1; i <= Math.round(this.rong); i++) {
            for (int j = 1; j <= Math.round(this.dai); j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}
