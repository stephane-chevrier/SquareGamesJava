import java.sql.*;

public class Test {

    public static void main(String[] args) throws SQLException {

        // Création et affichage de la connexion à la base square_games
        Connection connexion = SingletonConnexion.getInstance().getConnexion();

        // 1ère requête
        String requete1 = "SELECT * FROM square_games.games";
        Statement declaration = connexion.createStatement();
        ResultSet resultat = declaration.executeQuery(requete1);
        ResultSetMetaData resultatDonnees = resultat.getMetaData();
        int nbCols = resultatDonnees.getColumnCount();
        while (resultat.next()) {
            for (int i = 1; i<=nbCols; i++) {
                System.out.print(resultat.getString(i)+" - ");
            }
            System.out.println();
        }

    }
}
