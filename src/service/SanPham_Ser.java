/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.KichCo;
import model.LoaiSanPham;
import model.MauSac;
import model.SanPham;

/**
 *
 * @author Quang Ha
 */
public interface SanPham_Ser {

    List<LoaiSanPham> getAllLSP();

    LoaiSanPham getLSPbyma(String mad);

    int themLoaiSanPham(LoaiSanPham lsp);

    List<MauSac> getAllMauSac();

    MauSac getMauSacbyma(String mad);

    int themMauSac(MauSac ms);

    List<KichCo> getAllKichCo();

    KichCo getKichCobyma(String kc);

    int themKichCo(KichCo kc);

    int updateLSP(LoaiSanPham lsp);

    int updateMS(MauSac ms);

    int updateKC(KichCo kc);

    int deleteLSP(LoaiSanPham lsp);

    int deleteMS(MauSac ms);

    int deleteKichCo(KichCo kc);
}
