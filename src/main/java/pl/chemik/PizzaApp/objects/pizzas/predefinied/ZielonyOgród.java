package pl.chemik.PizzaApp.objects.pizzas.predefinied;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.chemik.PizzaApp.objects.ingredients.Ingredient;
import pl.chemik.PizzaApp.objects.ingredients.cheeses.Cheese;
import pl.chemik.PizzaApp.objects.ingredients.sauces.TomatoSauce;
import pl.chemik.PizzaApp.objects.ingredients.vegetables.Asparagus;
import pl.chemik.PizzaApp.objects.ingredients.vegetables.Broccoli;
import pl.chemik.PizzaApp.objects.ingredients.vegetables.Rucola;
import pl.chemik.PizzaApp.objects.ingredients.vegetables.Spinach;
import pl.chemik.PizzaApp.objects.pizzas.Pizza;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class ZielonyOgród extends Pizza {

    @Autowired
    public ZielonyOgród(TomatoSauce tomatoSauce, Cheese cheese, Spinach spinach, Broccoli broccoli,
                        Asparagus asparagus, Rucola rucola) {
        super();
        int numberInMenu = 53;
        String name = "Zielony Ogród";
        List<Ingredient> ingredients = new ArrayList<>();
        ingredients.add(tomatoSauce);
        ingredients.add(cheese);
        ingredients.add(spinach);
        ingredients.add(broccoli);
        ingredients.add(asparagus);
        ingredients.add(rucola);
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
