package part5.oneminute1.bonus;

public class Bonus {
    public static void main(String[] args) {
        
    Clock clock = new Clock();
    
    while (true) {
        System.out.println(clock);
        clock.advance();
    }
    }
}
