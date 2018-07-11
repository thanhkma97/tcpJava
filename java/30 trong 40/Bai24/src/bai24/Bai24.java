/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai24;

import java.util.Scanner;

/**
 *
 * @author Linh Liv
 */
public class Bai24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bai24 b24 = new Bai24();
        b24.kt(b24.mangA());
    }

    public int[] mangA() {
        int n;
        do {
            System.out.print("Nhap n: ");
            n = new Scanner(System.in).nextInt();
            if (n<1)
                System.out.println("n phai > 0");
        } while (n < 1);
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("A[" + i + "]: ");
            a[i] = new Scanner(System.in).nextInt();
        }
        return a;
    }

    public void kt(int[] a) {
        int i;
        for (i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0 && a[i] < 2004) {
                System.out.println("Co so nguyen thoa man");
                break;
            }
        }
        if (i == a.length) {
            System.out.println("Khong co so thoa man");
        }

    }

}
