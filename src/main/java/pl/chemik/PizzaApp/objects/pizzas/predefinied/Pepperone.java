package pl.chemik.PizzaApp.objects.pizzas.predefinied;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.chemik.PizzaApp.objects.ingredients.Ingredient;
import pl.chemik.PizzaApp.objects.ingredients.cheeses.Cheese;
import pl.chemik.PizzaApp.objects.ingredients.fruits.Pineapple;
import pl.chemik.PizzaApp.objects.ingredients.meat.Ham;
import pl.chemik.PizzaApp.objects.ingredients.meat.Salami;
import pl.chemik.PizzaApp.objects.ingredients.sauces.TomatoSauce;
import pl.chemik.PizzaApp.objects.ingredients.vegetables.Onion;
import pl.chemik.PizzaApp.objects.ingredients.vegetables.PepperoniPepper;
import pl.chemik.PizzaApp.objects.pizzas.Pizza;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class Pepperone extends Pizza {

    @Autowired
    public Pepperone(TomatoSauce tomatoSauce, Cheese cheese, Salami salami, PepperoniPepper pepperoniPepper,
                     Onion onion) {
        super();
        int numberInMenu = 9;
        String name = "Pepperone";
        List<Ingredient> ingredients = new ArrayList<>();
        ingredients.add(tomatoSauce);
        ingredients.add(cheese);
        ingredients.add(salami);
        ingredients.add(pepperoniPepper);
        ingredients.add(onion);
        Map<Integer, Float> tableOfCostsAndSizes = new HashMap<>();
        tableOfCostsAndSizes.put(23, 17f);
        tableOfCostsAndSizes.put(30, 25f);
        tableOfCostsAndSizes.put(40, 34f);
        tableOfCostsAndSizes.put(50, 44f);
        this.setNumberInMenu(numberInMenu);
        this.setName(name);
        this.setIngredients(ingredients);
        this.setTableOfCostsAndSizes(tableOfCostsAndSizes);
    }
}
