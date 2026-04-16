package com.library;

public class Library {
    static int allowedDays = 7;
    static int finePerDay = 10;

    public static int calculateFine(int days) {
        if (days > allowedDays) {
            return (days - allowedDays) * finePerDay;
        }
        return 0;
    }

    public static void display(User user) {
        int fine = calculateFine(user.days);
        System.out.println("\n--- Library Receipt ---");
        System.out.println("User Name: " + user.name);
        System.out.println("User ID: " + user.id);
        System.out.println("Books Issued: " + user.booksIssued);
        System.out.println("Days Borrowed: " + user.days);
        System.out.println("Fine: ₹" + fine);
    }
}
