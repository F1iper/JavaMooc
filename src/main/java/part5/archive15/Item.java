package part5.archive15;

import java.util.Objects;

public class Item {
    
    private String identifier;
    private String name;
    
    public Item(final String identifier, final String name) {
        this.identifier = identifier;
        this.name = name;
    }
    
    public Item(final String identifier) {
        this.identifier = identifier;
    }
    
    @Override
    public String toString() {
        return identifier + ": " + name;
    }
    
    @Override
    public boolean equals(final Object o) {
        final Item item = (Item) o;
        return identifier.equals(item.identifier);
    }
    
    String getIdentifier() {
        return identifier;
    }
    
    void setIdentifier(final String identifier) {
        this.identifier = identifier;
    }
    
    String getName() {
        return name;
    }
    
    void setName(final String name) {
        this.name = name;
    }
    
    @Override
    public int hashCode() {
        int result = identifier != null ? identifier.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
