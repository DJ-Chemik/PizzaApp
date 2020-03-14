package pl.chemik.PizzaApp.objects.pizzas.predefinied;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.chemik.PizzaApp.objects.ingredients.Ingredient;
import pl.chemik.PizzaApp.objects.ingredients.cheeses.Cheese;
import pl.chemik.PizzaApp.objects.ingredients.meat.Kebab;
import pl.chemik.PizzaApp.objects.ingredients.meat.OxtailHam;
import pl.chemik.PizzaApp.objects.ingredients.sauces.BarbequeSauce;
import pl.chemik.PizzaApp.objects.ingredients.vegetables.Onion;
import pl.chemik.PizzaApp.objects.pizzas.Pizza;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class Berbecue extends Pizza {

    @Autowired
    public Berbecue(BarbequeSauce barbequeSauce, Cheese cheese, Kebab kebab, OxtailHam oxtailHam, Onion onion) {
        super();
        int numberInMenu = 35;
        String name = "Berbecue";
        List<Ingredient> ingredients = new ArrayList<>();
        ingredients.add(barbequeSauce);
        ingredients.add(cheese);
        ingredients.add(kebab);
        ingredients.add(oxtailHam);
        ingredients.add(onion);
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
