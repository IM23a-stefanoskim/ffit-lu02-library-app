package ch.bzz;

import java.util.Scanner;

public class LibraryAppMain {

    private static final Book BOOK_1 = new Book(
            1,
            "978-3-8362-9544-4",
            "Java ist auch eine Insel",
            "Christian Ullenboom",
            2023
    );

    private static final Book BOOK_2 = new Book(
            2,
            "978-3-658-43573-8",
            "Grundkurs Java",
            "Dietmar Abts",
            2024
    );

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        String command = "";



        while (!command.equals("quit")) {
            System.out.println("Enter command: ");
            command = myScanner.nextLine();
            switch (command){
                case "help":
                    System.out.println("help");
                    break;
                case "hello":
                    System.out.println("hola sexy");
                    break;
                case "listBooks":
                    listBooks();
                    break;
                default:
                    System.out.println("Ungültige Eingabe: '" + command + "'");
                    break;
            }
        }

    }
    private static void listBooks() {
        System.out.println(BOOK_1.getTitle());
        System.out.println(BOOK_2.getTitle());
    }
}
