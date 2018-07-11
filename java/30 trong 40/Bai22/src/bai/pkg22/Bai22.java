/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai.pkg22;

import java.util.Scanner;

/**
 *
 * @author Linh Liv
 */
public class Bai22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        do {

            Bai22 b22 = new Bai22();
            float[] a = null;
            int n = 0;
            do {
                try {

                    System.out.print("Nhap n: ");
                    n = new Scanner(System.in).nextInt();
                    if (n < 1) {
                        System.out.println("n phai > 0");
                    }
                } catch (Exception e) {
                    System.out.println("Nhap sai!");
                }
            } while (n < 1);
            a = new float[n];
            for (int i = 0; i < n; i++) {
                try{
                System.out.print("A[" + i + "]: ");
                a[i] = Float.parseFloat(new Scanner(System.in).nextLine());
                }catch(Exception e){
                    System.out.println("Nhap sai");
                    i--;
                }
            }
            b22.Max(a);
            System.out.println("Nhan [y] de tiep tuc");
        } while ("y".equalsIgnoreCase(new Scanner(System.in).nextLine()));

    }

    public void Max(float[] a) {

        int n = a.length;
        float max = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("Max: " + max);
    }

}
