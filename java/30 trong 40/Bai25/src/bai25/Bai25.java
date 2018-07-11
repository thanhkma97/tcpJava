/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai25;

/**
 *
 * @author Linh Liv
 */
public class Bai25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dem=0;
        System.out.print("So nguyen to: 2 3 ");
        for (int i = 4; i <= 100; i++) {
            
           for (int j=3;j<i;j=j+2) {
                 if (i%j==0)
                   break;
                if ((i % j != 0)&&(j==i-2)) {
                    dem++;
                    System.out.print(i+" ");
                }
            }
        }
        System.out.printf("\nCo: %d\n",dem);
    }

}
