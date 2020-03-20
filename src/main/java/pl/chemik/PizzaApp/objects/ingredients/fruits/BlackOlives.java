package pl.chemik.PizzaApp.objects.ingredients.fruits;

import org.springframework.stereotype.Component;
import pl.chemik.PizzaApp.objects.ingredients.CategoryOfIngredient;
import pl.chemik.PizzaApp.objects.ingredients.Ingredient;

@Component
public class BlackOlives extends Ingredient {

    public BlackOlives() {
        this.setCategory(CategoryOfIngredient.FRUIT);
    }

    @Override
    public String getClassName(){
        return "Czarne Oliwki";
    }
}
