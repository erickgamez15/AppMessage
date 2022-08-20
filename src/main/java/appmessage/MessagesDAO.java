package appmessage;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MessagesDAO {
    //DAO = Data Acces Object
    static DataBaseConnection connection = new DataBaseConnection();
    static PreparedStatement ps = null;
    static String query = null;
    public static void generateMessage(Messages message){
        try(Connection cn = connection.getConnection()){
            try {
                query = "INSERT INTO `messages` (`message`, `message_author`) " +
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
        ResultSet resultSet = null;
        try(Connection cn = connection.getConnection()){
            try {
                query = "SELECT * FROM `messages`";
                ps = cn.prepareStatement(query);
                resultSet = ps.executeQuery();
                while (resultSet.next()){
                    System.out.println("ID: " + resultSet.getInt("id_message"));
                    System.out.println("Mensaje: " + resultSet.getString("message"));
                    System.out.println("Autor: " + resultSet.getString("message_author"));
                    System.out.println("Fecha: " + resultSet.getString("date"));
                    System.out.println("\n");
                }
            }catch (SQLException e){
                System.out.println(e.getMessage());
            }
        }catch (SQLException exception){
            JOptionPane.showMessageDialog(null,"ERROR!\n");
        }
    }

    public static void deleteMessage(int id_message){
        try(Connection cn = connection.getConnection()){
            try {
                query = "DELETE FROM `messages` WHERE `id_message` = ?";
                ps = cn.prepareStatement(query);
                ps.setInt(1, id_message);
                ps.executeUpdate();
                System.out.println("El mensaje se ha borrado correctamente\n");
            }catch (SQLException e){
                System.out.println(e.getMessage());
            }
        }catch (SQLException exception){
            JOptionPane.showMessageDialog(null,"ERROR!\n");
        }
    }

    public static void editMessage(Messages message){

    }
}
