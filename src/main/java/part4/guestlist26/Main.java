package part4.guestlist26;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file: ");
        String filename = scanner.nextLine();
        
        List<String> names = new ArrayList<>();
        
        try (Scanner scan = new Scanner(Paths.get(filename))) {
            while (scan.hasNext()) {
                names.add(scan.nextLine());
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println("Enter names, empty line quits.");
        
        while (true) {
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            
            if (names.contains(name)) {
                System.out.println("The name is on the list.");
            } else {
                System.out.println("The name is not on the list.");
            }
        }
        System.out.println("Thanks!");
    }
}
