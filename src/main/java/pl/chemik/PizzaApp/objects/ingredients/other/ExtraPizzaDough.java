package pl.chemik.PizzaApp.objects.ingredients.other;

import org.springframework.stereotype.Component;
import pl.chemik.PizzaApp.objects.ingredients.CategoryOfIngredient;
import pl.chemik.PizzaApp.objects.ingredients.Ingredient;

@Component
public class ExtraPizzaDough extends Ingredient {
    public ExtraPizzaDough() {
        this.setCategory(CategoryOfIngredient.OTHER);
    }

    @Override
    public String getClassName(){
        return "Extra Ciasto";
    }
}
