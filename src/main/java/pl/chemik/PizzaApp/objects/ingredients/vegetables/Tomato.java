package pl.chemik.PizzaApp.objects.ingredients.vegetables;

import org.springframework.stereotype.Component;
import pl.chemik.PizzaApp.objects.ingredients.CategoryOfIngredient;
import pl.chemik.PizzaApp.objects.ingredients.Ingredient;

@Component
public class Tomato extends Ingredient {

    public Tomato() {
        this.setCategory(CategoryOfIngredient.VEGETABLE);
    }

    @Override
    public String getClassName(){
        return "Pomidor";
    }
}
