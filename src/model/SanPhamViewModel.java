/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ADMIN
 */
public class SanPhamViewModel {
    public String idLSP,maLSP,tenLSP,idMS,maMau,tenMau,idKC,maKC,tenKC;

    public SanPhamViewModel(String idLSP, String maLSP, String tenLSP, String idMS, String maMau, String tenMau, String idKC, String maKC, String tenKC) {
        this.idLSP = idLSP;
        this.maLSP = maLSP;
        this.tenLSP = tenLSP;
        this.idMS = idMS;
        this.maMau = maMau;
        this.tenMau = tenMau;
        this.idKC = idKC;
        this.maKC = maKC;
        this.tenKC = tenKC;
    }

    public SanPhamViewModel(String maLSP, String tenLSP, String maMau, String tenMau, String maKC, String tenKC) {
        this.maLSP = maLSP;
        this.tenLSP = tenLSP;
        this.maMau = maMau;
        this.tenMau = tenMau;
        this.maKC = maKC;
        this.tenKC = tenKC;
    }

   
    public SanPhamViewModel() {
    }

    public String getIdLSP() {
        return idLSP;
    }

    public void setIdLSP(String idLSP) {
        this.idLSP = idLSP;
    }

    public String getMaLSP() {
        return maLSP;
    }

    public void setMaLSP(String maLSP) {
        this.maLSP = maLSP;
    }

    public String getTenLSP() {
        return tenLSP;
    }

    public void setTenLSP(String tenLSP) {
        this.tenLSP = tenLSP;
    }

    public String getIdMS() {
        return idMS;
    }

    public void setIdMS(String idMS) {
        this.idMS = idMS;
    }

    public String getMaMau() {
        return maMau;
    }

    public void setMaMau(String maMau) {
        this.maMau = maMau;
    }

    public String getTenMau() {
        return tenMau;
    }

    public void setTenMau(String tenMau) {
        this.tenMau = tenMau;
    }

    public String getIdKC() {
        return idKC;
    }

    public void setIdKC(String idKC) {
        this.idKC = idKC;
    }

    public String getMaKC() {
        return maKC;
    }

    public void setMaKC(String maKC) {
        this.maKC = maKC;
    }

    public String getTenKC() {
        return tenKC;
    }

    public void setTenKC(String tenKC) {
        this.tenKC = tenKC;
    }

    @Override
    public String toString() {
        return "SanPhamViewModel{" + "idLSP=" + idLSP + ", maLSP=" + maLSP + ", tenLSP=" + tenLSP + ", idMS=" + idMS + ", maMau=" + maMau + ", tenMau=" + tenMau + ", idKC=" + idKC + ", maKC=" + maKC + ", tenKC=" + tenKC + '}';
    }

   
    
}
