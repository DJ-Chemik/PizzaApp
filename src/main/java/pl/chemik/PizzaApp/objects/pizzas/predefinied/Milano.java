package pl.chemik.PizzaApp.objects.pizzas.predefinied;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.chemik.PizzaApp.objects.ingredients.Ingredient;
import pl.chemik.PizzaApp.objects.ingredients.cheeses.Cheese;
import pl.chemik.PizzaApp.objects.ingredients.meat.DrySmokedPorkSausage;
import pl.chemik.PizzaApp.objects.ingredients.meat.Ham;
import pl.chemik.PizzaApp.objects.ingredients.sauces.TomatoSauce;
import pl.chemik.PizzaApp.objects.ingredients.vegetables.Corn;
import pl.chemik.PizzaApp.objects.ingredients.vegetables.Paprica;
import pl.chemik.PizzaApp.objects.ingredients.vegetables.Tomato;
import pl.chemik.PizzaApp.objects.pizzas.Pizza;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class Milano extends Pizza {

    @Autowired
    public Milano(TomatoSauce tomatoSauce, Cheese cheese, Ham ham, DrySmokedPorkSausage drySmokedPorkSausage,
                  Paprica paprica, Corn corn) {
        super();
        int numberInMenu = 13;
        String name = "Milano";
        List<Ingredient> ingredients = new ArrayList<>();
        ingredients.add(tomatoSauce);
        ingredients.add(cheese);
        ingredients.add(ham);
        ingredients.add(drySmokedPorkSausage);
        ingredients.add(paprica);
        ingredients.add(corn);
        Map<Integer, Float> tableOfCostsAndSizes = new HashMap<>();
        tableOfCostsAndSizes.put(23, 18f);
        tableOfCostsAndSizes.put(30, 28f);
        tableOfCostsAndSizes.put(40, 37f);
        tableOfCostsAndSizes.put(50, 47f);
        this.setNumberInMenu(numberInMenu);
        this.setName(name);
        this.setIngredients(ingredients);
        this.setTableOfCostsAndSizes(tableOfCostsAndSizes);
    }
}
