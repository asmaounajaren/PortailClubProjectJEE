package Controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import  jakarta.servlet.http.HttpServlet;
import  jakarta.servlet.http.HttpServletRequest;
import  jakarta.servlet.http.HttpServletResponse;

import Database.inscriptionDao;
import Model.inscription;

@WebServlet(name = "InsciptionServlet", value = "/InsciptionServlet")
public class InsciptionServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private inscriptionDao employeeDao;

    public void init() {
        employeeDao = new inscriptionDao();
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    String firstName = request.getParameter("firstName");
    String Email = request.getParameter("Email");
    String password = request.getParameter("password");




    inscription employee = new inscription();
        employee.setFirstName(firstName);
        employee.setEmail(Email);
        employee.setPassword(password);


        try {
        employeeDao.registerEmployee(employee);
    } catch (Exception e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }

        response.sendRedirect("View/login.jsp");
}
}