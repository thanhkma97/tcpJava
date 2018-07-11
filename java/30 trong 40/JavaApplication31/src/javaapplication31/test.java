/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication31;

import java.util.Scanner;

/**
 *
 * @author Linh Liv
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        test t = new test();
        t.tim(t.mangA());
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

    public void tim(float[] a) {
        float[] b = new float[a.length];
        int z = 0;
        for (int i = 0; i < a.length; i++) {
            int j = 0;
            for (j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    break;
                }
            }
            if (j == a.length) {
                b[z] = a[i];
                z++;
            }
        }
        float[] s = new float[a.length];
        int u = 0;
        int t=0;
        for (int i=0;i<a.length;i++){
            for (int j=0;j<z;j++){
                if (a[i]==b[j]){
                    float temp=b[j];
                    b[j]=b[t];
                    b[t]=temp;
                    s[u]=i;
                    u++;
                }
            }
        }
        int min = (int) s[0];
        int max = (int) s[0];
        for (int i = 0; i < u; i++) {
            if (max < s[i]) {
                max = (int) s[i];
            }
            if (min > s[i]) {
                min = (int) s[i];
            }
        }
        System.out.println("Cuoi: A[" + max + "]");
        System.out.println("Dau: A[" + min + "]");
        for (int i=min;i<=max;i++){
            System.out.print(a[i]+" ");
        }
    }
}
