/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package respository;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.NhaPhanPhoi;
import ultinity.JDBC_Helper;

/**
 *
 * @author Quang Ha
 */
public class NhaPhanPhoi_Respository {
    public static List<NhaPhanPhoi> getAllNPP() {
        List<NhaPhanPhoi> listLSP = new ArrayList<>();
        ResultSet rs;
        String sql = "select  ma, ten,id from loaisp ";
        rs = JDBC_Helper.selectTongQuat(sql);
        try {
            while (rs.next()) {
                String ma = rs.getString(1);
                String ten = rs.getString(2);
                String id = rs.getString(3);
                NhaPhanPhoi lsp = new NhaPhanPhoi(id, ma, ten, id, ten, Integer.BYTES);
                listLSP.add(lsp);
            }
            return listLSP;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
