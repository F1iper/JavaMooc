package part5.datingapp16;

public class SimpleDate {
    private int day;
    private int month;
    private int year;
    
    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }
    
    SimpleDate(final int day, final int month, final int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    public boolean before(SimpleDate compared) {
        // first compare years
        if (this.year < compared.year) {
            return true;
        }
        
        // if the years are the same, compare months
        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }
        
        // the years and the months are the same, compare days
        if (this.year == compared.year && this.month == compared.month &&
                this.day < compared.day) {
            return true;
        }
        
        return false;
    }
    
    public void advance() {
        if (month == 12 && day == 30) {
            year++;
            month = 1;
            day = 1;
        } else if (month <= 12 && day == 30) {
            month++;
            day = 1;
        } else if (month <= 12 && day < 30) {
            day++;
        }
    }
    
    public void advance(int howManyDays) {
        for (int i = 0; i < howManyDays; i++) {
            advance();
        }
    }
    
    public SimpleDate afterNumberOfDays(int days) {
        SimpleDate newDate = new SimpleDate(this.day, this.month, this.year);
        newDate.advance(days);
        return newDate;
    }
}
