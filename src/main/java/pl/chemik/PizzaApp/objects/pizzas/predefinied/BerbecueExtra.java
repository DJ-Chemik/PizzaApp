package pl.chemik.PizzaApp.objects.pizzas.predefinied;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.chemik.PizzaApp.objects.ingredients.Ingredient;
import pl.chemik.PizzaApp.objects.ingredients.cheeses.Cheese;
import pl.chemik.PizzaApp.objects.ingredients.cheeses.ExtraCheese;
import pl.chemik.PizzaApp.objects.ingredients.meat.Kebab;
import pl.chemik.PizzaApp.objects.ingredients.meat.OxtailHam;
import pl.chemik.PizzaApp.objects.ingredients.sauces.BarbequeSauce;
import pl.chemik.PizzaApp.objects.ingredients.vegetables.ChampignonMushrooms;
import pl.chemik.PizzaApp.objects.ingredients.vegetables.Onion;
import pl.chemik.PizzaApp.objects.pizzas.Pizza;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class BerbecueExtra extends Pizza {

    @Autowired
    public BerbecueExtra(BarbequeSauce barbequeSauce, Cheese cheese, Kebab kebab, OxtailHam oxtailHam, Onion onion,
                         ChampignonMushrooms champignonMushrooms, ExtraCheese extraCheese) {
        super();
        int numberInMenu = 37;
        String name = "Berbecue Extra";
        List<Ingredient> ingredients = new ArrayList<>();
        ingredients.add(barbequeSauce);
        ingredients.add(cheese);
        ingredients.add(kebab);
        ingredients.add(oxtailHam);
        ingredients.add(onion);
        ingredients.add(champignonMushrooms);
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
