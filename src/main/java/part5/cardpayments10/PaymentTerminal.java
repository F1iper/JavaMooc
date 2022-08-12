package part5.cardpayments10;

public class PaymentTerminal {
    private double money;
    private int affordableMeals;
    private int heartyMeals;
    
    public PaymentTerminal() {
        this.money = 1000;
    }
    
    public double eatAffordably(double payment) {
        double affordablyPrice = 2.50;
        if (payment >= affordablyPrice) {
            affordableMeals++;
            money += affordablyPrice;
            return payment - affordablyPrice;
        } else {
            return payment;
        }
    }
    
    public double eatHeartily(double payment) {
        double heartlyPrice = 4.30;
        if (payment >= heartlyPrice) {
            heartyMeals++;
            money += heartlyPrice;
            return payment - heartlyPrice;
        } else {
            return payment;
        }
    }
    
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " +
                affordableMeals + ", number of sold hearty meals: " +
                heartyMeals;
    }
    
    public boolean eatAffordably(PaymentCard card) {
        double mealPrice = 2.5;
        if (card.balance() >= mealPrice) {
            card.takeMoney(mealPrice);
            affordableMeals++;
            return true;
        } else {
            return false;
        }
    }
    
    public boolean eatHeartily(PaymentCard card) {
        double mealPrice = 4.3;
        if (card.balance() >= mealPrice) {
            card.takeMoney(mealPrice);
            heartyMeals++;
            return true;
        } else {
            return false;
        }
    }
    
    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum > 0) {
            money += sum;
            card.addMoney(sum);
        }
    }
}
