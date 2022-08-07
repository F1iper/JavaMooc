package part4.sportstats31;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        final Scanner scanner = new Scanner(System.in);
        System.out.println("File: ");
        String filename = scanner.nextLine();
        
        List<String> winners = new ArrayList<>();
        List<String> losers = new ArrayList<>();
        
        try (Scanner file = new Scanner(Paths.get(filename))) {
            while (file.hasNextLine()) {
                String line = file.nextLine();
                String[] parts = line.split(",");
                String team1 = parts[0];
                String team2 = parts[1];
                
                if (Integer.parseInt(parts[2]) > Integer.parseInt(parts[3])) {
                    winners.add(team1);
                    losers.add(team2);
                } else {
                    losers.add(team1);
                    winners.add(team2);
                }
            }
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Team: ");
        String team = scanner.nextLine();
        
        int frequency1 = Collections.frequency(winners, team);
        int frequency2 = Collections.frequency(losers, team);
        
        System.out.println("Games: " + (frequency1 + frequency2));
        System.out.println("Wins: " + frequency1);
        System.out.println("Losses: " + frequency2);
        
    }
}
