package Controller;

import java.io.IOException;

import Database.inscriptionDao;
import Model.inscription;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import  jakarta.servlet.http.HttpServlet;
import  jakarta.servlet.http.HttpServletRequest;
import  jakarta.servlet.http.HttpServletResponse;

import Database.ContactDao;
import Model.Contact;


@WebServlet(name = "ContactServlet", value = "/ContactServlet")
public class ContactServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private ContactDao employeeDao;

    public void init() {
        employeeDao = new ContactDao();
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String firstName = request.getParameter("Name");
        String Email = request.getParameter("Email");
        String PhoneNumber = request.getParameter("Phone Number");
        String Message = request.getParameter("Message");




        Contact employee = new Contact();
        employee.setName(firstName);
        employee.setEmail(Email);
        employee.setPhoneNumber(PhoneNumber);
        employee.setMessage(Message);


        try {
            employeeDao.registerEmployee(employee);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        response.sendRedirect("View/Contact us.jsp");
    }
}
