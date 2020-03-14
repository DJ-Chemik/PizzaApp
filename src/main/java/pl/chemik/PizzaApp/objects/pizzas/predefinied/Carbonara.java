package pl.chemik.PizzaApp.objects.pizzas.predefinied;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.chemik.PizzaApp.objects.ingredients.Ingredient;
import pl.chemik.PizzaApp.objects.ingredients.cheeses.Cheese;
import pl.chemik.PizzaApp.objects.ingredients.cheeses.ExtraCheese;
import pl.chemik.PizzaApp.objects.ingredients.meat.OxtailHam;
import pl.chemik.PizzaApp.objects.ingredients.sauces.CreamSauce;
import pl.chemik.PizzaApp.objects.ingredients.vegetables.Onion;
import pl.chemik.PizzaApp.objects.pizzas.Pizza;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class Carbonara extends Pizza {

    @Autowired
    public Carbonara(CreamSauce creamSauce, Cheese cheese, OxtailHam oxtailHam, Onion onion, ExtraCheese extraCheese) {
        super();
        int numberInMenu = 34;
        String name = "Carbonara";
        List<Ingredient> ingredients = new ArrayList<>();
        ingredients.add(creamSauce);
        ingredients.add(cheese);
        ingredients.add(oxtailHam);
        ingredients.add(onion);
        ingredients.add(extraCheese);
        Map<Integer, Float> tableOfCostsAndSizes = new HashMap<>();
        tableOfCostsAndSizes.put(23, 18f);
        tableOfCostsAndSizes.put(30, 28f);
        tableOfCostsAndSizes.put(40, 37f);
        tableOfCostsAndSizes.put(50, 47f);
        this.setNumberInMenu(numberInMenu);
        this.setName(name);
        this.setIngredients(ingredients);
        this.setTableOfCostsAndSizes(tableOfCostsAndSizes);
    }
}
