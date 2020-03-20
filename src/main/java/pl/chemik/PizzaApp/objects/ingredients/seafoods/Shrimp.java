package pl.chemik.PizzaApp.objects.ingredients.seafoods;

import org.springframework.stereotype.Component;
import pl.chemik.PizzaApp.objects.ingredients.CategoryOfIngredient;
import pl.chemik.PizzaApp.objects.ingredients.Ingredient;

@Component
public class Shrimp extends Ingredient {

    public Shrimp() {
        this.setCategory(CategoryOfIngredient.SEAFOOD);
    }

    @Override
    public String getClassName(){
        return "Krewetki";
    }
}
