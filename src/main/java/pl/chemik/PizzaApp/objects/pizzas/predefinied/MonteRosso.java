package pl.chemik.PizzaApp.objects.pizzas.predefinied;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.chemik.PizzaApp.objects.ingredients.Ingredient;
import pl.chemik.PizzaApp.objects.ingredients.cheeses.Cheese;
import pl.chemik.PizzaApp.objects.ingredients.fruits.GreenOlives;
import pl.chemik.PizzaApp.objects.ingredients.meat.DrySmokedPorkSausage;
import pl.chemik.PizzaApp.objects.ingredients.meat.Ham;
import pl.chemik.PizzaApp.objects.ingredients.sauces.TomatoSauce;
import pl.chemik.PizzaApp.objects.ingredients.vegetables.Cucumber;
import pl.chemik.PizzaApp.objects.ingredients.vegetables.Paprica;
import pl.chemik.PizzaApp.objects.ingredients.vegetables.Tomato;
import pl.chemik.PizzaApp.objects.pizzas.Pizza;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class MonteRosso extends Pizza {

    @Autowired
    public MonteRosso(TomatoSauce tomatoSauce, Cheese cheese, Ham ham, DrySmokedPorkSausage drySmokedPorkSausage,
                      Paprica paprica, Tomato tomato, Cucumber cucumber, GreenOlives greenOlives) {
        super();
        int numberInMenu = 39;
        String name = "Monte Rosso";
        List<Ingredient> ingredients = new ArrayList<>();
        ingredients.add(tomatoSauce);
        ingredients.add(cheese);
        ingredients.add(ham);
        ingredients.add(drySmokedPorkSausage);
        ingredients.add(paprica);
        ingredients.add(tomato);
        ingredients.add(cucumber);
        ingredients.add(greenOlives);
        Map<Integer, Float> tableOfCostsAndSizes = new HashMap<>();
        tableOfCostsAndSizes.put(23, 20f);
        tableOfCostsAndSizes.put(30, 32f);
        tableOfCostsAndSizes.put(40, 41f);
        tableOfCostsAndSizes.put(50, 51f);
        this.setNumberInMenu(numberInMenu);
        this.setName(name);
        this.setIngredients(ingredients);
        this.setTableOfCostsAndSizes(tableOfCostsAndSizes);
    }
}
