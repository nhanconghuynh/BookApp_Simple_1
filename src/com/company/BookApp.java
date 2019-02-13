package com.company;

import java.util.Scanner;

public class BookApp {

    public static void main(String[] args){

        Scanner keybd = new Scanner(System.in);

        System.out.print("Enter the Book Code: ");

        String code = keybd.nextLine();



        Book b = new Book();

        b.setCode(code);

        b.setAuthor("Nhan Huynh");

        b.setTitle("How to be an Excellent Programmer");

        b.setPrice(9.99);

        b.setDescription("Programming advice book");

        b.setisInStock(true);

        System.out.println(b.getDisplayText());

        System.out.print("\nEnter quantity of this book you would like to order: ");

        int quantity = keybd.nextInt();

        if (b.getisInStock())
        System.out.println("Total price for books ordered:" + b.calculate_Pricing(quantity));
        else System.out.println("Sorry this book currently out of stock.");

    }
}
