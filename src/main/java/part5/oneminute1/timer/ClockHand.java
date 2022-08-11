package part5.oneminute1.timer;

public class ClockHand {
    
    private int value;
    private int limit;
    
    @Override
    public String toString() {
        if (this.value < 10) {
            return "0" + this.value;
        }
        return "" + this.value;
    }
    
    int getValue() {
        return value;
    }
    
    void setValue(final int value) {
        this.value = value;
    }
    
    int getLimit() {
        return limit;
    }
    
    void setLimit(final int limit) {
        this.limit = limit;
    }
    
    public void advance() {
        this.value = this.value + 1;
        
        if (this.value >= this.limit) {
            this.value = 0;
        }
    }
    
    ClockHand(final int limit) {
        this.limit = limit;
        this.value = 0;
    }
}
