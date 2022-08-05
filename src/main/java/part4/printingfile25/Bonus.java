package part4.printingfile25;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bonus {
    
    public static void main(String[] args) {
        
        
        List<String> names = new ArrayList<>();
        System.out.println("Enter the file name to read from: ");
        final Scanner scanner = new Scanner(System.in);
        String filename = scanner.nextLine();
        
        try (Scanner scan = new Scanner(Paths.get(filename))) {
            while (scan.hasNext()) {
                names.add(scan.nextLine());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Lines in file: " + names.size());
        
        for (String name : names) {
            System.out.println("Name: " + name);
        }
    }
}
