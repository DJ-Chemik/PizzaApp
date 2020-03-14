package pl.chemik.PizzaApp.objects.pizzas.predefinied;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.chemik.PizzaApp.objects.ingredients.Ingredient;
import pl.chemik.PizzaApp.objects.ingredients.cheeses.Cheese;
import pl.chemik.PizzaApp.objects.ingredients.cheeses.ExtraCheese;
import pl.chemik.PizzaApp.objects.ingredients.fruits.Pineapple;
import pl.chemik.PizzaApp.objects.ingredients.meat.Kebab;
import pl.chemik.PizzaApp.objects.ingredients.sauces.TomatoSauce;
import pl.chemik.PizzaApp.objects.pizzas.Pizza;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class Zarra extends Pizza {

    @Autowired
    public Zarra(TomatoSauce tomatoSauce, Cheese cheese, Kebab kebab, Pineapple pineapple, ExtraCheese extraCheese) {
        super();
        int numberInMenu = 40;
        String name = "Zarra";
        List<Ingredient> ingredients = new ArrayList<>();
        ingredients.add(tomatoSauce);
        ingredients.add(cheese);
        ingredients.add(kebab);
        ingredients.add(pineapple);
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
