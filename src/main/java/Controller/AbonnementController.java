package Controller;

import Database.Connexion;
import Model.Abonnement;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class AbonnementController {
    private static final String INSERT="INSERT INTO abonnement(`libelle`, `description_abonnement`, `tarif`, `date_debut`, `date_fin`) VALUES (?,?,?,?,?)";
    private static final String SELECT="SELECT * FROM abonnement";

    public static Abonnement Ajouter(Abonnement abn){
        Connection cnx= Connexion.getConnection();
        try {
            PreparedStatement preparedStatement=cnx.prepareStatement(INSERT);
            preparedStatement.setString(1,abn.getLibelle());
            preparedStatement.setString(2,abn.getDescription_abonnement());
            preparedStatement.setDouble(3,abn.getTarif());
            preparedStatement.setDate(4, (Date) abn.getDate_debut());
            preparedStatement.setDate(5,(Date) abn.getDate_fin());

            int nb=preparedStatement.executeUpdate();
            if(nb>0)System.out.println("Bien Ajouté");
            else System.out.println("Echec de l'ajout");
        }catch (Exception e){
            e.getMessage();
        }
        return abn;
    }
    public static ArrayList<Abonnement> getList(){
        ArrayList<Abonnement> listAb=new ArrayList<>();
        Connection cnx=Connexion.getConnection();
        try {
            PreparedStatement ps=cnx.prepareStatement(SELECT);
            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                Abonnement ab=new Abonnement();
                ab.setCode_abonnement(rs.getInt("code_abonnement"));
                ab.setLibelle(rs.getString("libelle"));
                ab.setDescription_abonnement(rs.getString("description_abonnement"));
                ab.setTarif(rs.getDouble("tarif"));
                ab.setDate_debut(rs.getDate("date_debut"));
                ab.setDate_fin(rs.getDate("date_fin"));
                ab.setEtat(rs.getBoolean("etat"));
                listAb.add(ab);

            }
        }catch (Exception e){e.getMessage();}
        return listAb;
    }

}
