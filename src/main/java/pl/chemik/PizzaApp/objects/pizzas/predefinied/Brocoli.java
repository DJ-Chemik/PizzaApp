package pl.chemik.PizzaApp.objects.pizzas.predefinied;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.chemik.PizzaApp.objects.ingredients.Ingredient;
import pl.chemik.PizzaApp.objects.ingredients.cheeses.Cheese;
import pl.chemik.PizzaApp.objects.ingredients.meat.Ham;
import pl.chemik.PizzaApp.objects.ingredients.cheeses.Camembert;
import pl.chemik.PizzaApp.objects.ingredients.sauces.TomatoSauce;
import pl.chemik.PizzaApp.objects.ingredients.vegetables.Broccoli;
import pl.chemik.PizzaApp.objects.pizzas.Pizza;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class Brocoli extends Pizza {

    @Autowired
    public Brocoli(TomatoSauce tomatoSauce, Cheese cheese, Ham ham, Broccoli broccoli, Camembert camembert) {
        super();
        int numberInMenu = 26;
        String name = "Broccoli";
        List<Ingredient> ingredients = new ArrayList<>();
        ingredients.add(tomatoSauce);
        ingredients.add(cheese);
        ingredients.add(ham);
        ingredients.add(broccoli);
        ingredients.add(camembert);
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
