package pl.chemik.PizzaApp.objects.pizzas.predefinied;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.chemik.PizzaApp.objects.ingredients.Ingredient;
import pl.chemik.PizzaApp.objects.ingredients.cheeses.Cheese;
import pl.chemik.PizzaApp.objects.ingredients.cheeses.FetaCheese;
import pl.chemik.PizzaApp.objects.ingredients.meat.Kebab;
import pl.chemik.PizzaApp.objects.ingredients.sauces.TomatoSauce;
import pl.chemik.PizzaApp.objects.ingredients.vegetables.Broccoli;
import pl.chemik.PizzaApp.objects.ingredients.vegetables.Onion;
import pl.chemik.PizzaApp.objects.ingredients.vegetables.Tomato;
import pl.chemik.PizzaApp.objects.pizzas.Pizza;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class Parma extends Pizza {

    @Autowired
    public Parma(TomatoSauce tomatoSauce, Cheese cheese, Kebab kebab, Broccoli broccoli, Tomato tomato,
                 Onion onion, FetaCheese fetaCheese) {
        super();
        int numberInMenu = 32;
        String name = "Parma";
        List<Ingredient> ingredients = new ArrayList<>();
        ingredients.add(tomatoSauce);
        ingredients.add(cheese);
        ingredients.add(kebab);
        ingredients.add(broccoli);
        ingredients.add(tomato);
        ingredients.add(onion);
        ingredients.add(fetaCheese);
        Map<Integer, Float> tableOfCostsAndSizes = new HashMap<>();
        tableOfCostsAndSizes.put(23, 20f);
        tableOfCostsAndSizes.put(30, 31f);
        tableOfCostsAndSizes.put(40, 40f);
        tableOfCostsAndSizes.put(50, 50f);
        this.setNumberInMenu(numberInMenu);
        this.setName(name);
        this.setIngredients(ingredients);
        this.setTableOfCostsAndSizes(tableOfCostsAndSizes);
    }
}
