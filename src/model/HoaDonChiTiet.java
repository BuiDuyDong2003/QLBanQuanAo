/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Quang Ha
 */
public class HoaDonChiTiet {
    private HoaDon hoadon;
    private ChiTietSanPham chitietsanpham;
    private Integer soluong;
    private double thanhtien;

    public HoaDonChiTiet() {
    }

    public HoaDonChiTiet(HoaDon hoadon, ChiTietSanPham chitietsanpham, Integer soluong, double thanhtien) {
        this.hoadon = hoadon;
        this.chitietsanpham = chitietsanpham;
        this.soluong = soluong;
        this.thanhtien = thanhtien;
    }

    public HoaDon getHoadon() {
        return hoadon;
    }

    public void setHoadon(HoaDon hoadon) {
        this.hoadon = hoadon;
    }

    public ChiTietSanPham getChitietsanpham() {
        return chitietsanpham;
    }

    public void setChitietsanpham(ChiTietSanPham chitietsanpham) {
        this.chitietsanpham = chitietsanpham;
    }

    public Integer getSoluong() {
        return soluong;
    }

    public void setSoluong(Integer soluong) {
        this.soluong = soluong;
    }

    public double getThanhtien() {
        return thanhtien;
    }

    public void setThanhtien(double thanhtien) {
        this.thanhtien = thanhtien;
    }
    
}
