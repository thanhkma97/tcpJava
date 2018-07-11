/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai.pkg12;

/**
 *
 * @author Linh Liv
 */
public class NgaySinh {

    public boolean loi = false;
    private boolean namnhuan = false;
    private int Ngay, Thang, Nam;
    private String NgaySinh;

    public void NgaySinh(String input) {
        try {
            this.loi=false;
            int dautien = input.indexOf("/");
            int cuoicung = input.lastIndexOf("/");
            int ngay = Integer.parseInt(input.substring(0, dautien));
            int thang = Integer.parseInt(input.substring(dautien + 1, cuoicung));
            int nam = Integer.parseInt(input.substring(cuoicung+1, input.length()));
            setNam(nam);
            setThang(thang);
            setNgay(ngay);
            if (this.loi == true) {
                System.out.println("Nhap sai!");                
            } else {
                this.loi=false;
                this.NgaySinh = input;                
            }
        } catch (NumberFormatException e) {
            System.out.println("Nhap sai!");
            this.loi=true;
        }
        catch(Exception e){
            System.out.println("Nhap sai!");
            this.loi=true;
        }
    }

    public String getNgaySinh() {

        return this.NgaySinh;
    }

    public void setNgay(int Ngay) {
        if (Ngay > 0) {
            switch (this.Thang) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12: {
                    if (Ngay <= 31) {
                        this.Ngay = Ngay;
                    } else {
                        this.loi = true;
                    }
                    break;
                }
                case 4:
                case 6:
                case 9:
                case 11: {
                    if (Ngay <= 30) {
                        this.Ngay = Ngay;
                    } else {
                        this.loi = true;
                    }
                    break;
                }
                case 2: {
                    if (namnhuan == true) {
                        if (Ngay <= 29) {
                            this.Ngay = Ngay;
                        } else {
                            this.loi = true;
                        }
                    } else if (Ngay <= 28) {
                        this.Ngay = Ngay;
                    } else {
                        this.loi = true;
                    }
                }

            }

        } else {
            this.loi = true;
        }
    }

    public void setThang(int Thang) {
        if (Thang > 0 && Thang <= 12) {
            this.Thang = Thang;
        } else {
            this.loi = true;
        }
    }

    public void setNam(int Nam) {

        if (Nam > 0 && Nam <= 2017) {
            if (Nam % 4 == 0) {
                if ((Nam % 100 == 0) && (Nam % 400 != 0)) {
                    namnhuan = false;
                }
                namnhuan = true;
            }
            
            this.Nam = Nam;
        } else {
            this.loi = true;
        }
    }

}
