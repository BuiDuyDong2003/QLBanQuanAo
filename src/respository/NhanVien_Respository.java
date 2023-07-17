/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package respository;

import java.awt.JobAttributes;
import java.util.ArrayList;
import java.util.List;
import model.NhanVien;
import java.sql.*;
import javax.swing.JOptionPane;
import ultinity.JDBC_Helper;

/**
 *
 * @author Quang Ha
 */
public class NhanVien_Respository {
    public List<NhanVien> nhanviendangnhap(){
        List<NhanVien> listnv= new ArrayList<>();
        ResultSet rs;
        String sql="select id,ma,ten,gioitinh,ngaysinh,diachi,lienhe,matkhau,idcv,trangthai from nhanvien";
        rs=JDBC_Helper.selectTongQuat(sql);
        try {
            while (rs.next()) {                
                NhanVien nhanvien=new NhanVien();
                nhanvien.setId(rs.getString(1));
                nhanvien.setMa(rs.getString(2));
                nhanvien.setTen(rs.getString(3));
                nhanvien.setGioitinh(rs.getString(4));
                nhanvien.setNgaysinh(rs.getString(5));
                nhanvien.setDiachi(rs.getString(6));
                nhanvien.setLienhe(rs.getString(7));
                nhanvien.setMatkhau(rs.getString(8));
                nhanvien.setIdcv(rs.getString(9));
                nhanvien.setTrangthai(rs.getInt(10));
                listnv.add(nhanvien);
            }
            return listnv;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Khong co danh sach dang nhap");
            return null;
        }
    }
}
