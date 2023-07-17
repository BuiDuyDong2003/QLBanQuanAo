/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package respository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author ADMIN
 */
public class DBContext {
    private  static String URL = "jdbc:sqlserver://localhost:1433;databaseName=TrangPhucCOS";
    private static  String USERNAME = "sa";
    private static  String PASSWORD = "1234";
    
    static {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static Connection getConnection(){
        Connection cn = null;
        try {
            cn = DriverManager.getConnection(URL,USERNAME,PASSWORD);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return cn;
    }
    public static void main(String[] args) {
        Connection cn = getConnection();
        if (cn!=null) {
            System.out.println("Thanh cong");
        }else{
            System.out.println("Khong thanh cong");
        }
    }
      
    
}
