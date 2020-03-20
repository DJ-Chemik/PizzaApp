package pl.chemik.PizzaApp.objects.ingredients.vegetables;

import org.springframework.stereotype.Component;
import pl.chemik.PizzaApp.objects.ingredients.CategoryOfIngredient;
import pl.chemik.PizzaApp.objects.ingredients.Ingredient;

@Component
public class PickledCucumber extends Ingredient {

    public PickledCucumber() {
        this.setCategory(CategoryOfIngredient.VEGETABLE);
    }

    @Override
    public String getClassName(){
        return "Ogórek konserwowy";
    }
}
