package pl.chemik.PizzaApp.objects.pizzas.predefinied;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.chemik.PizzaApp.objects.ingredients.Ingredient;
import pl.chemik.PizzaApp.objects.ingredients.cheeses.Cheese;
import pl.chemik.PizzaApp.objects.ingredients.meat.Ham;
import pl.chemik.PizzaApp.objects.ingredients.meat.Salami;
import pl.chemik.PizzaApp.objects.ingredients.sauces.BologneseSauce;
import pl.chemik.PizzaApp.objects.ingredients.vegetables.Onion;
import pl.chemik.PizzaApp.objects.pizzas.Pizza;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class Bolognese extends Pizza {

    @Autowired
    public Bolognese(BologneseSauce bologneseSauce, Cheese cheese, Ham ham, Salami salami, Onion onion) {
        super();
        int numberInMenu = 41;
        String name = "Bolognese";
        List<Ingredient> ingredients = new ArrayList<>();
        ingredients.add(bologneseSauce);
        ingredients.add(cheese);
        ingredients.add(ham);
        ingredients.add(salami);
        ingredients.add(onion);
        Map<Integer, Float> tableOfCostsAndSizes = new HashMap<>();
        tableOfCostsAndSizes.put(23, 17f);
        tableOfCostsAndSizes.put(30, 26f);
        tableOfCostsAndSizes.put(40, 35f);
        tableOfCostsAndSizes.put(50, 46f);
        this.setNumberInMenu(numberInMenu);
        this.setName(name);
        this.setIngredients(ingredients);
        this.setTableOfCostsAndSizes(tableOfCostsAndSizes);
    }
}
