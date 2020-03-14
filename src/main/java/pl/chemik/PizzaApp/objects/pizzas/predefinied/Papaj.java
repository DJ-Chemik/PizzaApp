package pl.chemik.PizzaApp.objects.pizzas.predefinied;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.chemik.PizzaApp.objects.ingredients.Ingredient;
import pl.chemik.PizzaApp.objects.ingredients.cheeses.Cheese;
import pl.chemik.PizzaApp.objects.ingredients.meat.Ham;
import pl.chemik.PizzaApp.objects.ingredients.sauces.CreamSauce;
import pl.chemik.PizzaApp.objects.ingredients.vegetables.Garlic;
import pl.chemik.PizzaApp.objects.ingredients.vegetables.Onion;
import pl.chemik.PizzaApp.objects.ingredients.vegetables.Spinach;
import pl.chemik.PizzaApp.objects.pizzas.Pizza;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class Papaj extends Pizza {

    @Autowired
    public Papaj(CreamSauce creamSauce, Cheese cheese, Ham ham, Spinach spinach, Onion onion, Garlic garlic) {
        super();
        int numberInMenu = 46;
        String name = "Papaj";
        List<Ingredient> ingredients = new ArrayList<>();
        ingredients.add(creamSauce);
        ingredients.add(cheese);
        ingredients.add(ham);
        ingredients.add(spinach);
        ingredients.add(onion);
        ingredients.add(garlic);
        Map<Integer, Float> tableOfCostsAndSizes = new HashMap<>();
        tableOfCostsAndSizes.put(23, 17f);
        tableOfCostsAndSizes.put(30, 27f);
        tableOfCostsAndSizes.put(40, 36f);
        tableOfCostsAndSizes.put(50, 46f);
        this.setNumberInMenu(numberInMenu);
        this.setName(name);
        this.setIngredients(ingredients);
        this.setTableOfCostsAndSizes(tableOfCostsAndSizes);
    }

}
