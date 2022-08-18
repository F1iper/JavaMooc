package example;

import java.util.*;

public class Main {
    
    public static void main(String[] args) {

//        final String[] random = solution("this is random text");
//        solution2("this is random text");
//        System.out.println(Arrays.toString(random));
//        System.out.println(Arrays.toString(random2));
    
        final String[] this_is_amazing_features = strings("This is amazing feature");
        System.out.println(Arrays.toString(this_is_amazing_features));
    }
    public static String [] strings (String s) {
        s = (s.length() % 2 == 0)?s:s+"_";
        return s.split("(?<=\\G.{2})");
    }
    
    
    public static void doSomething() {
        Map<Integer, String> movies = new HashMap<>();
        
        for (int i = 0; i < 10; i++) {
            movies.put(i, "Random movie name " + i);
        }
        Set<Map.Entry<Integer, String>> entries = movies.entrySet();
        
        Iterator<Map.Entry<Integer, String>> moviesIterator = entries.iterator();
        
        while (moviesIterator.hasNext()) {
            Map.Entry<Integer, String> entry = moviesIterator.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println();
        
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry);
        }
        
        System.out.println();
        entries.stream()
                .forEach(System.out::println);
        
        final Set<Integer> integers = movies.keySet();
        System.out.println(integers);
        
        final Collection<String> values = movies.values();
        System.out.println(values);
    }
    
    public static boolean solution(String str, String ending) {
        return ending.equals(str.substring(str.length() - ending.length()));
        
    }
    
    public static String[] solution(String s) {
        
        String[] strings = new String[s.length()];
        int a = 0;
        int b = 1;
        while (true) {
            String sub = s.substring(a, b + 1);
            
            strings[a] = sub;
            a++;
            b++;
            if (a == s.length() - 1) {
                break;
            }
        }
        return strings;
    }
    
    public static String[] solution2(String s) {
        String[] strings = new String[s.length()];
        
        for (int i = 0; i < s.length(); i++) {
            String sub = s.substring(i, i + 2);
            System.out.println(sub);
            
            i++;
            if (i == s.length() - 2) {
                break;
            }
            strings[i] = sub;
        }
        
        return strings;
    }
}
