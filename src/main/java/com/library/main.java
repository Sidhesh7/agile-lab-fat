package com.library;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        
        System.out.print("Enter number of books: ");
        int books = sc.nextInt();
        
        System.out.print("Enter days borrowed: ");
        int days = sc.nextInt();
        
        User user = new User(name, id, books, days);

        Library.display(user);
        
        sc.close();
    }
}
