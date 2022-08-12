package part5.overloadedcounter;

public class MainProgram {
    
    public static void main(String[] args) {
    
        Counter a = new Counter(900);
        Counter b = new Counter(50);
        Counter c = new Counter(-100);
    
        System.out.println(a.value());
        a.decrease(50);
        System.out.println(a.value());
        
    }
}
