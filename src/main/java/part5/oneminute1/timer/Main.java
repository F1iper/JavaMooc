package part5.oneminute1.timer;

public class Main {
    public static void main(String[] args) {
        
        Timer timer = new Timer();
        
        while (true) {
            System.out.println(timer);
            timer.advance();
            
            try {
                Thread.sleep(10);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
