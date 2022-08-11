package part5.book2.bonus;

public class Person {
    
    private String name;
    private int age;
    private double weight;
    private double height;
    
    public double bodyMassIndex() {
        return this.weight / (this.height * this.height);
    }
    
    public double maximumHeartRate() {
        return 206.3 - (0.711 * this.age);
    }
    
    @Override
    public String toString() {
        return this.name + ", BMI: " + this.bodyMassIndex() +
                 ", maximum heart rate: " + this.maximumHeartRate();
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
    
    double getWeight() {
        return weight;
    }
    
    void setWeight(final double weight) {
        this.weight = weight;
    }
    
    double getHeight() {
        return height;
    }
    
    void setHeight(final double height) {
        this.height = height;
    }
    
    Person(final String name, final int age, final double weight, final double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }
}
