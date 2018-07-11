/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai.pkg10;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.Global.Infinity;

/**
 *
 * @author Linh Liv
 */
public class Bai10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bai10 B10 = new Bai10();
        B10.menu();
    }
    String a[];

    public void menu() {
        boolean ok = false;
        int n = 0;
        do {

            System.out.println("[1]. Nhap day so");
            System.out.println("[2]. Tim phan tu lon nhat");
            System.out.println("[3]. Tinh tong day");
            System.out.println("[4]. Thoat");
            System.out.print("Nhap: ");
            Scanner scan = new Scanner(System.in);
            switch (scan.nextInt()) {
                case 1: {
                    n = nhap(n);
                    break;
                }
                case 2: {
                    switch (kieu) {
                        case 1: {
                            int max = 0;
                            max = Max(mangA, n, max);
                            System.out.println("Max: " + max);
                            break;
                        }
                        case 2: {
                            float max = 0;
                            max = Max(mangB, n, max);
                            System.out.println("Max: " + max);
                            break;
                        }
                        case 3: {
                            double max = 0;
                            max = Max(mangC, n, max);
                            System.out.println("Max: " + max);
                            break;
                        }
                    }

                    System.out.println("Nhan [Enter] ve menu");
                    String scan1 = new Scanner(System.in).nextLine();
                    break;
                }
                case 3: {
                    switch (kieu) {
                        case 1: {
                            System.out.println("Tong: " + Sum(mangA, n));
                            break;
                        }
                        case 2: {
                            System.out.println("Tong: " + Sum(mangB, n));
                            break;
                        }
                        case 3: {
                            System.out.println("Tong: " + Sum(mangC, n));
                            break;
                        }
                    }

                    System.out.println("Nhan [Enter] ve menu");
                    scan.nextLine();
                    String scan1 = new Scanner(System.in).nextLine();
                    break;
                }
                case 4: {
                    ok = true;
                    break;

                }
                default: {
                    System.out.println("Ban da nhap sai");
                    System.out.println("Nhan [Enter] de tiep tuc!");
                    String scan1 = new Scanner(System.in).nextLine();
                }
            }

        } while (ok == false);

    }

    public int nhap(int n) {
        n = 0;
        do {
            try {
                Scanner scan = new Scanner(System.in);
                System.out.print("Nhap n: ");
                n = Integer.parseInt(scan.nextLine());
                if (n <= 0) {
                    System.out.println("Nhap n > 0");
                }
            } catch (NumberFormatException e) {
                System.out.println("Ban da nhap sai");
            }
        } while (n <= 0);

        XetA(n);//Xem A thuoc kieu gi
        return n;
    }
    int[] mangA;
    float[] mangB;
    double[] mangC;
    int kieu = 0;

    public void XetA(int n) {

        System.out.println("Phan tu dau quyet dinh kieu cua A[]");
        System.out.print("A[0]: ");
        String temp = new Scanner(System.in).nextLine();
        try {
            mangA = new int[n];
            mangA = TaoA(n, Integer.parseInt(temp));
            System.out.println("Ban da nhap mang kieu Int");
            kieu = 1;
        } catch (NumberFormatException i) {

            if (ok(temp) == false) {
                mangB = new float[n];
                mangB = TaoA(n, Float.parseFloat(temp));
                System.out.println("Ban da nhap mang kieu Float");
                kieu = 2;
            } else {

                mangC = new double[n];
                double tem=Double.parseDouble(temp);
                mangC = TaoA(n, tem);
                System.out.println("Ban da nhap mang kieu Double");
                kieu = 3;
            }
            System.out.println("Nhan [Enter] de quay ve");
            new Scanner(System.in).nextLine();
        }

    }

    public boolean ok(String temp) {
        try {
            return Float.parseFloat(temp) == Infinity;

        } catch (NumberFormatException e) {
            return false;
        }

    }

    public int[] TaoA(int n, int temp) {
        int[] mangA = new int[n];
        mangA[0] = temp;

        for (int i = 1; i < n; i++) {
            try {
                System.out.print("A[" + i + "]: ");
                mangA[i] = new Scanner(System.in).nextInt();
            } catch (Exception e) {
                System.out.println("Ban da nhap sai");
                i = i - 1;
            }
        }

        return mangA;
    }

    public float[] TaoA(int n, float temp) {
        float[] mangA = new float[n];
        mangA[0] = temp;
        for (int i = 1; i < n; i++) {
            try {
                System.out.print("A[" + i + "]: ");
                temp = mangA[i] = Float.parseFloat(new Scanner(System.in).nextLine());
                if (temp == Infinity) {
                    System.out.println("Ban da nhap sai");
                    i = i - 1;
                }
            } catch (NumberFormatException e) {

                System.out.println("Ban da nhap sai");
                i = i - 1;

            }

        }

        return mangA;
    }

    public double[] TaoA(int n, double temp) {
        double[] mangA = new double[n];
        mangA[0] = temp;
        for (int i = 1; i < n; i++) {
            try {
                System.out.print("A[" + i + "]: ");
                temp = mangA[i] = Double.parseDouble(new Scanner(System.in).nextLine());
                if (temp == Infinity) {
                    System.out.println("Ban da nhap sai");
                    i = i - 1;
                }
            } catch (NumberFormatException e) {

                System.out.println("Ban da nhap sai");
                i = i - 1;

            }

            
        }
        return mangA;
    }

    
    

    public float Max(float[] a, int n, float max) {
        if (n == 0) {
            return max;
        } else if (a[n - 1] > max) {
            max = a[n - 1];
        }
        return Max(a, n - 1, max);
    }

    public int Max(int[] a, int n, int max) {
        if (n == 0) {
            return max;
        } else if (a[n - 1] > max) {
            max = a[n - 1];
        }
        return Max(a, n - 1, max);
    }
    public double Max(double[]a,int n,double max){
        if (n == 0) {
            return max;
        } else if (a[n - 1] > max) {
            max =  a[n - 1];
        }
        return Max(a, n - 1, max);
    }

    public float Sum(float[] a, int n) {
        if (n == 0) {
            return 0;
        } else {
            return (a[n - 1] + Sum(a, n - 1));
        }
    }

    public double Sum(double[] a, int n) {
        if (n == 0) {
            return 0;
        } else {
            return (a[n - 1] + Sum(a, n - 1));
        }
    }

    public int Sum(int[] a, int n) {
        if (n == 0) {
            return 0;
        } else {
            return (a[n - 1] + Sum(a, n - 1));
        }
    }

}
