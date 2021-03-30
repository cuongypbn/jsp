/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author chienbinhdondoc
 */
public class DBConnection {
      Connection conn = null;

    //khong tham so
    public DBConnection() {
        try {
            //driver
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=ProductCoffe", "sa", "123456");

            System.out.println("Connected");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        public ResultSet getData(String sql) {
        ResultSet rs = null;
        try {
            Statement sta = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            rs = sta.executeQuery(sql);

        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }

    public Connection getConn() {
        return conn;
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }
        
        public static void main(String[] args) {
      DBConnection CN=  new DBConnection();
//            String sql="select bill.Bid,bill.Date_Bill,bill.status,FullName,Email,customer.Status from bill inner join customer on bill.Cid= customer.Cid";
//      ResultSet rs=  CN.getData(sql);
//          try {
//              if(rs.next()){
//                  System.out.println("cccccc"+rs.getInt("Bid")+rs.getDate(2)+rs.getString(3));
//              }
//          } catch (SQLException ex) {
//              Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
//          }

    }
}
