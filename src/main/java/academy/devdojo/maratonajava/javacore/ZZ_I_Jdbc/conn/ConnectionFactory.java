package academy.devdojo.maratonajava.javacore.ZZ_I_Jdbc.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public static Connection getConnection() {

        String url = "jdbc:mysql://localhost:3306/cartoon_store";
        String user = "root";
        String pass = "root";
        try {
            return DriverManager.getConnection(url, user, pass);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
