/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Quang Ha
 */
public class LoaiSanPham {
        private String ma,ten,id;
    private Integer trangthai;

    public LoaiSanPham() {
    }

    public LoaiSanPham(String ma, String ten, String id) {
        this.ma = ma;
        this.ten = ten;
        this.id = id;
    }

   

    public LoaiSanPham(String ma, String ten, String id, Integer trangthai) {
        this.ma = ma;
        this.ten = ten;
        this.id = id;
        this.trangthai = trangthai;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(Integer trangthai) {
        this.trangthai = trangthai;
    }
    
}
