/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai17;

import java.util.Scanner;

/**
 *
 * @author Linh Liv
 */
public class Bai17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        do {
            try {
                int n;
                do {
                    System.out.print("Nhap n: ");
                    n = new Scanner(System.in).nextInt();
                    if (n <= 0) {
                        System.out.println("DK n>0");
                    }

                } while (n <= 0);
                System.out.print("Nhap x: ");
                float x;
                x=Float.parseFloat(new Scanner(System.in).nextLine());
                double s=0;
                
                for (int i=1;i<n;i++){
                    int gt=1;
                    for (int j=1;j<=2*i;j++)
                    {
                        gt*=j;
                    }
                    s+=Math.pow(-1, i+1)*Math.pow(x,2*i)/gt;
                    
                }
                System.out.println("S: "+(s-1));
            } catch (Exception e) {
                System.out.println("Ban da nhap sai");
            }
            System.out.println("Thoat nhan [Y]");
        } while (!"y".equalsIgnoreCase(new Scanner(System.in).nextLine()));
    }

}
