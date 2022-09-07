package codekata;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        
        eqSumPowDig(100, 2);
        eqSumPowDig(100, 2);
        eqSumPowDig(100, 2);
        eqSumPowDig(100, 2);
    }
    
    
    public static long[] eqSumPowDig(long hmax, int exp) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Provide number:");
        long number = scanner.nextLong(); // wczytanie liczby i zapisanie w zmiennej number
        
        String str = String.valueOf(number); // konwersja liczby na ciag znakow str
        final char[] chars = str.toCharArray(); // konwersja ciagu znakow str na tablice chars
        List<Long> longs = new ArrayList<>();
        
        int[] ints = new int[chars.length]; // stworzenie pustej tablicy na inty o rozmiarze chars
        int counter = 0; // licznik petli
        int sum = 0; // suma wartosci w tablicy
       
        for (Character theChar : chars) { // znajdz kazdy element typu Character w tablicy chars
            final int numericValue = Character.getNumericValue(theChar); // kazdy element przekonwertuj na int
            int quadraticNumber = numericValue * numericValue * numericValue; // liczba podniesiona do potęgi 3
            ints[counter] = quadraticNumber; // przypisz spotęgowaną liczbę do tablicy intów
            
            sum += ints[counter]; // do sumy dodaj spotęgowaną liczbę
            if (number == sum) { // jeżeli liczba wprowadzona równą się sumie liczb w tablicy intów to:
             
               longs.add(number);
            }
            counter++;
            System.out.println(sum);
        }
        
        
        return new long[0];
        
    }
}
