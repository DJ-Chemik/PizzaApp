package pl.chemik.PizzaApp.gui;

import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import org.springframework.beans.factory.annotation.Autowired;
import pl.chemik.PizzaApp.gui.controllers.IngredientsLayoutController;
import pl.chemik.PizzaApp.objects.ingredients.Ingredient;

public class IngredientsLayout extends HorizontalLayout {


    private IngredientsLayoutController controller;

    @Autowired
    public IngredientsLayout(IngredientsLayoutController ingredientsLayoutController) {
        this.controller = ingredientsLayoutController;
        initializeBoxes();
    }

    private void initializeBoxes() {
        VerticalLayout boxOfcheeses = new VerticalLayout();
        VerticalLayout boxOfFruits = new VerticalLayout();
        VerticalLayout boxOfMeat = new VerticalLayout();
        VerticalLayout boxOfOthers = new VerticalLayout();
        VerticalLayout boxOfSauces = new VerticalLayout();
        VerticalLayout boxOfSeafoods = new VerticalLayout();
        HorizontalLayout boxOfVegetables = new HorizontalLayout();
        VerticalLayout subboxOFVegetables1 = new VerticalLayout();
        VerticalLayout subboxOFVegetables2 = new VerticalLayout();
        boxOfVegetables.add(subboxOFVegetables1);
        boxOfVegetables.add(subboxOFVegetables2);
        for (Ingredient i : controller.getIngredientsManager().getCheeses()) {
            boxOfcheeses.add(new Checkbox(i.getClassName()));
        }
        for (Ingredient i : controller.getIngredientsManager().getMeat()) {
            boxOfMeat.add(new Checkbox(i.getClassName()));
        }
        for (Ingredient i : controller.getIngredientsManager().getFruits()) {
            boxOfFruits.add(new Checkbox(i.getClassName()));
        }
        for (Ingredient i : controller.getIngredientsManager().getSauces()) {
            boxOfSauces.add(new Checkbox(i.getClassName()));
        }
        for (Ingredient i : controller.getIngredientsManager().getOthers()) {
            boxOfOthers.add(new Checkbox(i.getClassName()));
        }
        for (Ingredient i : controller.getIngredientsManager().getSeafoods()) {
            boxOfSeafoods.add(new Checkbox(i.getClassName()));
        }
        int size = controller.getIngredientsManager().getVegetables().size();
        for (int i = 0; i < size; i++) {
            if (i <= size / 2) {
                subboxOFVegetables1.add(new Checkbox(controller.getIngredientsManager().getVegetables().get(i).getClassName()));
                continue;
            }
            subboxOFVegetables2.add(new Checkbox(controller.getIngredientsManager().getVegetables().get(i).getClassName()));
        }
        add(boxOfcheeses);
        add(boxOfSauces);
        add(boxOfVegetables);
        add(boxOfFruits);
        add(boxOfSeafoods);
        add(boxOfOthers);
    }
}
