package part5.oneminute1.timer;

public class Timer {
    
    private ClockHand seconds;
    private ClockHand miliseconds;
    
    ClockHand getSeconds() {
        return seconds;
    }
    
    void setSeconds(final ClockHand seconds) {
        this.seconds = seconds;
    }
    
    ClockHand getMiliseconds() {
        return miliseconds;
    }
    
    void setMiliseconds(final ClockHand miliseconds) {
        this.miliseconds = miliseconds;
    }
    
    @Override
    public String toString() {
        return seconds + ":" + miliseconds;
    }
    
    public Timer() {
        this.seconds = new ClockHand(60);
        this.miliseconds = new ClockHand(100);
    }
    
    public void advance() {
        this.miliseconds.advance();
        
        if (this.miliseconds.getValue() == 0) {
            this.seconds.advance();
        }
    }
    
}
