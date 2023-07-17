/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Quang Ha
 */
public class ChiTietSanPham {
    private String id,maSP,tenSP,moTa,kichCo,mauSac,nhaPP,loaiSP;
    private double gianhap,giaban;
    private Integer soluong,trangthai;

    public ChiTietSanPham() {
    }

    public ChiTietSanPham(String id, String maSP, String tenSP, String moTa, String kichCo, String mauSac, String nhaPP, String loaiSP, double gianhap, double giaban, Integer soluong, Integer trangthai) {
        this.id = id;
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.moTa = moTa;
        this.kichCo = kichCo;
        this.mauSac = mauSac;
        this.nhaPP = nhaPP;
        this.loaiSP = loaiSP;
        this.gianhap = gianhap;
        this.giaban = giaban;
        this.soluong = soluong;
        this.trangthai = trangthai;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getKichCo() {
        return kichCo;
    }

    public void setKichCo(String kichCo) {
        this.kichCo = kichCo;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public String getNhaPP() {
        return nhaPP;
    }

    public void setNhaPP(String nhaPP) {
        this.nhaPP = nhaPP;
    }

    public String getLoaiSP() {
        return loaiSP;
    }

    public void setLoaiSP(String loaiSP) {
        this.loaiSP = loaiSP;
    }

    public double getGianhap() {
        return gianhap;
    }

    public void setGianhap(double gianhap) {
        this.gianhap = gianhap;
    }

    public double getGiaban() {
        return giaban;
    }

    public void setGiaban(double giaban) {
        this.giaban = giaban;
    }

    public Integer getSoluong() {
        return soluong;
    }

    public void setSoluong(Integer soluong) {
        this.soluong = soluong;
    }

    public Integer getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(Integer trangthai) {
        this.trangthai = trangthai;
    }

    @Override
    public String toString() {
        return "ChiTietSanPham{" + "id=" + id + ", maSP=" + maSP + ", tenSP=" + tenSP + ", moTa=" + moTa + ", kichCo=" + kichCo + ", mauSac=" + mauSac + ", nhaPP=" + nhaPP + ", loaiSP=" + loaiSP + ", gianhap=" + gianhap + ", giaban=" + giaban + ", soluong=" + soluong + ", trangthai=" + trangthai + '}';
    }
    
   
    
   
}
