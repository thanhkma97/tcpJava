/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai21;

import java.util.Scanner;

/**
 *
 * @author Linh Liv
 */
public class HCN extends InHCN{

    private float dai, rong;
    

    public float getDai() {
        return this.dai;
    }

    public void setDai() {
        do {
            try {
                do {
                    System.out.print("Nhap chieu dai: ");
                    this.dai = Float.parseFloat(new Scanner(System.in).nextLine());
                    if (dai < 2) {
                        System.out.println("Chieu dai phai >1");
                    }
                } while (this.dai < 2);
                break;
            } catch (Exception e) {
                System.out.println("Nhap sai");
            }
        } while (true);
    }

    public float getRong() {
        return this.rong;
    }

    public void setRong() {
        do{
            try{
                
               do{
                   System.out.print("Nhap rong: ");
                   this.rong=Float.parseFloat(new Scanner(System.in).nextLine());
                   if (this.rong<1)
                       System.out.println("Chieu rong phai >0");
                   if (this.rong>=this.dai)
                   {
                       System.out.println("Chieu rong < Chieu dai");
                       this.rong=0;
                   }
               } while (this.rong<1);
             break;
            }catch(Exception e){
                System.out.println("Nhap sai");
            }
                    
        }while(true);
    }

}
