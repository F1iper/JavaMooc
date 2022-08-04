package org.exercise.part4.books20;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        List<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Enter the title: ");
            String title = scanner.nextLine();
            
            if (title.isEmpty()) {
                break;
            }
            
            System.out.println("Enter number of pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            
            System.out.println("Enter publication year: ");
            int pubYear = Integer.valueOf(scanner.nextLine());
            books.add(new Book(title, pages, pubYear));
        }
        
        System.out.println("What iformation will be printed?");
        String input = scanner.nextLine();
        
        if (input.equals("everything")) {
            books.stream()
                    .forEach(System.out::println);
            
        } else if (input.equals("name")) {
            books.stream()
                    .forEach(System.out::println);
        }
    }
}
