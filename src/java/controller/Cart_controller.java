/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Information_coffe;
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
public class Cart_controller extends HttpServlet {

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
        String service = request.getParameter("service");
        String id = request.getParameter("id");
        DBConnection dbcon = new DBConnection();
        HttpSession session = request.getSession();
        try (PrintWriter out = response.getWriter()) {
//            out.print("abc");
//            out.print("ccccc"+service+soluong+id);
            if (service == null) {
                service = "display";
            }
            if (service.equalsIgnoreCase("display")) {
                RequestDispatcher rd = request.getServletContext().getRequestDispatcher("/Cart.jsp");
                    rd.forward(request, response);
              
            }
            if (service.equalsIgnoreCase("dathang")) {
                String sql = "select Information_coffe.* , productCoffe.price from Information_coffe, productCoffe\n"
                        + "where Information_coffe.Pid=productCoffe.Pid and Information_coffe.Pid=" + id + "";
                ResultSet rs = dbcon.getData(sql);
                 int soluong = Integer.parseInt(request.getParameter("soluong"));
                try {
                    while (rs.next()) {
                        Information_coffe information_coffe = new Information_coffe(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getInt(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getFloat(13), rs.getString(12));
                        information_coffe.setSoluong(soluong);
                        session.setAttribute(id, information_coffe);
                    }
                    RequestDispatcher rd = request.getServletContext().getRequestDispatcher("/Cart.jsp");
                    rd.forward(request, response);
                } catch (SQLException ex) {
                    Logger.getLogger(Product_controller.class.getName()).log(Level.SEVERE, null, ex);
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
