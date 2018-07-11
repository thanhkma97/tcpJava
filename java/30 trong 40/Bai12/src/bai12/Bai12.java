/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai12;

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
        do{
        try {
            int n = 0;
            do {
                System.out.print("Nhap n: ");
                n = new Scanner(System.in).nextInt();
            } while (n <= 0);
            float x;
            System.out.print("Nhap x: ");
            x = Float.parseFloat(new Scanner(System.in).nextLine());
            double s = 0;
            for (int i = 1; i <= n; i++) {
                s += Math.pow(-1, i) * Math.pow(x, 2 * i);
            }
            System.out.println("S: " + s);
            System.out.println("Nhan [y] de tiep tuc");
        } catch (Exception e) {
            System.out.println("Ban da nhap sai");
            System.out.println("Nhan [y] de tiep tuc");
        }
        }while("y".equals(new Scanner(System.in).nextLine()));
    }

}
