package Database;

import Model.Abonnement;

import java.sql.*;
import java.util.ArrayList;

public class AbonnementDAO {
    private static final String INSERT="INSERT INTO abonnement(`libelle`, `description_abonnement`, `tarif`, `date_debut`, `date_fin`) VALUES (?,?,?,?,?)";
    private static final String SELECT="SELECT * FROM abonnement where id_membre=?";

    public  int Ajouter(Abonnement abn) throws ClassNotFoundException {
        int nb=0;

        try (Connection cnx = Connexion.getConnection();

             PreparedStatement preparedStatement=cnx.prepareStatement(INSERT))
        {
            preparedStatement.setString(1,abn.getLibelle());
            preparedStatement.setString(2,abn.getDescription_abonnement());
            preparedStatement.setDouble(3,abn.getTarif());
            preparedStatement.setString(4, abn.getDate_debut());
            preparedStatement.setString(5, abn.getDate_fin());

            nb=preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
//            if(nb>0)System.out.println("Bien Ajouté");
//            else System.out.println("Echec de l'ajout");
        return nb;
    }
    public ArrayList<Abonnement> getList(int id){
        ArrayList<Abonnement> listAb=new ArrayList<>();
        Connection cnx=Connexion.getConnection();
        try {
            PreparedStatement ps=cnx.prepareStatement(SELECT);
            ps.setInt(1,id);

            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                Abonnement ab=new Abonnement();
                ab.setCode_abonnement(rs.getInt("code_abonnement"));
                ab.setLibelle(rs.getString("libelle"));
                ab.setDescription_abonnement(rs.getString("description_abonnement"));
                ab.setTarif(rs.getDouble("tarif"));
                ab.setDate_debut(String.valueOf(rs.getDate("date_debut")));
                ab.setDate_fin(String.valueOf(rs.getDate("date_fin")));
                ab.setEtat(rs.getBoolean("etat"));
                listAb.add(ab);
            }
        }catch (Exception e){e.getMessage();}
        return listAb;
    }

}
