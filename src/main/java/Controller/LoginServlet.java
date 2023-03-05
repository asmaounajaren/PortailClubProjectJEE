package Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import jakarta.servlet.http.HttpSession;
import Model.Membre;
import Database.LoginDao;

@WebServlet(name = "LoginServlet", value = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private LoginDao loginDao;

    public void init() {
        loginDao = new LoginDao();
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        Membre loginBean = new Membre();
        loginBean.setEmail(username);
        loginBean.setPassword(password);

        try {
            if (loginDao.validate(loginBean)) {
                response.sendRedirect("View/index.jsp");
            } else {
                HttpSession session = request.getSession();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}