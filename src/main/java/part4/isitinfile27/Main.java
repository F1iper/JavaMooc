package part4.isitinfile27;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file: ");
        String filename = scanner.nextLine();
        
        List<String> theList = new ArrayList<>();
        
        try (Scanner scan = new Scanner(Paths.get(filename))) {
            
            while (scan.hasNext()) {
                theList.add(scan.nextLine());
            }
        } catch (Exception e) {
            System.out.println("The file: " + filename + " was not found.");
        }
        
        System.out.println("Search for: ");
        String name = scanner.nextLine();
        
        if (theList.contains(name)) {
            System.out.println("Name " + name + " was found!");
        } else {
            System.out.println("Name " + name + " was not found.");
        }
        System.out.println("Thanks.");
    }
}
