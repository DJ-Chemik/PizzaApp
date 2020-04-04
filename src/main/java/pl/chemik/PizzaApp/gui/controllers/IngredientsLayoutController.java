package pl.chemik.PizzaApp.gui.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;
import pl.chemik.PizzaApp.objects.ingredients.Ingredient;
import pl.chemik.PizzaApp.objects.managers.IngredientsManager;

import java.util.ArrayList;
import java.util.List;

@Service
@SessionScope
public class IngredientsLayoutController {

    private IngredientsManager ingredientsManager;
    private PizzaLayoutController pizzaLayoutController;
    private List<Ingredient> selectedIngredients;

    @Autowired
    public IngredientsLayoutController(IngredientsManager ingredientsManager, PizzaLayoutController pizzaLayoutController) {
        this.ingredientsManager = ingredientsManager;
        this.pizzaLayoutController = pizzaLayoutController;
        this.selectedIngredients = new ArrayList<>();
    }

    public IngredientsManager getIngredientsManager() {
        return ingredientsManager;
    }

    public void clickCheckBoxTrue(Ingredient ingredient){
        selectedIngredients.add(ingredient);
        pizzaLayoutController.displayOnlyPizzasWith(selectedIngredients);

    }

    public void clickCheckBoxFalse(Ingredient ingredient){
        selectedIngredients.remove(ingredient);
        pizzaLayoutController.displayOnlyPizzasWith(selectedIngredients);

    }
}
