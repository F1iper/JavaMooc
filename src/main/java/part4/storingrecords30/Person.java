package part4.storingrecords30;

public class Person {
    
    private String name;
    private int age;
    
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
    
    Person(final String name, final int age) {
        this.name = name;
        this.age = age;
    }
}
