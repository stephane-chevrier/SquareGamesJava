import java.sql.Connection;
import java.sql.DriverManager;

public class GamesTable {
    public void testConnection()
    {
//        System.out.println("Stéphane file");


        try{
//            Class.forName("com.jdbc.mysql.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:6603/square_games", "root", "helloworld");
            System.out.println(connection);
        } catch (Exception e){
            System.out.println("Error:");
            System.out.println(e.getMessage());
        }

    }
}
