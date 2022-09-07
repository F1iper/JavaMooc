package part6.logic;

import java.util.ArrayList;
import java.util.List;

public class WordSet {
    
    private List<String> words;
    
    public WordSet() {
        this.words = new ArrayList<>();
    }
    
    public void add(String word) {
        this.words.add(word);
    }
    
    public boolean contains(String word) {
        return this.words.contains(word);
    }
    
    public int palindromes() {
        int count = -0;
        
        for (String word : words) {
            if (isPalindrome(word)) {
                count++;
            }
        }
        return count;
    }
    
    private boolean isPalindrome(final String word) {
        int end = word.length() - 1;
        
        int i = 0;
        while (i < word.length() / 2) {
            if (word.charAt(i) != word.charAt(end - i)) {
                return false;
            }
            i++;
        }
        return true;
    }
}
