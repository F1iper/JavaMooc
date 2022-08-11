package part5.cube3;

public class Main {
    public static void main(String[] args) {
    
        final Cube cube = new Cube(4);
        System.out.println(cube.volume());
        System.out.println(cube);
    
        System.out.println();
    
        final Cube salt = new Cube(2);
        System.out.println(salt.volume());
        System.out.println(salt);
        
    }
}
