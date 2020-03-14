package pl.chemik.PizzaApp.objects.pizzas.predefinied;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.chemik.PizzaApp.objects.ingredients.Ingredient;
import pl.chemik.PizzaApp.objects.ingredients.cheeses.Cheese;
import pl.chemik.PizzaApp.objects.ingredients.meat.Bacon;
import pl.chemik.PizzaApp.objects.ingredients.meat.Ham;
import pl.chemik.PizzaApp.objects.ingredients.meat.Kebab;
import pl.chemik.PizzaApp.objects.ingredients.meat.Salami;
import pl.chemik.PizzaApp.objects.ingredients.sauces.Tabasco;
import pl.chemik.PizzaApp.objects.ingredients.sauces.TomatoSauce;
import pl.chemik.PizzaApp.objects.ingredients.vegetables.JalapenoPepper;
import pl.chemik.PizzaApp.objects.pizzas.Pizza;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class Killer extends Pizza {

    @Autowired
    public Killer(TomatoSauce tomatoSauce, Cheese cheese, Ham ham, Salami salami, Kebab kebab, Bacon bacon,
                  JalapenoPepper jalapenoPepper, Tabasco tabasco) {
        super();
        int numberInMenu = 48;
        String name = "Killer";
        List<Ingredient> ingredients = new ArrayList<>();
        ingredients.add(tomatoSauce);
        ingredients.add(cheese);
        ingredients.add(ham);
        ingredients.add(salami);
        ingredients.add(kebab);
        ingredients.add(bacon);
        ingredients.add(jalapenoPepper);
        ingredients.add(tabasco);
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
