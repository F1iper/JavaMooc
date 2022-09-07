package stash.part6;


import java.util.Arrays;

public class Kurs {
    int getId() {
        return id;
    }
    
    void setId(final int id) {
        this.id = id;
    }
    
    Kurs() {
        this.id = 1;
        this.name = "java";
        this.oceny = new int[4];
        for (int i = 0; i < oceny.length; i++) {
            oceny[i] = i + 50;
        }
    }
    
    @Override
    public String toString() {
        return "Kurs{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", oceny=" + Arrays.toString(oceny) +
                '}';
    }
    
    String getName() {
        return name;
    }
    
    void setName(final String name) {
        this.name = name;
    }
    
    int[] getOceny() {
        return oceny;
    }
    
    void setOceny(final int[] oceny) {
        this.oceny = oceny;
    }
    
    private int id;
    private String name;
    private int[] oceny;
}
