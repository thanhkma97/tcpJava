/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai21;

/**
 *
 * @author Linh Liv
 */
public class InHCN {

    

    public void inDac(float Dai,float Rong) {
        
        
        for (int i = 1; i <= Rong; i++) {
            for (int j = 1; j <= Dai; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        
    }

    public void inRong(float Dai,float Rong) {
        
        for (int i = 1; i <= Rong; i++) {
            for (int j = 1; j <= Dai; j++) {
                if (i == 1 || i == Rong) {
                    System.out.print("*");
                }
                else if (j == 1 || j == Dai) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}