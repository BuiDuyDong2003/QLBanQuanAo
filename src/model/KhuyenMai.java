/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Quang Ha
 */
public class KhuyenMai {
    private String id,ma,ten,ngaybd,ngaykt;
    private Integer uudai,trangthai;

    public KhuyenMai() {
    }

    public KhuyenMai(String id, String ma, String ten, String ngaybd, String ngaykt, Integer uudai, Integer trangthai) {
        this.id = id;
        this.ma = ma;
        this.ten = ten;
        this.ngaybd = ngaybd;
        this.ngaykt = ngaykt;
        this.uudai = uudai;
        this.trangthai = trangthai;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getNgaybd() {
        return ngaybd;
    }

    public void setNgaybd(String ngaybd) {
        this.ngaybd = ngaybd;
    }

    public String getNgaykt() {
        return ngaykt;
    }

    public void setNgaykt(String ngaykt) {
        this.ngaykt = ngaykt;
    }

    public Integer getUudai() {
        return uudai;
    }

    public void setUudai(Integer uudai) {
        this.uudai = uudai;
    }

    public Integer getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(Integer trangthai) {
        this.trangthai = trangthai;
    }
    
}
