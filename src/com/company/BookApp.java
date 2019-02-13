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

    }
}
