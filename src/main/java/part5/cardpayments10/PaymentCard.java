package part5.cardpayments10;

public class PaymentCard {
    private double balance;
    
    public PaymentCard(double balance) {
        this.balance = balance;
    }
    
    public double balance() {
        return this.balance;
    }
    
    public void addMoney(double increase) {
        this.balance += increase;
    }
    
    public boolean takeMoney(double amount) {
        if (balance > amount) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }
}
