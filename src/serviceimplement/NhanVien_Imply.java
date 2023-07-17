/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serviceimplement;

import java.util.List;
import model.NhanVien;
import respository.NhanVien_Respository;
import service.NhanVien_Ser;

/**
 *
 * @author Quang Ha
 */
public class NhanVien_Imply implements NhanVien_Ser{
    private NhanVien_Respository nhanvienres=new NhanVien_Respository();
    @Override
    public List<NhanVien> nhanviendangnhap() {
        return nhanvienres.nhanviendangnhap();
    }
    
}
