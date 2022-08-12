package part5.constructoroverload5;

public class Main {
    
    public static void main(String[] args) {
        
        final Product tape = new Product("Tape measure");
        final Product product = new Product("Plaster", "home improvement section");
        final Product tyre = new Product("Tyre", 5);
        
        System.out.println(tape);
        System.out.println(product);
        System.out.println(tyre);
    }
}

