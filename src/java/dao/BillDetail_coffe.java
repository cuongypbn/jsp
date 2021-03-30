/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

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
public class BillDetail_coffe {

    Connection connection = null;
    DBConnection dBConnection = new DBConnection();

    public BillDetail_coffe(DBConnection dBConnection) {
        this.dBConnection = dBConnection;
        this.connection = dBConnection.getConn();
    }

    public ResultSet hienthi(int Pid) {
        ResultSet rs;
        String sql = "select Bill_Detail_coffe.* from Bill_Detail_coffe ,productCoffe\n"
                + "where Bill_Detail_coffe.Pid=productCoffe.Pid and productCoffe.Pid=" + Pid + "";
        rs=dBConnection.getData(sql);
        return rs;

    }
    

    public BillDetail_coffe() {
    }
    public static void main(String[] args) {
        BillDetail_coffe billDetail_coffe=new BillDetail_coffe();
        ResultSet rs=billDetail_coffe.hienthi(1);
        try {
            if(rs.next()){
                System.out.println( "danh sach" +rs.getInt("Pid")+rs.getString("bid"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(BillDetail_coffe.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
