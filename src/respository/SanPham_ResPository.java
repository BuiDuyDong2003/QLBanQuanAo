/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package respository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.KichCo;
import model.LoaiSanPham;
import model.MauSac;
import ultinity.JDBC_Helper;
import model.SanPham;

/**
 *
 * @author Quang Ha
 */
public class SanPham_ResPository {

    public static List<LoaiSanPham> getAllLSP() {
        List<LoaiSanPham> listLSP = new ArrayList<>();
        ResultSet rs;
        String sql = "select  ma, ten,id from loaisp where trangthai =0 ";
        rs = JDBC_Helper.selectTongQuat(sql);
        try {
            while (rs.next()) {
                String ma = rs.getString(1);
                String ten = rs.getString(2);
                String id = rs.getString(3);
                LoaiSanPham lsp = new LoaiSanPham(ma, ten, id);
                listLSP.add(lsp);
            }
            return listLSP;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static LoaiSanPham getLSPbyma(String mad) {
        LoaiSanPham lsp = null;
        ResultSet rs;
        String sql = "Select id, ma, ten form loaisp where ma =?";
        rs = JDBC_Helper.selectTongQuat(sql, mad);
        try {
            while (rs.next()) {
                String ma = rs.getString("ma");
                String ten = rs.getString("ten");
                String id = rs.getString("id");
                lsp = new LoaiSanPham(ma, ten, id, null);
            }
            return lsp;
        } catch (Exception e) {
            return null;
        }
    }

    public static int themLoaiSanPham(LoaiSanPham lsp) {
        String sql = "insert into loaisp(ma,ten) values(?,?)";
        return JDBC_Helper.updateTongQuat(sql, lsp.getMa(), lsp.getTen());
    }

    public static List<MauSac> getAllMauSac() {
        List<MauSac> listMauSac = new ArrayList<>();
        ResultSet rs;
        String sql = "select id, ma, ten from mausac where trangthai = 0 ";
        rs = JDBC_Helper.selectTongQuat(sql);
        try {
            while (rs.next()) {
                String ma = rs.getString("ma");
                String ten = rs.getString("ten");
                String id = rs.getString("id");
                MauSac ms = new MauSac(ma, ten, id, null);
                listMauSac.add(ms);
            }

            return listMauSac;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static MauSac getMauSacbyma(String mad) {
        MauSac lsp = null;
        ResultSet rs;
        String sql = "Select id, ma, ten from mausac where ma =?";
        rs = JDBC_Helper.selectTongQuat(sql, mad);
        try {
            while (rs.next()) {
                String ma = rs.getString("ma");
                String ten = rs.getString("ten");
                String id = rs.getString("id");
                lsp = new MauSac(ma, ten, id, null);
            }
            return lsp;
        } catch (Exception e) {
            return null;
        }
    }

    public static int themMauSac(MauSac ms) {
        String sql = "insert into mausac(ma,ten) values(?,?)";
        return JDBC_Helper.updateTongQuat(sql, ms.getMa(), ms.getTen());
    }

    public static List<KichCo> getAllKichCo() {
        List<KichCo> listKichCo = new ArrayList<>();
        ResultSet rs;
        String sql = "select id, ma, ten from kichco where trangthai = 0 ";
        rs = JDBC_Helper.selectTongQuat(sql);
        try {
            while (rs.next()) {
                String ma = rs.getString("ma");
                String ten = rs.getString("ten");
                String id = rs.getString("id");
                KichCo kc = new KichCo(ma, ten, id, null);
                listKichCo.add(kc);
            }

            return listKichCo;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static KichCo getKichCobyma(String kc) {
        KichCo ms = null;
        ResultSet rs;
        String sql = "Select id, ma, ten from kichco where ma =?";
        rs = JDBC_Helper.selectTongQuat(sql, kc);
        try {
            while (rs.next()) {
                String ma = rs.getString("ma");
                String ten = rs.getString("ten");
                String id = rs.getString("id");
                ms = new KichCo(ma, ten, id, null);
            }
            return ms;
        } catch (Exception e) {
            return null;
        }
    }

    public static int themKichCo(KichCo kc) {
        String sql = "insert into kinhco(ma,ten) values(?,?)";
        return JDBC_Helper.updateTongQuat(sql, kc.getMa(), kc.getTen());
    }
//update 

    public static int updateLSP(LoaiSanPham lsp) {
        String sql = "update loaisp set ma= ?, ten =? where id =?";
        return JDBC_Helper.updateTongQuat(sql, lsp.getMa(), lsp.getTen(), lsp.getId());
    }

    public static int updateMS(MauSac ms) {
        String sql = "update mausac set ma =?, ten =? where id= ?";
        return JDBC_Helper.updateTongQuat(sql, ms.getMa(), ms.getTen(), ms.getId());
    }

    public static int updateKC(KichCo kc) {
        String sql = "update kichco set ma =?, ten = ? where id=?";
        return JDBC_Helper.updateTongQuat(sql, kc.getMa(), kc.getTen(), kc.getId());
    }
// xóa

    public static int deleteLSP(LoaiSanPham lsp) {
        String sql = "update loaisp set trangthai = 5  where id = ?";
        return JDBC_Helper.updateTongQuat(sql, lsp.getId());
    }

    public static int deleteMS(MauSac ms) {
        String sql = "update mausac set trangthai =5  where id = ?";
        return JDBC_Helper.updateTongQuat(sql, ms.getId());
    }

    public static int deleteKichCo(KichCo kc) {
        String sql = "update kichco set trangthai = 5 where id = ?";
        return JDBC_Helper.updateTongQuat(sql, kc.getId());
    }

    public static void main(String[] args) {
        List list = new ArrayList<>();
        list = getAllLSP();
        System.out.println(list.toString());
    }
}
