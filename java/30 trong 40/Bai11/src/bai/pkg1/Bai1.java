/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai.pkg1;

import java.util.Scanner;

/**
 *
 * @author Linh Liv
 */
public class Bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here   
        String tt = null;
        do{
            try {
                int n = 0;
                do {
                    
                    System.out.print("Nhap n: ");
                    n = new Scanner(System.in).nextInt();
                    if (n<=0)
                        System.out.println("n>0");
                } while (n <= 0);
                System.out.print("Nhap x: ");
                float x;
                x = Float.parseFloat(new Scanner(System.in).nextLine());
                double s = 0;
                for (int i = 1; i <= n; i++) {
                    s += Math.pow(-1, i - 1) * Math.pow(x, i);
                }
                System.out.println("S: " + s);
                
                
            } catch (Exception e) {
                System.out.println("Nhap sai");
            }
            System.out.println("Nhan [y] de tiep tuc");
            tt=new Scanner(System.in).nextLine();
        }while(tt.equals("y"));
    }

}
