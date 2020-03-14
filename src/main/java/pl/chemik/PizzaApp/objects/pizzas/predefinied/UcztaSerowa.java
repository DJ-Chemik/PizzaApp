package pl.chemik.PizzaApp.objects.pizzas.predefinied;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.chemik.PizzaApp.objects.ingredients.Ingredient;
import pl.chemik.PizzaApp.objects.ingredients.cheeses.AzureCheese;
import pl.chemik.PizzaApp.objects.ingredients.cheeses.Cheese;
import pl.chemik.PizzaApp.objects.ingredients.cheeses.ExtraCheese;
import pl.chemik.PizzaApp.objects.ingredients.cheeses.Camembert;
import pl.chemik.PizzaApp.objects.ingredients.sauces.TomatoSauce;
import pl.chemik.PizzaApp.objects.pizzas.Pizza;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class UcztaSerowa extends Pizza {

    @Autowired
    public UcztaSerowa(TomatoSauce tomatoSauce, Cheese cheese, AzureCheese azureCheese, Camembert camembert,
                       ExtraCheese extraCheese) {
        super();
        int numberInMenu = 25;
        String name = "Uczta Serowa";
        List<Ingredient> ingredients = new ArrayList<>();
        ingredients.add(tomatoSauce);
        ingredients.add(cheese);
        ingredients.add(azureCheese);
        ingredients.add(camembert);
        ingredients.add(extraCheese);
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
