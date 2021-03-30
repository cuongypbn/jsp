/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.DBConnection;

/**
 *
 * @author vancuong
 */
public class Customer_coffe {
    Connection connection;
    DBConnection dbcon=new DBConnection();

    public Customer_coffe(DBConnection dbcon) {
        this.dbcon=dbcon;
        this.connection=dbcon.getConn();
    }

    public Customer_coffe() {
    }
    
    public ResultSet login(String user, String pass){
        ResultSet rs=null;
        String sql="select * from customer where UserName='"+user+"' and Ps='"+pass+"'";
        rs=dbcon.getData(sql);
        return rs; 
    }
//    public static void main(String[] args) {
//        try {
//            Customer_coffe ct=new Customer_coffe();
//            ResultSet rs=ct.login("admin", "admin");
//            if(rs.next())
//                System.out.println("ss"+rs.getInt("Cid"));
//        } catch (SQLException ex) {
//            Logger.getLogger(Customer_coffe.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
//    }
}
