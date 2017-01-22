package com.example.sky.afinal.model;

/**
 * Created by Sky on 08/12/2016.
 */

public class Date {
    private int gio,phut,ngay,thang,nam;

    public Date(int gio, int phut, int ngay, int thang, int nam) {
        this.gio = gio;
        this.phut = phut;
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }

    public int getGio() {
        return gio;
    }

    public void setGio(int gio) {
        if (gio > 24) {
            this.gio = 24;
        }

    }

    public int getPhut() {
        return phut;
    }

    public void setPhut(int phut) {
         if (phut > 60) {
            this.phut = 24;
        }
        this.phut= phut;
    }

    public int getNgay() {
        return ngay;
    }

    public void setNgay(int ngay) {
        if (ngay > 31) {
            this.ngay =31 ;
        }
        this.ngay= 31;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        if (thang > 12) {
            this.thang= 12;
        }
        this.thang= thang;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        if (phut > 3000) {
            this.phut = 2016;
        }
        this.nam= nam;
    }
}
