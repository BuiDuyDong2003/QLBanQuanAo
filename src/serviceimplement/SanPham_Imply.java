/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serviceimplement;

import java.util.List;
import model.KichCo;
import model.LoaiSanPham;
import model.MauSac;
import model.SanPham;
import respository.SanPham_ResPository;
import service.SanPham_Ser;

/**
 *
 * @author Quang Ha
 */
public class SanPham_Imply implements SanPham_Ser {

    @Override
    public List<LoaiSanPham> getAllLSP() {
        return SanPham_ResPository.getAllLSP();
    }

    @Override
    public LoaiSanPham getLSPbyma(String mad) {
        return SanPham_ResPository.getLSPbyma(mad);
    }

    @Override
    public int themLoaiSanPham(LoaiSanPham lsp) {
        return SanPham_ResPository.themLoaiSanPham(lsp);
    }

    @Override
    public List<MauSac> getAllMauSac() {
        return SanPham_ResPository.getAllMauSac();
    }

    @Override
    public MauSac getMauSacbyma(String mad) {
        return SanPham_ResPository.getMauSacbyma(mad);
    }

    @Override
    public int themMauSac(MauSac ms) {
        return SanPham_ResPository.themMauSac(ms);
    }

    @Override
    public List<KichCo> getAllKichCo() {
        return SanPham_ResPository.getAllKichCo();
    }

    @Override
    public KichCo getKichCobyma(String kc) {
        return SanPham_ResPository.getKichCobyma(kc);
    }

    @Override
    public int themKichCo(KichCo kc) {
        return SanPham_ResPository.themKichCo(kc);
    }

    @Override
    public int updateLSP(LoaiSanPham lsp) {
return SanPham_ResPository.updateLSP(lsp);}

    @Override
    public int updateMS(MauSac ms) {
return SanPham_ResPository.updateMS(ms);    }

    @Override
    public int updateKC(KichCo kc) {
return SanPham_ResPository.updateKC(kc);    }

    @Override
    public int deleteLSP(LoaiSanPham lsp) {
return SanPham_ResPository.deleteLSP(lsp);    }

    @Override
    public int deleteMS(MauSac ms) {
return SanPham_ResPository.deleteMS(ms);    }

    @Override
    public int deleteKichCo(KichCo kc) {
return SanPham_ResPository.deleteKichCo(kc);    }
}
