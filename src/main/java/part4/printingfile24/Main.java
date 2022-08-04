package part4.printingfile24;

import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(Paths.get("src/file.txt"))) {
            
            while (scanner.hasNext()) {
                String row = scanner.nextLine();
                
                System.out.println(row);
            }
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}