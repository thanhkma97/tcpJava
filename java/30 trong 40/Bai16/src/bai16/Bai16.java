/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai16;

import java.util.Scanner;

/**
 *
 * @author Linh Liv
 */
public class Bai16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        do{
            try{
                int n;
                do{
                    System.out.print("Nhap n: ");
                    n=new Scanner(System.in).nextInt();
                    if (n<=0)
                        System.out.println("DK: n>0");
                }while(n<=0);
                float x;
                System.out.print("Nhap x: ");
                x=Float.parseFloat(new Scanner(System.in).nextLine());
                double s=0;
                int gt=1;
                for(int i=1;i<=n;i++){
                    gt*=i;
                    s+=Math.pow(-1, i)*Math.pow(x, i)/gt;
                }
                System.out.println("S: "+s);
            }catch(Exception e){
                System.out.println("Ban da nhap sai");
            }
            System.out.println("Nhan [Y] de thoat!");
        }while(!"y".equalsIgnoreCase(new Scanner(System.in).nextLine()));
    }
    
}
