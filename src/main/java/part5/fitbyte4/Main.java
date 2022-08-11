package part5.fitbyte4;

public class Main {
    public static void main(String[] args) {
        
        final Fitbyte fitbyte = new Fitbyte(30, 60);
        
        double percentage = 0.5;
        
        while (percentage < 1.0) {
            double target = fitbyte.targetHeartRate(percentage);
            System.out.println("Target " + (percentage * 100) + "% of maximum: " + target);
            percentage = percentage + 0.1;
        }
    }
}
