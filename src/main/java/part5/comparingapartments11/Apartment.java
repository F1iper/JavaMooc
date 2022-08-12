package part5.comparingapartments11;

public class Apartment {
    final private int rooms;
    final private int squares;
    final private int pricePerSquare;
    
    Apartment(final int rooms, final int squares, final int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }
    
    public boolean largerThan(Apartment apartment) {
        return apartment.squares < squares;
    }
    
    public int priceDifference(Apartment compared) {
        if (this.squares > compared.squares) {
            return (this.squares * this.pricePerSquare) - (compared.squares * compared.pricePerSquare);
        } else {
            return (compared.squares * compared.pricePerSquare) - (this.squares * this.pricePerSquare);
        }
    }
    
    public boolean moreExpensiveThan(Apartment compared) {
        return (pricePerSquare * squares) > (compared.pricePerSquare * compared.squares);
    }
    
}
