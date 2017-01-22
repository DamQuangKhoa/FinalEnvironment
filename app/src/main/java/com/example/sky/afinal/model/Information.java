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
}
