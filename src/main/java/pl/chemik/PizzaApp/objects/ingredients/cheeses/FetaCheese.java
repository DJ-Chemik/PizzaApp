package pl.chemik.PizzaApp.objects.ingredients.cheeses;

import org.springframework.stereotype.Component;
import pl.chemik.PizzaApp.objects.ingredients.CategoryOfIngredient;
import pl.chemik.PizzaApp.objects.ingredients.Ingredient;

@Component
public class FetaCheese extends Ingredient {

    public FetaCheese() {
        this.setCategory(CategoryOfIngredient.CHEESE);
    }

    @Override
    public String getClassName(){
        return "Ser Feta";
    }
}
