package part6.stack2;

import java.util.ArrayList;
import java.util.List;

public class Stack {
    
    List<String> strings = new ArrayList<>();
    
    public boolean isEmpty() {
        return strings.isEmpty();
    }
    
    public void add(String value) {
        if (!strings.contains(value)) {
            strings.add(value);
        }
    }
    
    public List<String> values() {
        return strings;
    }
    
    public String take() {
        final String value = strings.get(strings.size() - 1);
        strings.remove(strings.size() - 1);
        return value;
    }
}
