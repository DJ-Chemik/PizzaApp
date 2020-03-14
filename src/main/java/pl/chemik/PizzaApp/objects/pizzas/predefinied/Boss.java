package pl.chemik.PizzaApp.objects.pizzas.predefinied;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.chemik.PizzaApp.objects.ingredients.Ingredient;
import pl.chemik.PizzaApp.objects.ingredients.cheeses.Cheese;
import pl.chemik.PizzaApp.objects.ingredients.cheeses.ExtraCheese;
import pl.chemik.PizzaApp.objects.ingredients.meat.Bacon;
import pl.chemik.PizzaApp.objects.ingredients.meat.Kebab;
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
public class Boss extends Pizza {

    @Autowired
    public Boss(TomatoSauce tomatoSauce, Cheese cheese, Salami salami, Bacon bacon, Kebab kebab,
                PepperoniPepper pepperoniPepper, Onion onion, ExtraCheese extraCheese) {
        super();
        int numberInMenu = 33;
        String name = "Boss";
        List<Ingredient> ingredients = new ArrayList<>();
        ingredients.add(tomatoSauce);
        ingredients.add(cheese);
        ingredients.add(salami);
        ingredients.add(bacon);
        ingredients.add(kebab);
        ingredients.add(pepperoniPepper);
        ingredients.add(onion);
        ingredients.add(extraCheese);
        Map<Integer, Float> tableOfCostsAndSizes = new HashMap<>();
        tableOfCostsAndSizes.put(23, 21f);
        tableOfCostsAndSizes.put(30, 34f);
        tableOfCostsAndSizes.put(40, 43f);
        tableOfCostsAndSizes.put(50, 53f);
        this.setNumberInMenu(numberInMenu);
        this.setName(name);
        this.setIngredients(ingredients);
        this.setTableOfCostsAndSizes(tableOfCostsAndSizes);
    }
}
