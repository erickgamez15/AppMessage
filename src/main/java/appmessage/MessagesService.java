package appmessage;

import java.util.Scanner;

public class MessagesService {
    static Scanner sc = new Scanner(System.in);
    static Messages messages = new Messages();
    public static void generateMessage(){
        System.out.println("Escribe un mensaje");
        String message = sc.nextLine();
        System.out.println("¿Quién escribió el mensaje?");
        String author = sc.nextLine();
        messages.setMessage(message);
        messages.setMessageAuthor(author);
        MessagesDAO.generateMessage(messages);
    }

    public static void viewMessage(){
        MessagesDAO.readMessages();
    }

    public static void deleteMessage(){
        System.out.println("ID del mensaje a borrar");
        int id = sc.nextInt();
        MessagesDAO.deleteMessage(id);
    }

    public static void editMessage(){

    }
}
