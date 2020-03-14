package pl.chemik.PizzaApp.objects.pizzas.predefinied;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.chemik.PizzaApp.objects.ingredients.Ingredient;
import pl.chemik.PizzaApp.objects.ingredients.cheeses.Cheese;
import pl.chemik.PizzaApp.objects.ingredients.meat.Sausage;
import pl.chemik.PizzaApp.objects.ingredients.sauces.TomatoSauce;
import pl.chemik.PizzaApp.objects.ingredients.vegetables.PickledCucumber;
import pl.chemik.PizzaApp.objects.ingredients.vegetables.RoastedOnion;
import pl.chemik.PizzaApp.objects.pizzas.Pizza;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class Chłopska extends Pizza {

    @Autowired
    public Chłopska(TomatoSauce tomatoSauce, Cheese cheese, Sausage sausage, PickledCucumber pickledCucumber,
                    RoastedOnion roastedOnion) {
        super();
        int numberInMenu = 54;
        String name = "Chłopska";
        List<Ingredient> ingredients = new ArrayList<>();
        ingredients.add(tomatoSauce);
        ingredients.add(cheese);
        ingredients.add(sausage);
        ingredients.add(pickledCucumber);
        ingredients.add(roastedOnion);
        Map<Integer, Float> tableOfCostsAndSizes = new HashMap<>();
        tableOfCostsAndSizes.put(23, 19f);
        tableOfCostsAndSizes.put(30, 29f);
        tableOfCostsAndSizes.put(40, 39f);
        tableOfCostsAndSizes.put(50, 49f);
        this.setNumberInMenu(numberInMenu);
        this.setName(name);
        this.setIngredients(ingredients);
        this.setTableOfCostsAndSizes(tableOfCostsAndSizes);
    }
}
