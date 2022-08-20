package appmessage;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        DataBaseConnection connection = new DataBaseConnection();
        try(Connection cn = connection.getConnection()){
            System.out.println("Welcome!\n");
        }catch (SQLException e) {
            System.out.println("ERROR! " + e.getMessage());
        }
    }
}