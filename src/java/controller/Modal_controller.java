/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.BillDetail;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.DBConnection;

/**
 *
 * @author vancuong
 */
public class Modal_controller extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
              String service = request.getParameter("service");
               DBConnection dbcon = new DBConnection();
            if(service.equalsIgnoreCase("ttsp")){
                  String id=request.getParameter("id");
                String sql = "select * from Bill_Detail_coffe where bid='"+id+"'";
                ResultSet rs = dbcon.getData(sql);
//                Vector<Bill> vector = new Vector<>();
                Vector<BillDetail> billDetails=new Vector<>();
                try {
                    while (rs.next()) {
//                        Bill bill = new Bill(rs.getString(1), rs.getDate(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getInt(7), rs.getString(8), rs.getInt(9));
                        BillDetail bd=new BillDetail(rs.getString(1),rs.getInt(2),rs.getFloat(3),rs.getInt(4), rs.getString(5));
//                        vector.add(bill);
                        billDetails.add(bd);
                    }
//                   out.print("cccc"+vector.toString());
//                     out.print("cccc"+billDetails.toString());
//                    String a ="modal";
 HttpSession ss = request.getSession();
                   request.setAttribute("service", service);
//                   request.setAttribute("bill", vector);
                   request.setAttribute("BillDetail", billDetails);
                    String md ="$('#myModal').modal('show');";
                    ss.setAttribute("modal", md);
                  RequestDispatcher rd = request.getServletContext().getRequestDispatcher("/admin/index.jsp");
                    rd.forward(request, response);
                  
                } catch (SQLException ex) {
                    Logger.getLogger(Admin_controller.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
