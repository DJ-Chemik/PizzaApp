package pl.chemik.PizzaApp.objects.pizzas.predefinied;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.chemik.PizzaApp.objects.ingredients.Ingredient;
import pl.chemik.PizzaApp.objects.ingredients.cheeses.Cheese;
import pl.chemik.PizzaApp.objects.ingredients.meat.Ham;
import pl.chemik.PizzaApp.objects.ingredients.sauces.TomatoSauce;
import pl.chemik.PizzaApp.objects.ingredients.vegetables.ChampignonMushrooms;
import pl.chemik.PizzaApp.objects.pizzas.Pizza;

import java.util.*;

@Component
public class Capriciosa extends Pizza {

    @Autowired
    public Capriciosa(TomatoSauce tomatoSauce, Cheese cheese, Ham ham, ChampignonMushrooms champignonMushrooms) {
        super();
        int numberInMenu = 5;
        String name = "Capriciosa";
        List<Ingredient> ingredients = new ArrayList<>();
        ingredients.add(tomatoSauce);
        ingredients.add(cheese);
        ingredients.add(ham);
        ingredients.add(champignonMushrooms);
        Map<Integer, Float> tableOfCostsAndSizes = new HashMap<>();
        tableOfCostsAndSizes.put(23, 15f);
        tableOfCostsAndSizes.put(30, 23f);
        tableOfCostsAndSizes.put(40, 31f);
        tableOfCostsAndSizes.put(50, 40f);
        this.setNumberInMenu(numberInMenu);
        this.setName(name);
        this.setIngredients(ingredients);
        this.setTableOfCostsAndSizes(tableOfCostsAndSizes);
    }
}
