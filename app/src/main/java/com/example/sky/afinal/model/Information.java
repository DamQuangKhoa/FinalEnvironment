package com.example.sky.afinal.model;

/**
 * Created by Sky on 08/12/2016.
 */

public class Information {
    private String khuVuc,mucLuc,image,ghiChu;
    private com.example.sky.afinal.model.Address address;
    private Date thoiGian;
    private int uuTien;

    public Information(String khuVuc, String mucLuc, String image, String ghiChu, Address address, Date thoiGian, int uuTien) {

        this.khuVuc = khuVuc;
        this.mucLuc = mucLuc;
        this.image = image;
        this.ghiChu = ghiChu;
        this.address = address;
        this.thoiGian = thoiGian;
        this.uuTien = uuTien;
    }

    public String getKhuVuc() {
        return khuVuc;
    }

    public void setKhuVuc(String khuVuc) {
        this.khuVuc = khuVuc;
    }

    public String getMucLuc() {
        return mucLuc;
    }

    public void setMucLuc(String mucLuc) {
        this.mucLuc = mucLuc;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Date getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(Date thoiGian) {
        this.thoiGian = thoiGian;
    }

    public int getUuTien() {
        return uuTien;
    }

    public void setUuTien(int uuTien) {
        this.uuTien = uuTien;
    }
}
