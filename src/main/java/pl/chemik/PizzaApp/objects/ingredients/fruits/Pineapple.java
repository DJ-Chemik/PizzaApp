package pl.chemik.PizzaApp.objects.ingredients.fruits;

import org.springframework.stereotype.Component;
import pl.chemik.PizzaApp.objects.ingredients.CategoryOfIngredient;
import pl.chemik.PizzaApp.objects.ingredients.Ingredient;

@Component
public class Pineapple extends Ingredient {

    public Pineapple() {
        this.setCategory(CategoryOfIngredient.FRUIT);
    }

    @Override
    public String getClassName(){
        return "Ananas";
    }
}
