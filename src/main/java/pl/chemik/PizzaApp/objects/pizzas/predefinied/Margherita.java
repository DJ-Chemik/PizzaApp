package pl.chemik.PizzaApp.objects.pizzas.predefinied;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.chemik.PizzaApp.objects.ingredients.Ingredient;
import pl.chemik.PizzaApp.objects.ingredients.cheeses.Cheese;
import pl.chemik.PizzaApp.objects.ingredients.sauces.TomatoSauce;
import pl.chemik.PizzaApp.objects.ingredients.vegetables.Onion;
import pl.chemik.PizzaApp.objects.pizzas.Pizza;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class Margherita extends Pizza {

    @Autowired
    public Margherita(TomatoSauce tomatoSauce, Cheese cheese) {
        super();
        int numberInMenu = 1;
        String name = "Margherita";
        List<Ingredient> ingredients = new ArrayList<>();
        ingredients.add(tomatoSauce);
        ingredients.add(cheese);
        Map<Integer, Float> tableOfCostsAndSizes = new HashMap<>();
        tableOfCostsAndSizes.put(23, 11f);
        tableOfCostsAndSizes.put(30, 18f);
        tableOfCostsAndSizes.put(40, 24f);
        tableOfCostsAndSizes.put(50, 31f);
        this.setNumberInMenu(numberInMenu);
        this.setName(name);
        this.setIngredients(ingredients);
        this.setTableOfCostsAndSizes(tableOfCostsAndSizes);
    }
}
