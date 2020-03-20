package pl.chemik.PizzaApp.objects.ingredients.meat;

import org.springframework.stereotype.Component;
import pl.chemik.PizzaApp.objects.ingredients.CategoryOfIngredient;
import pl.chemik.PizzaApp.objects.ingredients.Ingredient;

@Component
public class OxtailHam extends Ingredient {

    public OxtailHam() {
        this.setCategory(CategoryOfIngredient.MEAT);
    }

    @Override
    public String getClassName(){
        return "Ogonówka";
    }
}
