public class Main {
    public static void main(String[] args) {
        UsersTable ut = new UsersTable();
        ut.testConnection();
        GamesTable gt = new GamesTable();
        gt.testConnection();
        System.out.println("Hello world!");
    }
}