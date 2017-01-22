package com.example.sky.afinal.model;

/**
 * Created by Sky on 08/12/2016.
 */

public class Address {
    private String tenDuong,xa,phuong,quan;

    public Address(String quan, String tenDuong, String xa, String phuong) {
        this.quan = quan;
        this.tenDuong = tenDuong;
        this.xa = xa;
        this.phuong = phuong;
    }

    public String getTenDuong() {
        return tenDuong;
    }

    public void setTenDuong(String tenDuong) {
        this.tenDuong = tenDuong;
    }

    public String getXa() {
        return xa;
    }

    public void setXa(String xa) {
        this.xa = xa;
    }

    public String getPhuong() {
        return phuong;
    }

    public void setPhuong(String phuong) {
        this.phuong = phuong;
    }

    public String getQuan() {
        return quan;
    }

    public void setQuan(String quan) {
        this.quan = quan;
    }
}
