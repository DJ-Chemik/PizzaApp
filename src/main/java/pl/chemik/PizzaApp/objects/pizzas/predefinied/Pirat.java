package pl.chemik.PizzaApp.objects.pizzas.predefinied;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.chemik.PizzaApp.objects.ingredients.Ingredient;
import pl.chemik.PizzaApp.objects.ingredients.cheeses.Cheese;
import pl.chemik.PizzaApp.objects.ingredients.meat.Ham;
import pl.chemik.PizzaApp.objects.ingredients.meat.Kebab;
import pl.chemik.PizzaApp.objects.ingredients.sauces.GyrosSauce;
import pl.chemik.PizzaApp.objects.ingredients.vegetables.Asparagus;
import pl.chemik.PizzaApp.objects.ingredients.vegetables.Broccoli;
import pl.chemik.PizzaApp.objects.pizzas.Pizza;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class Pirat extends Pizza {

    @Autowired
    public Pirat(GyrosSauce gyrosSauce, Cheese cheese, Ham ham, Kebab kebab, Asparagus asparagus, Broccoli broccoli) {
        super();
        int numberInMenu = 43;
        String name = "Pirat";
        List<Ingredient> ingredients = new ArrayList<>();
        ingredients.add(gyrosSauce);
        ingredients.add(cheese);
        ingredients.add(ham);
        ingredients.add(kebab);
        ingredients.add(asparagus);
        ingredients.add(broccoli);
        Map<Integer, Float> tableOfCostsAndSizes = new HashMap<>();
        tableOfCostsAndSizes.put(23, 19f);
        tableOfCostsAndSizes.put(30, 31f);
        tableOfCostsAndSizes.put(40, 40f);
        tableOfCostsAndSizes.put(50, 50f);
        this.setNumberInMenu(numberInMenu);
        this.setName(name);
        this.setIngredients(ingredients);
        this.setTableOfCostsAndSizes(tableOfCostsAndSizes);
    }
}
