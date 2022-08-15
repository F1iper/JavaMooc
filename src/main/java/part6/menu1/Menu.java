package part6.menu1;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    
    private List<String> meals;
    
    public Menu() {
        this.meals = new ArrayList<>();
    }
    
    public void addMeal(String meal) {
        if (!meals.contains(meal)) {
            meals.add(meal);
        }
    }
    
    public void printMeals() {
        for (String meal : meals) {
            System.out.println(meal);
        }
    }
    
    public void clearMenu() {
        meals.clear();
    }
}
