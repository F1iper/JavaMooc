package part4.printingfile25;

import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("Which file should have its contents printed?");
        
        final Scanner scanner = new Scanner(System.in);
        String filename = scanner.next();
        
        try (Scanner scan = new Scanner(Paths.get(filename))) {
            while (scan.hasNext()) {
                String row = scan.nextLine();
                System.out.println(row);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
