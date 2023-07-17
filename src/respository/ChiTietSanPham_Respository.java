/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package respository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.ChiTietSanPham;
import ultinity.JDBC_Helper;

/**
 *
 * @author Quang Ha
 */
public class ChiTietSanPham_Respository {

    public static List<ChiTietSanPham> getAllCTSP() {
        List<ChiTietSanPham> listctsp = new ArrayList<>();
        ResultSet rs;
        String sql = "select ChiTietSP.Id,SanPham.Ma,SanPham.Ten,Npp.Ten,MauSac.Ten,loaisP.Ten,kichco.ten,MoTa,GiaNhap,GiaBan,SoLuong,ChiTietSP.trangthai from ChiTietSp "
                + "join SanPham on ChiTietSP.IdSP=SanPham.Id "
                + "join KichCo on  ChiTietSP.IdKichCo=KichCo.Id "
                + "join MauSac on  ChiTietSP.IdMauSac=MauSac.Id "
                + "join LoaiSP on  ChiTietSP.IdLoaiSP=LoaiSP.Id "
                + "join npp on npp.id= ChiTietSP.idnpp";
        rs = JDBC_Helper.selectTongQuat(sql);
        try {
            while (rs.next()) {
                String id = rs.getString(1);
                String masp = rs.getString(2);
                String tensp = rs.getString(3);

                String tennsx = rs.getString(4);

                String tenms = rs.getString(5);

                String tendsp = rs.getString(6);
                String kc = rs.getString(7);

                String mota = rs.getString(8);

                double gn = rs.getDouble(9);
                double gb = rs.getDouble(10);
                int sl = rs.getInt(11);
                int tt = rs.getInt(12);

                ChiTietSanPham ctsp = new ChiTietSanPham(id, masp, tensp, mota, kc, tenms, tennsx, tendsp, gn, gb, sl, tt);
                listctsp.add(ctsp);
            }
            return listctsp;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static int them(ChiTietSanPham ctsp) {
        String sql = "declare @idlsp uniqueidentifier "
                + "set @idlsp = (select id from loaisp where ten=?)"
                + "declare @idms uniqueidentifier "
                + "set @idms = (select id from mausac where ten=?)"
                + "declare @idkc uniqueidentifier "
                + "set @idkc = (select id from kichco where ten=?)"
                + "declare @idsp uniqueidentifier "
                + "set @idsp = (select id from sanpham where ten=?)"
                + "declare @idnpp uniqueidentifier "
                + "set @idnpp = (select id from npp where ten=?)"
                + "insert into chitietsp(idloaisp,idms,idkc,idsp,idnpp,soluong,mota,gianhap,giaban,trangthai) values(@idlsp,@idms,@idkc,@idsp,@idnpp,?,?,?,?,?)";
        return JDBC_Helper.updateTongQuat(sql, ctsp.getLoaiSP(),ctsp.getMauSac(),ctsp.getKichCo(),ctsp.getTenSP(),
                ctsp.getNhaPP(),ctsp.getSoluong(),ctsp.getMoTa(),ctsp.getGianhap(),ctsp.getGiaban(),ctsp.getTrangthai());

    }

    public static void main(String[] args) {
        List<ChiTietSanPham> ctsp = new ArrayList<>();
        ctsp = getAllCTSP();
        System.out.println(ctsp.toString());
    }
}
