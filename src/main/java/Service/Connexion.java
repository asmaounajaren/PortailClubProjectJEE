package Service;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connexion {
    private static Connection connection;
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection= DriverManager.getConnection
                    ("jdbc:mysql://localhost/portailclub","root","");
            System.out.println("Connected successefuly.");
        } catch (Exception e) {
            System.err.println("Connection failed");
        }
    }
    public static Connection getConnection() {
        return connection;
    }
}
