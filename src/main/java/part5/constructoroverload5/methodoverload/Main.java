package part5.constructoroverload5.methodoverload;

public class Main {
    
    private String name;
    private int age;
    
    @Override
    public String toString() {
        return "Main{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    
    Main(final String name, final int age) {
        this.name = name;
        this.age = age;
    }
    
    public void growOlder() {
        this.age++;
    }
    
    public void growOlder(int years) {
        this.age += years;
    }
    
    public static void main(String[] args) {
        Main paul = new Main("Paul", 24);
        System.out.println(paul);
    
        paul.growOlder();
        System.out.println(paul);
    
        paul.growOlder(10);
        System.out.println(paul);
    }
}
