package part5.bonusstuff;

public class Person {
    
    private String name;
    private int age;
    private int height;
    private int weight;
    
    Person(final String name) {
       this(name, 0);
    }
    
    Person(final String name, final int age) {
        this.name = name;
        this.age = age;
        this.height = 0;
        this.weight = 0;
    }
    
    public void printPerson() {
        System.out.println(this.name + " is " + this.age + " years old");
    }
    
    public void growOlder() {
        this.age++;
    }
    
    public boolean isAdult() {
        return this.age < 18;
    }
    
    public double bodyMassIndex() {
        double heightInMeters = this.height / 100.0;
        return this.weight / (heightInMeters * heightInMeters);
    }
    
    public String toString() {
        return this.name + " is " + this.age + " years old, their BMI is " + this.bodyMassIndex();
    }
    
    String getName() {
        return name;
    }
    
    void setName(final String name) {
        this.name = name;
    }
    
    int getAge() {
        return age;
    }
    
    void setAge(final int age) {
        this.age = age;
    }
    
    int getHeight() {
        return height;
    }
    
    void setHeight(final int height) {
        this.height = height;
    }
    
    int getWeight() {
        return weight;
    }
    
    void setWeight(final int weight) {
        this.weight = weight;
    }
}
