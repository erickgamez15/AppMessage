package appmessage;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MessagesDAO {
    //DAO = Data Acces Object
    public static void generateMessage(Messages message){
        DataBaseConnection connection = new DataBaseConnection();
        try(Connection cn = connection.getConnection()){
            PreparedStatement ps = null;
            try {
                String query = "INSERT INTO `messages` (`message`, `message_author`) " +
                        "VALUES (?, ?)";
                ps = cn.prepareStatement(query);
                ps.setString(1, message.getMessage());
                ps.setString(2, message.getMessageAuthor());
                ps.executeUpdate();
                System.out.println("El mensaje se ha creado correctamente\n");
            }catch (SQLException e){
                System.out.println(e.getMessage());
            }
        }catch (SQLException exception){
            JOptionPane.showMessageDialog(null,"ERROR!\n");
        }
    }

    public static void  readMessages(){

    }

    public static void deleteMessage(int id_message){

    }

    public static void editMessage(Messages message){

    }
}
