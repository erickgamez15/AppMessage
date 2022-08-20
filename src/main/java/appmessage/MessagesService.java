package appmessage;

import java.util.Scanner;

public class MessagesService {
    static Scanner sc = new Scanner(System.in);
    public static void generateMessage(){
        System.out.println("Escribe un mensaje");
        String message = sc.nextLine();
        System.out.println("¿Quién escribió el mensaje?");
        String author = sc.nextLine();
        Messages messages = new Messages();
        messages.setMessage(message);
        messages.setMessageAuthor(author);
        MessagesDAO.generateMessage(messages);
    }

    public static void viewMessage(){

    }

    public static void deleteMessage(){

    }

    public static void editMessage(){

    }
}
