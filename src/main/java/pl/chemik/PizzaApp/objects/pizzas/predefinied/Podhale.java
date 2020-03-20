package pl.chemik.PizzaApp.objects.pizzas.predefinied;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.chemik.PizzaApp.objects.ingredients.Ingredient;
import pl.chemik.PizzaApp.objects.ingredients.cheeses.Cheese;
import pl.chemik.PizzaApp.objects.ingredients.meat.Salami;
import pl.chemik.PizzaApp.objects.ingredients.cheeses.SmokedCheese;
import pl.chemik.PizzaApp.objects.ingredients.sauces.TomatoSauce;
import pl.chemik.PizzaApp.objects.ingredients.vegetables.Onion;
import pl.chemik.PizzaApp.objects.pizzas.Pizza;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class Podhale extends Pizza {

    @Autowired
    public Podhale(TomatoSauce tomatoSauce , Cheese cheese, Salami salami, SmokedCheese smokedCheese, Onion onion) {
        super();
        int numberInMenu = 45;
        String name = "Podhale";
        List<Ingredient> ingredients = new ArrayList<>();
        ingredients.add(tomatoSauce);
        ingredients.add(cheese);
        ingredients.add(salami);
        ingredients.add(smokedCheese);
        ingredients.add(onion);
        Map<Integer, Float> tableOfCostsAndSizes = new HashMap<>();
        tableOfCostsAndSizes.put(23, 18f);
        tableOfCostsAndSizes.put(30, 27f);
        tableOfCostsAndSizes.put(40, 36f);
        tableOfCostsAndSizes.put(50, 46f);
        this.setNumberInMenu(numberInMenu);
        this.setName(name);
        this.setIngredients(ingredients);
        this.setTableOfCostsAndSizes(tableOfCostsAndSizes);
    }
}
