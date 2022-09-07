package stash.part6;

import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    
    UserInterface(final Scanner scanner) {
        this.scanner = scanner;
    }
    
    public void start () {
        
        while (true) {
            System.out.println("Enter a word: ");
            String word = scanner.nextLine();
            
            if(alreadyEntered(word)) {
                break;
            }
            System.out.println(word);
        }
        System.out.println("You enter same word twice");
    }
    
    public boolean alreadyEntered(String word) {
        return word.equals("end");
    }
}
