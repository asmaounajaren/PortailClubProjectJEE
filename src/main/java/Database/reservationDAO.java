package Database;

import Model.inscription;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class reservationDAO {
    public int registerUser(inscription in) throws ClassNotFoundException {
        String INSERT_USERS_SQL = "INSERT INTO membre" +
                "  ( nom_membre, numtele,ville_membre, email_membre) VALUES " +
                " (?, ?, ?,?);";

        int result = 0;


        try (Connection connection = Connexion.getConnection();

             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
            preparedStatement.setString(1, in.getFirstName());
            preparedStatement.setString(2,in.getNumtele());
            preparedStatement.setString(3, in.getVille());
            preparedStatement.setString(4, in.getEmail());

            System.out.println(preparedStatement);
            result = preparedStatement.executeUpdate();

        } catch (SQLException e) {
            // process sql exception
            e.getMessage();
        }
        return result;
    }

}
