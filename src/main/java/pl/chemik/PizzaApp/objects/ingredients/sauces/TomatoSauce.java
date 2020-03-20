package pl.chemik.PizzaApp.objects.ingredients.sauces;

import org.springframework.stereotype.Component;
import pl.chemik.PizzaApp.objects.ingredients.CategoryOfIngredient;
import pl.chemik.PizzaApp.objects.ingredients.Ingredient;

@Component
public class TomatoSauce extends Ingredient {

    public TomatoSauce() {
        this.setCategory(CategoryOfIngredient.SAUCE);
    }

    @Override
    public String getClassName(){
        return "Sos pomidorowy";
    }
}
