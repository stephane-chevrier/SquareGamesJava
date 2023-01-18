import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UsersTable {
    public void testConnection() {
        Connection con = null;
        try {
            con = java.sql.DriverManager.getConnection(
                    "jdbc:mysql://localhost:6603/square_games?autoReconnect=true&useSSL=false&user=root&password=helloworld"
            );
        } catch (
                SQLException e) {
            throw new RuntimeException(e);
        }
        Statement smt = null;
        try {
            smt = con.createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        ResultSet rez = null;
        try {
            rez = smt.executeQuery("SELECT * FROM square_games.users;");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        if (rez == null) return;
        try {

            while (rez.next()) {
                System.out.println(rez.getInt(1) + " - " + rez.getString(2));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
