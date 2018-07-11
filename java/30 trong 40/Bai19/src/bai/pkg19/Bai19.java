/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai.pkg19;

/**
 *
 * @author Linh Liv
 */
public class Bai19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1=200000/1000;
        int n2=200000/1000;
        int n5=200000/1000;
        int sotien=200000;
        for (int i=0;i<n1;i++){
            for (int j=0;j<n2;j++){
                for (int z=0;z<n5;z++){
                    if (z*5000+j*2000+i*1000==sotien){
                        System.out.println("So to 5: "+z +" So to 2: "+j+" So to 1: "+i);
                        
                    }
                }
            }
        }
    }
    
}
