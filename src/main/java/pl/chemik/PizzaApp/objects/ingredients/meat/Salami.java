package pl.chemik.PizzaApp.objects.ingredients.meat;

import org.springframework.stereotype.Component;
import pl.chemik.PizzaApp.objects.ingredients.CategoryOfIngredient;
import pl.chemik.PizzaApp.objects.ingredients.Ingredient;

@Component
public class Salami extends Ingredient {

    public Salami() {
        this.setCategory(CategoryOfIngredient.MEAT);
    }

    @Override
    public String getClassName(){
        return "Salami";
    }
}
