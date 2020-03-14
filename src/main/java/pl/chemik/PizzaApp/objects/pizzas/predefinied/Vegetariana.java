package pl.chemik.PizzaApp.objects.pizzas.predefinied;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.chemik.PizzaApp.objects.ingredients.Ingredient;
import pl.chemik.PizzaApp.objects.ingredients.cheeses.Cheese;
import pl.chemik.PizzaApp.objects.ingredients.sauces.TomatoSauce;
import pl.chemik.PizzaApp.objects.ingredients.vegetables.*;
import pl.chemik.PizzaApp.objects.pizzas.Pizza;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class Vegetariana extends Pizza {

    @Autowired
    public Vegetariana(TomatoSauce tomatoSauce, Cheese cheese, ChampignonMushrooms champignonMushrooms, Onion onion,
                       Paprica paprica, Corn corn) {
        super();
        int numberInMenu = 14;
        String name = "Vegetariana";
        List<Ingredient> ingredients = new ArrayList<>();
        ingredients.add(tomatoSauce);
        ingredients.add(cheese);
        ingredients.add(champignonMushrooms);
        ingredients.add(onion);
        ingredients.add(paprica);
        ingredients.add(corn);
        Map<Integer, Float> tableOfCostsAndSizes = new HashMap<>();
        tableOfCostsAndSizes.put(23, 17f);
        tableOfCostsAndSizes.put(30, 26f);
        tableOfCostsAndSizes.put(40, 34f);
        tableOfCostsAndSizes.put(50, 43f);
        this.setNumberInMenu(numberInMenu);
        this.setName(name);
        this.setIngredients(ingredients);
        this.setTableOfCostsAndSizes(tableOfCostsAndSizes);
    }
}
