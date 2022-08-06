package part4.recordfromfile29;

import java.util.Scanner;

public class ReadingCsv {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter name and age separated by comma: ");
            
            String line = scanner.nextLine();
            
            String[] parts = line.split(",");
            String name = parts[0];
            int age = Integer.valueOf(parts[1]);
            
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }
    }
}
