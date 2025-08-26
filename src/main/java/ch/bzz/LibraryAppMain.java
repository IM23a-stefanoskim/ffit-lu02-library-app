package ch.bzz;

import java.util.Scanner;

public class LibraryAppMain {

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
                    System.out.println("hello");
                default:
                    System.out.println("Ungültige Eingabe: '" + command + "'");
                    break;
            }
        }
    }
}
