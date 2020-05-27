
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<String>();
    }

    // add the methods here
    public void addMeal(String meal) {
        if (!this.meals.contains(meal)) {
            this.meals.add(meal);
        }
    }
    
    public void printMeals() {
        //zeby kazda pozycja byla wydrukowana w nowej linii musi byc 'for'
        //dla kazdego meal z listy this.meals, wydrukuj meal
        for (String meal : this.meals)
        System.out.println(meal);
    }
    
    public void clearMenu() {
        meals.clear();
    }
}
