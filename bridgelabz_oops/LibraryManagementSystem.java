package com.bridgelabz_oops;
import java.util.Scanner;

class Book {
    int id;
    String title;
    String author;

    void addBook(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    void displayBook() {
        System.out.println("Book ID : " + id);
        System.out.println("Title   : " + title);
        System.out.println("Author  : " + author);
        System.out.println();
    }
}

public class LibraryManagementSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Book[] books = new Book[100];
        int count = 0;

        while (true) {
            System.out.println("\n===== Library Management System =====");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Search Book");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    books[count] = new Book();

                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();

                    books[count].addBook(id, title, author);
                    count++;

                    System.out.println("Book Added Successfully!");
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No books available.");
                    } else {
                        System.out.println("\nBook Details:");
                        for (int i = 0; i < count; i++) {
                            books[i].displayBook();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Book ID to Search: ");
                    int searchId = sc.nextInt();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (books[i].id == searchId) {
                            System.out.println("\nBook Found:");
                            books[i].displayBook();
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Book Not Found!");
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}