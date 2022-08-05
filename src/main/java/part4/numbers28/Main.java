package part4.numbers28;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("File?");
        String filename = scanner.nextLine();
        
        System.out.println("Lower bound?");
        int lowerBound = scanner.nextInt();
        
        System.out.println("Upper bound?");
        int upperBound = scanner.nextInt();
        
        List<Integer> numbers = new ArrayList<>();
        
        try (Scanner scan = new Scanner(Paths.get(filename))) {
            while (scan.hasNext()) {
                numbers.add(scan.nextInt());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        int counter = 0;
        
        for (Integer num : numbers) {
            if (num >= lowerBound && num <= upperBound) {
            counter++;
            }
        }
        System.out.println("Numbers: " + counter);
    }
}
