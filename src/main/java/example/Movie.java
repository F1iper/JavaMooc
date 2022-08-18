package example;

import java.util.Objects;

public class Movie {
    private String name;
    private int length;
    
    String getName() {
        return name;
    }
    
    void setName(final String name) {
        this.name = name;
    }
    
    int getLength() {
        return length;
    }
    
    void setLength(final int length) {
        this.length = length;
    }
    
    Movie(final String name, final int length) {
        this.name = name;
        this.length = length;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof final Movie movie)) return false;
    
        if (length != movie.length) return false;
        return Objects.equals(name, movie.name);
    }
    
    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + length;
        return result;
    }
}
