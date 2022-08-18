package codekata;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        
//        middle("middle");
//        middle("This is amazing course");
//        final String jakub_kowalski = abbrevName("Jakub Kowalski");
//        final String maciej_łabądź = abbrevName("Maciej Łabądź");
//        System.out.println(jakub_kowalski);
//        System.out.println(maciej_łabądź);
//
//        System.out.println(doubleChar("this is amazing"));
//
        
        Map<Integer, String> names = new HashMap<>();
        names.put(1, "jacek");
        names.putIfAbsent(2, "jaaaaacek");
        System.out.println(names);
    
    }
    
    public static String middle(String word) {
        final int length = word.length();
        if (length % 2 != 0) {
            final int middle = length / 2;
            return middle + "";
        } else {
            final int middle = length / 2;
            char middleLeft = word.charAt(middle - 1);
            char middleRight = word.charAt(middle);
            System.out.println(middleLeft + "" + middleRight);
            return middleLeft + "" + middleRight;
        }
    }
    
    public static String abbrevName(String name) {
        final String result = name.toUpperCase();
        String firstLetter = result.substring(0, 1);
        String[] lastLetter = result.split(" ");
        return firstLetter + "." + lastLetter[1].charAt(0);
    }
    
    public static String doubleChar(String s) {
        
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            final String firstLetter = s.substring(i, i + 1);
            result = result + firstLetter + firstLetter;
        }
        return result;
    }
}