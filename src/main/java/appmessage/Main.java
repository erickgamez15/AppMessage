package appmessage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option = 0;
        do {
            System.out.println("\n-----*** Bienvenido ***-----\n");
            System.out.println("Aplicación de mensajes\n");
            System.out.println("1. Crear Mensaje\n");
            System.out.println("2. Listar Mensajes\n");
            System.out.println("3. Editar mensaje\n");
            System.out.println("4. Eliminar mensaje\n");
            System.out.println("5. Salir\n");
            System.out.println("Por favor, elige una opción.\n");
            option = sc.nextInt();
            switch (option){
                case 1 -> MessagesService.generateMessage();
                case 2 -> MessagesService.viewMessage();
                case 3 -> MessagesService.editMessage();
                case 4 -> MessagesService.deleteMessage();
                case 5 -> System.out.println("Adios uwu");
                default -> System.out.println("Opción no encontrada");
            }
        }while (option < 5 && option > 0);
    }
}