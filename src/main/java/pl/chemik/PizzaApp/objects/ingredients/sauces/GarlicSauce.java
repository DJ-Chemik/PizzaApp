package pl.chemik.PizzaApp.objects.ingredients.sauces;

import org.springframework.stereotype.Component;
import pl.chemik.PizzaApp.objects.ingredients.CategoryOfIngredient;
import pl.chemik.PizzaApp.objects.ingredients.Ingredient;

@Component
public class GarlicSauce extends Ingredient {

    public GarlicSauce() {
        this.setCategory(CategoryOfIngredient.SAUCE);
    }

    @Override
    public String getClassName(){
        return "Sos czosnkowy";
    }
}
