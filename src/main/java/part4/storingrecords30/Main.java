package part4.storingrecords30;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("File: ");
        readRecordsFromFile(scanner.nextLine());
        
    }
    
    public static List<Person> readRecordsFromFile(String file) {
        List<Person> personList = new ArrayList<>();
    
        try (Scanner scan = new Scanner(Paths.get(file))) {
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                String[] parts = line.split(",");
                String name = parts[0];
                int age = Integer.parseInt(parts[1]);
                personList.add(new Person(name, age));
            }
        
            for (Person person : personList) {
                System.out.println("Name: " + person.getName() +", age " + person.getAge());
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return personList;
    }
}
