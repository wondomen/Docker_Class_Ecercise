package org.example;
import java.util.Scanner;

public class BerhanuDocker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();
        System.out.println("Your name is: " + userName);
        scanner.close();
    }
}
