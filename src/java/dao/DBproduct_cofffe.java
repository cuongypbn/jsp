/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Product;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.DBConnection;

/**
 *
 * @author vancuong
 */
public class DBproduct_cofffe {
    Connection conn=null;
    DBConnection Dbcon=new DBConnection();
  

    public DBproduct_cofffe(DBConnection Dbcon) {
        this.Dbcon=Dbcon;
        this.conn=Dbcon.getConn();
    }

//    public DBproduct_cofffe() {
//    }
//    
//    public  void hienthi(String sql){
//        ResultSet rs= Dbcon.getData(sql);
//        try {
//            while(rs.next()){
//                System.out.println("id"+rs.getInt(1)+"thang ngay"+rs.getInt(2));
//            }} catch (SQLException ex) {
//            Logger.getLogger(DBproduct_cofffe.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
    
    public static void main(String[] args) {
//        DBproduct_cofffe cf=new DBproduct_cofffe();
//         PR.Pid , IC.Conten,IC.Gioithieu,IC.Thanhphan,IC.Sanxuattai,IC.Phanphoi,IC.Khoiluong,IC.Mau,IC.Muivi
//         String sql = "";
//        cf.hienthi(sql);
       
        
    }
}
