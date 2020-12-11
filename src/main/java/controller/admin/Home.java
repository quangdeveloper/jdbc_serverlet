package controller.admin;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//@WebServlet(value = "/admin-home") chi nhan dc 1 gia tri va giai quyet dc 1 controller
@WebServlet(urlPatterns = {"/admin-home"}) //nhan dc nhieu gia tri  thong qua tap gia tri trong ngoac nhon giai quyet dc nhieu controller
public class Home extends HttpServlet {

    protected  void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd= request.getRequestDispatcher("/views/admin/home.jsp");
        rd.forward(request,response);

    }
    protected  void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        RequestDispatcher rd= request.getRequestDispatcher("/views/admin/home.jsp");
//        rd.forward(request,response);
    }
}
