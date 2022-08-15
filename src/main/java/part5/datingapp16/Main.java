package part5.datingapp16;

public class Main {
    
    public static void main(String[] args) {
        
        SimpleDate date1 = new SimpleDate(1, 11, 1990);
        SimpleDate date2 = new SimpleDate(30, 12, 1990);
        SimpleDate date3 = new SimpleDate(29, 12, 1990);
        SimpleDate date4 = new SimpleDate(30, 1, 1990);
        
        System.out.println("date 1 === " + date1);
        System.out.println("date 2 === " + date2);
        System.out.println("date 3 === " + date3);
        System.out.println("date 4 === " + date4);
        
        date1.advance();
        date2.advance();
        final SimpleDate date = date3.afterNumberOfDays(10);
        date4.advance(5);
        System.out.println();
        
        System.out.println("date 1 === " + date1);
        System.out.println("date 2 === " + date2);
        System.out.println("date 3 === " + date);
        System.out.println("date 4 === " + date4);
    }
}
