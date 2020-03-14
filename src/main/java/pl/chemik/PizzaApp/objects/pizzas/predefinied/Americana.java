package pl.chemik.PizzaApp.objects.pizzas.predefinied;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.chemik.PizzaApp.objects.ingredients.Ingredient;
import pl.chemik.PizzaApp.objects.ingredients.cheeses.Cheese;
import pl.chemik.PizzaApp.objects.ingredients.meat.Ham;
import pl.chemik.PizzaApp.objects.ingredients.meat.Kebab;
import pl.chemik.PizzaApp.objects.ingredients.other.ExtraPizzaDough;
import pl.chemik.PizzaApp.objects.ingredients.sauces.TomatoSauce;
import pl.chemik.PizzaApp.objects.ingredients.vegetables.ChampignonMushrooms;
import pl.chemik.PizzaApp.objects.ingredients.vegetables.Onion;
import pl.chemik.PizzaApp.objects.ingredients.vegetables.Tomato;
import pl.chemik.PizzaApp.objects.pizzas.Pizza;
import pl.chemik.PizzaApp.objects.pizzas.WrongCostsOfPizzaSizesException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class Americana extends Pizza{

    @Autowired
    public Americana(TomatoSauce tomatoSauce, Cheese cheese, ExtraPizzaDough extraPizzaDough, Kebab kebab, Ham ham,
                     ChampignonMushrooms champignonMushrooms, Onion onion) {
        super();
        int numberInMenu = 23;
        String name = "Americana";
        List<Ingredient> ingredients = new ArrayList<>();
        ingredients.add(tomatoSauce);
        ingredients.add(cheese);
        ingredients.add(extraPizzaDough);
        ingredients.add(kebab);
        ingredients.add(ham);
        ingredients.add(champignonMushrooms);
        ingredients.add(onion);
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
