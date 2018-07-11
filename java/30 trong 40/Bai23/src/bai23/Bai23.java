/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai23;

import java.util.Scanner;

/**
 *
 * @author Linh Liv
 */
public class Bai23 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Bai23 b23=new Bai23();
        
        
        b23.vitriMin(b23.nhap());
    }
    
    public int []nhap(){
        int n;
        do{
        System.out.print("Nhap n: ");
        n=new Scanner(System.in).nextInt();
        if (n<1)
                System.out.println("n phai > 0");
        }while (n<1);
        int [] a=new int[n];
        for (int i=0;i<n;i++){
            System.out.print("A["+i+"]: ");
            a[i]=new Scanner(System.in).nextInt();
        }
        return a;
    }
    public void vitriMin(int[] a){
        int min=a[0];
        for (int i=1;i<a.length;i++){
            if (min>a[i])
                min=a[i];
        }
        System.out.print("Vi tri Min: ");
        for (int i=0;i<a.length;i++)
            if (min==a[i])
                System.out.println("A["+i+"] ");
    }
}
