package part5.fitbyte4;

public class Fitbyte {
    
    private int age;
    private int restingHeartRate;
    
    public Fitbyte(final int age, final int restingHeartRate) {
        this.age = age;
        this.restingHeartRate = restingHeartRate;
    }
    
    public double targetHeartRate(double percentageOfMaximum) {
        double maximumHeartRate = 206.3 - (0.711 * this.age);
        return ((maximumHeartRate - restingHeartRate) * (percentageOfMaximum) + this.restingHeartRate);
    }
}
