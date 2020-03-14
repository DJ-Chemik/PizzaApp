package pl.chemik.PizzaApp.objects.pizzas.predefinied;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.chemik.PizzaApp.objects.ingredients.Ingredient;
import pl.chemik.PizzaApp.objects.ingredients.cheeses.Cheese;
import pl.chemik.PizzaApp.objects.ingredients.sauces.TomatoSauce;
import pl.chemik.PizzaApp.objects.ingredients.seafoods.Capers;
import pl.chemik.PizzaApp.objects.ingredients.seafoods.Tuna;
import pl.chemik.PizzaApp.objects.ingredients.vegetables.Onion;
import pl.chemik.PizzaApp.objects.pizzas.Pizza;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class Pescatore extends Pizza {

    @Autowired
    public Pescatore(TomatoSauce tomatoSauce, Cheese cheese, Tuna tuna, Onion onion, Capers capers) {
        super();
        int numberInMenu = 11;
        String name = "Pescatore";
        List<Ingredient> ingredients = new ArrayList<>();
        ingredients.add(tomatoSauce);
        ingredients.add(cheese);
        ingredients.add(tuna);
        ingredients.add(onion);
        ingredients.add(capers);
        Map<Integer, Float> tableOfCostsAndSizes = new HashMap<>();
        tableOfCostsAndSizes.put(23, 17f);
        tableOfCostsAndSizes.put(30, 26f);
        tableOfCostsAndSizes.put(40, 35f);
        tableOfCostsAndSizes.put(50, 45f);
        this.setNumberInMenu(numberInMenu);
        this.setName(name);
        this.setIngredients(ingredients);
        this.setTableOfCostsAndSizes(tableOfCostsAndSizes);
    }
}
