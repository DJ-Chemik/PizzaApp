package pl.chemik.PizzaApp.objects.ingredients.fruits;

import org.springframework.stereotype.Component;
import pl.chemik.PizzaApp.objects.ingredients.CategoryOfIngredient;
import pl.chemik.PizzaApp.objects.ingredients.Ingredient;

@Component
public class GreenOlives extends Ingredient {

    public GreenOlives() {
        this.setCategory(CategoryOfIngredient.FRUIT);
    }

    @Override
    public String getClassName(){
        return "Zielone Oliwki";
    }
}
