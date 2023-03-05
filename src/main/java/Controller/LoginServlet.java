package Controller;

import jakarta.servlet.RequestDispatcher;
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
        String username = request.getParameter("email_login");
        String password = request.getParameter("password_login");
        Membre loginBean = new Membre();
        loginBean.setEmail(username);
        loginBean.setPassword(password);

        try {
            if (loginDao.validate(loginBean)) {
                System.out.println("login successful");
                RequestDispatcher rd=request.getRequestDispatcher("View/index.jsp");
                rd.forward(request,response);

            } else {
                request.setAttribute("erreur","email ou Mot de passe invalide");
                RequestDispatcher rd=request.getRequestDispatcher("View/login.jsp");
                rd.forward(request,response);
                System.out.println("login failed");

            }
            System.out.println(loginDao.validate(loginBean));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
