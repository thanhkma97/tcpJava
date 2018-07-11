/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai26;

import java.util.Scanner;

/**
 *
 * @author Linh Liv
 */
public class Bai26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bai26 b26= new Bai26();
       b26.Tong(b26.mangA());
    }

    public float[] mangA() {
        int n;
        do {
            System.out.print("Nhap n: ");
            n = new Scanner(System.in).nextInt();
            if (n < 1) {
                System.out.println("n phai > 0");
            }
        } while (n < 1);
        float[] a = new float[n];
        for (int i=0;i<n;i++){
            System.out.print("Nhap A["+i+"]: ");
            a[i]=new Scanner(System.in).nextInt();
        }
        
        return a;
    }
    public void Tong(float [] a){
        float tong=0;
        for (int i=0;i<a.length;i++){
            if (a[i]<0){
                tong+=a[i];
            }
        }
        System.out.println("Tong: "+tong);
                
    }

}
