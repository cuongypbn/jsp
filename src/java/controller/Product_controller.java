/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.Customer_coffe;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.DBConnection;
import dao.DBproduct_cofffe;
import entity.Customer;
import entity.Product;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import entity.Information_coffe;
import javax.servlet.http.HttpSession;

/**
 *
 * @author vancuong
 */
public class Product_controller extends HttpServlet {

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
        DBConnection dbcon = new DBConnection();
        DBproduct_cofffe dbcf = new DBproduct_cofffe(dbcon);
//        Vector<Product> vector=new Vector<Product>();
        response.setContentType("text/html;charset=UTF-8");
        String service = request.getParameter("service");
        DBConnection dBConnection = new DBConnection();
        Customer_coffe ct_cf = new Customer_coffe();
        HttpSession session = request.getSession();
        Vector<Product> vectorProducts = new Vector<>();
        if (service == null) {
            service = "display";
        }

        try (PrintWriter out = response.getWriter()) {
            if (service.equalsIgnoreCase("display")) {
                String sql = "select * from ProductCoffe";
                ResultSet rs = dbcon.getData(sql);

                try {
                    while (rs.next()) {
                        Product product = new Product(rs.getInt(1), rs.getDate(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getInt(7), rs.getString(8));
                        vectorProducts.add(product);
                    }

                    out.print(vectorProducts.toString());

                    request.setAttribute("hienthi", vectorProducts);
                    RequestDispatcher rd = request.getServletContext().getRequestDispatcher("/index.jsp");
                    rd.forward(request, response);
                } catch (SQLException ex) {
                    Logger.getLogger(Product_controller.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (service.equalsIgnoreCase("infor")) {
                String id = request.getParameter("ID");
                String sql = "select Information_coffe.* , productCoffe.price from Information_coffe, productCoffe\n"
                        + "where Information_coffe.Pid=productCoffe.Pid and Information_coffe.Pid=" + id + "";
                ResultSet rs = dbcon.getData(sql);

                Vector<Information_coffe> vector = new Vector<>();

                try {
                    while (rs.next()) {
                        Information_coffe information_coffe = new Information_coffe(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getInt(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getFloat(13), rs.getString(12));
                        vector.add(information_coffe);

//                          out.print("cscasa");
                    }
//                    out.print("cscasa"+vector.toString());
                    request.setAttribute("ttsanpham", vector);
                    RequestDispatcher rd = request.getServletContext().getRequestDispatcher("/Thongtinsp.jsp");
                    rd.forward(request, response);
                } catch (SQLException ex) {
                    Logger.getLogger(Product_controller.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(service.equalsIgnoreCase("logout"))
            {
//                session.removeAttribute("user");
                session.invalidate();
//                if(session.getAttribute("user")==null)
//                {
//                    out.print("<h2>Đã xóa ss</h2>");
//                }
//                else{
//                    out.print("<h2>vẫn còn</h2>");
//                }
                response.sendRedirect("Product_controller");
            }
            if (service.equalsIgnoreCase("login")) {

                String username = request.getParameter("username");
                String password = request.getParameter("password");
                if (ct_cf.login(username, password)!=null) {
                    ResultSet rs=ct_cf.login(username, password);
                    
                    
                    try {
                        if(rs.next()){
                            Customer customer=new Customer(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getString(6), rs.getBoolean(7), rs.getString(7));
                           
                        session.setAttribute("user",customer);
                        
                        }
                      response.sendRedirect("Product_controller");
                    } catch (SQLException ex) {
                        Logger.getLogger(Product_controller.class.getName()).log(Level.SEVERE, null, ex);
                    }
//                    System.out.println("c"+vectorProducts.toString());
                    
                } else {
                    session.setAttribute("username", "out");
                    response.sendRedirect("Product_controller");
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
