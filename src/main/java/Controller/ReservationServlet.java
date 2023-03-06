package Controller;

import Service.reservationDAO;
import Model.inscription;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "ReservationServlet", value = "/ReservationServlet")
public class ReservationServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private reservationDAO reservationDao;

    public void init() {
        reservationDao = new reservationDAO();
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nom = request.getParameter("Name");
        String Email = request.getParameter("Email");
        String phonenumber = request.getParameter("Phone");
        String ville = request.getParameter("Ville");




        inscription user = new inscription();
        user.setFirstName(nom);
        user.setEmail(Email);
        user.setNumtele(phonenumber);
        user.setVille(ville);


        try {
            reservationDao.registerUser(user);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        response.sendRedirect("View/reserverseancegratuit.jsp");

    }
}
