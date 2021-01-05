package controller.user;

import services.implServices.CategoryServicesImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//chi nhan dc 1 gia tri va giai quyet dc 1 controller
//@WebServlet(value = "/home" )

//nhan dc nhieu gia tri  thong qua tap gia tri trong ngoac nhon giai quyet dc nhieu controller
@WebServlet(urlPatterns = {"/home"}) 
public class Home extends HttpServlet {

    private CategoryServicesImpl categoryServices = new CategoryServicesImpl();
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      
        RequestDispatcher rd= request.getRequestDispatcher("/views/user/home.jsp");
        rd.forward(request,response);
    }
   protected  void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd= request.getRequestDispatcher("/views/user/home.jsp");
        rd.forward(request,response);
   }
}
