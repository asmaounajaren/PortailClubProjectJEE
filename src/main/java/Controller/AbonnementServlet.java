package Controller;

import Service.AbonnementDAO;
import Model.Abonnement;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

import static java.lang.System.out;

@WebServlet(name = "AbonnementServlet", value = "/AbonnementServlet")
public class AbonnementServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private AbonnementDAO abonnementDAO;

    public void init() {
        abonnementDAO = new AbonnementDAO();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Abonnement abonnement=new Abonnement();
        try {
        String c=request.getParameter("abn1");
        if("Reserver carte basic".equalsIgnoreCase(c)){
            abonnement.setLibelle("Basic Card");
            abonnement.setDescription_abonnement("pour un mois, Accès aux cours VIRTUAL TRAINING,Accès aux cités des sports");
            abonnement.setTarif(150.00);
            abonnement.setDate_debut("2023/03/07");
            abonnement.setDate_fin("2023/04/07");
        }else if("Reserver carte Premium".equalsIgnoreCase(c)){
            abonnement.setLibelle("Premium Card");
            abonnement.setDescription_abonnement("3 mois et un mois gratuit! Accès aux cours VIRTUAL TRAINING,Accès aux cités des sports");
            abonnement.setTarif(300.00);
            abonnement.setDate_debut("2023/03/07");
            abonnement.setDate_fin("2023/06/07");
        }else{
            abonnement.setLibelle("Unlimited Card");
            abonnement.setDescription_abonnement("Acces à toutes les activites du club, Acces aux cours VIRTUAL TRAINING, diet plan,overall results </p>");
            abonnement.setTarif(1500.00);
            abonnement.setDate_debut("2024/03/07");
            abonnement.setDate_fin("2024/03/07");
        }

            int r=abonnementDAO.Ajouter(abonnement);
            if(r>0){
                out.println("<script type=\"text/javascript\">");
                out.println("alert('la demande de votre carte d'abonnement a ete bien recu');");
                out.println("</script>");
            }else{
                out.println("<script type=\"text/javascript\">");
                out.println("alert('verifier vos informations');");
                out.println("</script>");
            }
        }catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        response.sendRedirect("View/detail_produit.jsp");

    }
}
