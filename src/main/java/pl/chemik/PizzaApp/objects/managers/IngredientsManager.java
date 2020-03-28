package pl.chemik.PizzaApp.objects.managers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.chemik.PizzaApp.objects.ingredients.Ingredient;
import pl.chemik.PizzaApp.objects.ingredients.cheeses.*;
import pl.chemik.PizzaApp.objects.ingredients.fruits.BlackOlives;
import pl.chemik.PizzaApp.objects.ingredients.fruits.GreenOlives;
import pl.chemik.PizzaApp.objects.ingredients.fruits.Pineapple;
import pl.chemik.PizzaApp.objects.ingredients.meat.*;
import pl.chemik.PizzaApp.objects.ingredients.other.ExtraPizzaDough;
import pl.chemik.PizzaApp.objects.ingredients.sauces.*;
import pl.chemik.PizzaApp.objects.ingredients.seafoods.Capers;
import pl.chemik.PizzaApp.objects.ingredients.seafoods.Clams;
import pl.chemik.PizzaApp.objects.ingredients.seafoods.Shrimp;
import pl.chemik.PizzaApp.objects.ingredients.seafoods.Tuna;
import pl.chemik.PizzaApp.objects.ingredients.vegetables.*;

import java.util.ArrayList;
import java.util.List;

@Service
public class IngredientsManager {

    List<Ingredient> cheeses;
    List<Ingredient> fruits;
    List<Ingredient> meat;
    List<Ingredient> others;
    List<Ingredient> sauces;
    List<Ingredient> seafoods;
    List<Ingredient> vegetables;

    List<Ingredient> allIngredients;



    @Autowired
    public IngredientsManager(Cheese cheese, Camembert camembert, AzureCheese azureCheese, ExtraCheese extraCheese,
                              FetaCheese fetaCheese, SmokedCheese smokedCheese, BlackOlives blackOlives,
                              GreenOlives greenOlives, Pineapple pineapple, Bacon bacon, ChickenKebab chickenKebab,
                              DrySmokedPorkSausage drySmokedPorkSausage, Ham ham, Kebab kebab, OxtailHam oxtailHam,
                              Salami salami, Sausage sausage, ExtraPizzaDough extraPizzaDough, BarbequeSauce barbequeSauce,
                              BologneseSauce bologneseSauce, CarrySauce carrySauce, CreamSauce creamSauce,
                              GarlicSauce garlicSauce, GyrosSauce gyrosSauce, Tabasco tabasco, TomatoSauce tomatoSauce,
                              Capers capers, Clams clams, Shrimp shrimp, Tuna tuna, Arugula arugula, Asparagus asparagus,
                              Broccoli broccoli, ChampignonMushrooms champignonMushrooms, Corn corn, Cucumber cucumber,
                              Garlic garlic, GreenPeppercorns greenPeppercorns, JalapenoPepper jalapenoPepper,
                              Onion onion, Paprica paprica, PepperoniPepper pepperoniPepper, PickledCucumber pickledCucumber,
                              RoastedOnion roastedOnion, Rucola rucola, Spinach spinach, Tomato tomato) {
        initalizeLists();
        vegetables.add(arugula);
        vegetables.add(asparagus);
        vegetables.add(broccoli);
        vegetables.add(champignonMushrooms);
        vegetables.add(corn);
        vegetables.add(cucumber);
        vegetables.add(garlic);
        vegetables.add(greenPeppercorns);
        vegetables.add(jalapenoPepper);
        vegetables.add(onion);
        vegetables.add(paprica);
        vegetables.add(pepperoniPepper);
        vegetables.add(pickledCucumber);
        vegetables.add(roastedOnion);
        vegetables.add(rucola);
        vegetables.add(spinach);
        vegetables.add(tomato);

        seafoods.add(capers);
        seafoods.add(tuna);
        seafoods.add(shrimp);
        seafoods.add(clams);

        sauces.add(tomatoSauce);
        sauces.add(tabasco);
        sauces.add(gyrosSauce);
        sauces.add(garlicSauce);
        sauces.add(creamSauce);
        sauces.add(carrySauce);
        sauces.add(bologneseSauce);
        sauces.add(barbequeSauce);

        others.add(extraPizzaDough);

        cheeses.add(cheese);
        cheeses.add(camembert);
        cheeses.add(azureCheese);
        cheeses.add(extraCheese);
        cheeses.add(fetaCheese);
        cheeses.add(smokedCheese);

        fruits.add(blackOlives);
        fruits.add(greenOlives);
        fruits.add(pineapple);

        meat.add(bacon);
        meat.add(chickenKebab);
        meat.add(drySmokedPorkSausage);
        meat.add(ham);
        meat.add(kebab);
        meat.add(oxtailHam);
        meat.add(salami);
        meat.add(sausage);
    }

    public List<Ingredient> getCheeses() {
        return cheeses;
    }

    public List<Ingredient> getFruits() {
        return fruits;
    }

    public List<Ingredient> getMeat() {
        return meat;
    }

    public List<Ingredient> getOthers() {
        return others;
    }

    public List<Ingredient> getSauces() {
        return sauces;
    }

    public List<Ingredient> getSeafoods() {
        return seafoods;
    }

    public List<Ingredient> getVegetables() {
        return vegetables;
    }

    public List<Ingredient> getAllIngredients() {
        return allIngredients;
    }

    private void initalizeLists(){
        cheeses = new ArrayList<>();
        fruits = new ArrayList<>();
        meat = new ArrayList<>();
        others = new ArrayList<>();
        sauces = new ArrayList<>();
        seafoods = new ArrayList<>();
        vegetables = new ArrayList<>();
        allIngredients = new ArrayList<>();

    }
}
