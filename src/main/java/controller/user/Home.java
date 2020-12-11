package controller.user;

import model.request.CategoryRequest;
import model.request.UserRequest;
import model.response.UserResponse;
import services.CategoryServices;
import services.implServices.CategoryServicesImpl;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//@WebServlet(value = "/home" ) //chi nhan dc 1 gia tri va giai quyet dc 1 controller
@WebServlet(urlPatterns = {"/home"}) //nhan dc nhieu gia tri  thong qua tap gia tri trong ngoac nhon giai quyet dc nhieu controller
public class Home extends HttpServlet {

    private CategoryServicesImpl categoryServices = new CategoryServicesImpl();
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        CategoryRequest categoryRequest= new CategoryRequest(10L,null,null,
//                null,null,"truyen thieu nhi",null);
//        categoryServices.update(categoryRequest);
//        System.out.println("found object");
//        request.setAttribute("categories",listCategory);

//        CategoryRequest categoryRequest1= categoryServices.insert(categoryRequest);

        categoryServices.remove(1L);
        RequestDispatcher rd= request.getRequestDispatcher("/views/user/home.jsp");
        rd.forward(request,response);
    }
   protected  void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        RequestDispatcher rd= request.getRequestDispatcher("/views/user/home.jsp");
//        rd.forward(request,response);
   }
}