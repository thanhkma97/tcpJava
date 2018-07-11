/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai27;

import java.util.Scanner;

/**
 *
 * @author Linh Liv
 */
public class Bai27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bai27 b27=new Bai27();
        b27.Sapxep(b27.mangA());
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
        for (int i = 0; i < n; i++) {
            System.out.print("A[" + i + "]: ");
            a[i] = Float.parseFloat(new Scanner(System.in).nextLine());
        }
        return a;
    }
    public void Sapxep(float[] a){
        System.out.print("Truoc sep xep: ");
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        for (int i=0;i<a.length;i++){           
            for (int j=i+1;j<a.length;j++){
                if (a[i]>a[j])
                {
                    float temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
            
        }
        System.out.println("");
        System.out.print("Sau sep xep: ");
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }

}
