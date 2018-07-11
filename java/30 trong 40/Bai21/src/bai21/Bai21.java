/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai21;

import java.util.Scanner;

/**
 *
 * @author Linh Liv
 */
public class Bai21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        do {
            try {
                int x;

                do {
                    System.out.println("[1]. In hinh chu nhat dac");
                    System.out.println("[2]. In hinh chu nhat rong");
                    System.out.println("[3]. Thoat");
                    System.out.print("Chon: ");
                    x = new Scanner(System.in).nextInt();

                    HCN hcn1 = new HCN();

                    switch (x) {
                        case 1: {
                            hcn1.setDai();
                            hcn1.setRong();
                            hcn1.inDac(hcn1.getDai(), hcn1.getRong());
                            break;
                        }
                        case 2: {
                            hcn1.setDai();
                            hcn1.setRong();
                            hcn1.inRong(hcn1.getDai(), hcn1.getRong());
                            break;
                        }
                        case 3: {
                            break;
                        }
                        default: {
                            System.out.println("Nhap sai");
                        }
                    }
                } while (x != 3);
                break;
            } catch (Exception e) {
                System.out.println("Nhap sai");
            }
        } while (true);
    }

}
