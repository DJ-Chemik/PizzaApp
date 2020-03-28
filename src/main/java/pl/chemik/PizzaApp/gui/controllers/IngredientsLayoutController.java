package pl.chemik.PizzaApp.gui.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.chemik.PizzaApp.objects.managers.IngredientsManager;

@Service
public class IngredientsLayoutController {

    private IngredientsManager ingredientsManager;

    @Autowired
    public IngredientsLayoutController(IngredientsManager ingredientsManager) {
        this.ingredientsManager = ingredientsManager;
    }

    public IngredientsManager getIngredientsManager() {
        return ingredientsManager;
    }
}
