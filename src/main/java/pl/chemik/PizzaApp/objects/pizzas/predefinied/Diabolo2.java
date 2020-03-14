package pl.chemik.PizzaApp.objects.pizzas.predefinied;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.chemik.PizzaApp.objects.ingredients.Ingredient;
import pl.chemik.PizzaApp.objects.ingredients.cheeses.Cheese;
import pl.chemik.PizzaApp.objects.ingredients.meat.Bacon;
import pl.chemik.PizzaApp.objects.ingredients.meat.Salami;
import pl.chemik.PizzaApp.objects.ingredients.sauces.Tabasco;
import pl.chemik.PizzaApp.objects.ingredients.sauces.TomatoSauce;
import pl.chemik.PizzaApp.objects.ingredients.vegetables.GreenPeppercorns;
import pl.chemik.PizzaApp.objects.ingredients.vegetables.JalapenoPepper;
import pl.chemik.PizzaApp.objects.ingredients.vegetables.Onion;
import pl.chemik.PizzaApp.objects.pizzas.Pizza;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class Diabolo2 extends Pizza {

    @Autowired
    public Diabolo2(TomatoSauce tomatoSauce, Cheese cheese, Salami salami, Bacon bacon, JalapenoPepper jalapenoPepper,
                    Onion onion, Tabasco tabasco, GreenPeppercorns greenPeppercorns) {
        super();
        int numberInMenu = 30;
        String name = "Diabolo 2";
        List<Ingredient> ingredients = new ArrayList<>();
        ingredients.add(tomatoSauce);
        ingredients.add(cheese);
        ingredients.add(salami);
        ingredients.add(bacon);
        ingredients.add(jalapenoPepper);
        ingredients.add(onion);
        ingredients.add(tabasco);
        ingredients.add(greenPeppercorns);
        Map<Integer, Float> tableOfCostsAndSizes = new HashMap<>();
        tableOfCostsAndSizes.put(23, 19f);
        tableOfCostsAndSizes.put(30, 29f);
        tableOfCostsAndSizes.put(40, 38f);
        tableOfCostsAndSizes.put(50, 49f);
        this.setNumberInMenu(numberInMenu);
        this.setName(name);
        this.setIngredients(ingredients);
        this.setTableOfCostsAndSizes(tableOfCostsAndSizes);
    }
}
