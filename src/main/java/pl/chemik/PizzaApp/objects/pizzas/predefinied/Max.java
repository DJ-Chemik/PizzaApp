package pl.chemik.PizzaApp.objects.pizzas.predefinied;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.chemik.PizzaApp.objects.ingredients.Ingredient;
import pl.chemik.PizzaApp.objects.ingredients.cheeses.Cheese;
import pl.chemik.PizzaApp.objects.ingredients.cheeses.ExtraCheese;
import pl.chemik.PizzaApp.objects.ingredients.meat.Bacon;
import pl.chemik.PizzaApp.objects.ingredients.meat.Salami;
import pl.chemik.PizzaApp.objects.ingredients.sauces.GyrosSauce;
import pl.chemik.PizzaApp.objects.ingredients.vegetables.Asparagus;
import pl.chemik.PizzaApp.objects.ingredients.vegetables.ChampignonMushrooms;
import pl.chemik.PizzaApp.objects.pizzas.Pizza;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class Max extends Pizza {

    @Autowired
    public Max(GyrosSauce gyrosSauce, Cheese cheese, Salami salami, Bacon bacon,
               ChampignonMushrooms champignonMushrooms, Asparagus asparagus, ExtraCheese extraCheese) {
        super();
        int numberInMenu = 42;
        String name = "Max";
        List<Ingredient> ingredients = new ArrayList<>();
        ingredients.add(gyrosSauce);
        ingredients.add(cheese);
        ingredients.add(salami);
        ingredients.add(bacon);
        ingredients.add(champignonMushrooms);
        ingredients.add(asparagus);
        ingredients.add(extraCheese);
        Map<Integer, Float> tableOfCostsAndSizes = new HashMap<>();
        tableOfCostsAndSizes.put(23, 19f);
        tableOfCostsAndSizes.put(30, 30f);
        tableOfCostsAndSizes.put(40, 39f);
        tableOfCostsAndSizes.put(50, 49f);
        this.setNumberInMenu(numberInMenu);
        this.setName(name);
        this.setIngredients(ingredients);
        this.setTableOfCostsAndSizes(tableOfCostsAndSizes);
    }
}
