package part4.cubes22;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        final Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Input number: ");
            
            String input = scanner.nextLine();
            
            if (input.equals("end")) {
                break;
            }
            
            int num = Integer.parseInt(input);
            int result = num * num * num;
            System.out.println(result);
        }
    }
}
