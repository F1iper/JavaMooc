package part4.strings21;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        final Scanner scanner = new Scanner(System.in);
        int counter = 0;
        
        while (true) {
            String theString = scanner.nextLine();
            if (theString.equals("end")) {
                break;
            }
            counter++;
        }
        
        System.out.println(counter);
    }
}
