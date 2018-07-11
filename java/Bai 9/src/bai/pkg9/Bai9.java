/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai.pkg9;

import java.util.Scanner;

/**
 *
 * @author Linh Liv
 */
public class Bai9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bai9 B9 = new Bai9();
        B9.menu();
    }

    public void menu() {
        boolean ok = true;
        int n = 0;
        do {
            System.out.println("[1]. Nhap so nguyen duong");
            System.out.println("[2]. Hien thi so nguyen to dung vong lap");
            System.out.println("[3]. Hien thi so nguyen to dung de quy");
            System.out.println("[4]. Thoat");
            System.out.print("Nhap: ");
            Scanner scan = new Scanner(System.in);
            try{
            switch (scan.nextInt()) {
                case 1: {
                    ok = false;
                    n = nhap();
                    break;
                }
                case 2: {
                    lap(n);
                    ok = false;
                    break;
                }
                case 3: {
                    ok = false;
                    int i=2;
                    switch(dequy(n,i)){
                        case 0:{
                            System.out.println(n +" khong phai la so nguyen to!");
                            break;
                        }
                        case 1:{
                            System.out.println(n + " la so nguyen to!");
                            break;
                        }
                        case -1:{
                            System.out.println("Chua nhap n!");
                        }
                    }
                    System.out.println("Nhan [Enter] de quay ve");
                    Scanner scan1=new Scanner(System.in);
                    scan1.nextLine();
                    break;
                }
                case 4: {
                    System.exit(0);
                }
                default: {
                    System.out.println("Ban da nhap sai");
                    ok = false;
                }
            }
            }
            catch (Exception e){
                System.out.println("Ban da nhap sai");
                ok=false;
            }
        } while (ok == false);
    }

    public int nhap() {
        int n = 0;
        do {
            try {
                System.out.print("Nhap n: ");
                n = new Scanner(System.in).nextInt();
                if (n <= 0) {
                    System.out.println("Ban phai nhap so nguyen duong!");
                }
            } catch (Exception e) {
                System.out.println("Ban phai nhap so nguyen duong!");
            }
        } while (n <= 0);
        return n;
    }

    public void lap(int n) {
        if (n == 0) {
            System.out.println("Chua nhap n!");
        } 
        else {
            if (n==1)
                System.out.println("1 khong phai la so nguyen to!");
            int i;
            for (i = 2; i < n; i++) {
                if (n % i == 0) {
                    System.out.println(n + " khong phai la so nguyen to!");
                    break;
                }
            }    
            if (i==n)
                System.out.println(n + " la so nguyen to!");
        }
        System.out.println("Nhan [Enter] de quay ve");
        Scanner scan=new Scanner(System.in);
        scan.nextLine();
    }
    public int dequy(int n,int i){
        if (n==0)
            return -1;
        if (n==1)
            return 0;
        if (n==2)
            return 1;
        else
        {
            if (n%i==0)
               return 0;
            else
                if (i==n-1)
                    return 1;
              return dequy(n,i+1);
        }          
    }
}
