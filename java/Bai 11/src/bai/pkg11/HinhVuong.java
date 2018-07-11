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
public class HinhVuong implements TuGiac{

    private float canh;

    public float getCanh() {
        return canh;
    }

    public void setCanh(float canh) {
        while(canh<=0){
            if (canh <=0) {
                System.out.println("Canh >=0");
            }
            System.out.print("Nhap lai: ");
            canh=Float.parseFloat(new Scanner(System.in).nextLine());
        }
        this.canh = canh;
    }

    @Override
    public void ChuVi() {
        System.out.println("Chu vi: " + (this.canh * 4));
    }

    @Override
    public void DienTich() {
        System.out.println("Dien tich: " + (this.canh * this.canh));
    }

    public void VeHinh() {

        System.out.println("Hinh vuong\n");
        for (int i = 1; i <= Math.round(this.canh); i++) {
            for (int j = 1; j <= Math.round(this.canh); j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    
}
