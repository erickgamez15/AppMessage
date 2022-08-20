package appmessage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {
    //Uso de maven para la conexión hacia xampp
    public Connection getConnection(){
        Connection connection = null;
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/messagesapp","root","");
        }catch (SQLException exception){
            System.out.println("Ups!\nSomething was wrong...\n" + exception.getMessage());
        }
        return connection;
    }
}
