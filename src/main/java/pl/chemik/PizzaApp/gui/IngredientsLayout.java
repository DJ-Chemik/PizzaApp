package pl.chemik.PizzaApp.gui;

import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import org.springframework.beans.factory.annotation.Autowired;
import pl.chemik.PizzaApp.gui.controllers.IngredientsLayoutController;
import pl.chemik.PizzaApp.gui.controllers.PizzaLayoutController;
import pl.chemik.PizzaApp.objects.ingredients.Ingredient;
import pl.chemik.PizzaApp.objects.pizzas.Pizza;

import java.util.ArrayList;
import java.util.List;

public class IngredientsLayout extends HorizontalLayout {


    private IngredientsLayoutController controller;
    private List<Checkbox> checkboxesCheeses;
    private List<Checkbox> checkboxesFruits;
    private List<Checkbox> checkboxesMeat;
    private List<Checkbox> checkboxesOthers;
    private List<Checkbox> checkboxesSauces;
    private List<Checkbox> checkboxesSeafoods;
    private List<Checkbox> checkboxesVegetables;
    private PizzasLayout pizzasLayout;

    @Autowired
    public IngredientsLayout(IngredientsLayoutController ingredientsLayoutController, PizzasLayout pizzasLayout) {
        this.controller = ingredientsLayoutController;
        this.pizzasLayout = pizzasLayout;
        checkboxesCheeses = new ArrayList<>();
        checkboxesFruits = new ArrayList<>();
        checkboxesMeat = new ArrayList<>();
        checkboxesOthers = new ArrayList<>();
        checkboxesSauces = new ArrayList<>();
        checkboxesSeafoods = new ArrayList<>();
        checkboxesVegetables = new ArrayList<>();
        initializeLayout();

    }

    private void initializeLayout() {
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
            Checkbox tmp = new Checkbox(i.getClassName());
            tmp.addClickListener(e -> {
                if (tmp.getValue()){
                    controller.clickCheckBoxTrue(i);
                    pizzasLayout.actualizeGridWithPizzas();
                }else{
                    controller.clickCheckBoxFalse(i);
                    pizzasLayout.actualizeGridWithPizzas();
                }

            });
            checkboxesCheeses.add(tmp);
            boxOfcheeses.add(tmp);
        }
        for (Ingredient i : controller.getIngredientsManager().getMeat()) {
            Checkbox tmp = new Checkbox(i.getClassName());
            tmp.addClickListener(e -> {
                if (tmp.getValue()){
                    controller.clickCheckBoxTrue(i);
                    pizzasLayout.actualizeGridWithPizzas();
                }else{
                    controller.clickCheckBoxFalse(i);
                    pizzasLayout.actualizeGridWithPizzas();
                }
            });
            checkboxesMeat.add(tmp);
            boxOfMeat.add(tmp);
        }
        for (Ingredient i : controller.getIngredientsManager().getFruits()) {
            Checkbox tmp = new Checkbox(i.getClassName());
            tmp.addClickListener(e -> {
                if (tmp.getValue()){
                    controller.clickCheckBoxTrue(i);
                    pizzasLayout.actualizeGridWithPizzas();
                }else{
                    controller.clickCheckBoxFalse(i);
                    pizzasLayout.actualizeGridWithPizzas();
                }
            });
            checkboxesFruits.add(tmp);
            boxOfFruits.add(tmp);
        }
        for (Ingredient i : controller.getIngredientsManager().getSauces()) {
            Checkbox tmp = new Checkbox(i.getClassName());
            tmp.addClickListener(e -> {
                if (tmp.getValue()){
                    controller.clickCheckBoxTrue(i);
                    pizzasLayout.actualizeGridWithPizzas();
                }else{
                    controller.clickCheckBoxFalse(i);
                    pizzasLayout.actualizeGridWithPizzas();
                }
            });
            checkboxesSauces.add(tmp);
            boxOfSauces.add(tmp);
        }
        for (Ingredient i : controller.getIngredientsManager().getOthers()) {
            Checkbox tmp = new Checkbox(i.getClassName());
            tmp.addClickListener(e -> {
                if (tmp.getValue()){
                    controller.clickCheckBoxTrue(i);
                    pizzasLayout.actualizeGridWithPizzas();
                }else{
                    controller.clickCheckBoxFalse(i);
                    pizzasLayout.actualizeGridWithPizzas();
                }
            });
            checkboxesOthers.add(tmp);
            boxOfOthers.add(tmp);
        }
        for (Ingredient i : controller.getIngredientsManager().getSeafoods()) {
            Checkbox tmp = new Checkbox(i.getClassName());
            tmp.addClickListener(e -> {
                if (tmp.getValue()){
                    controller.clickCheckBoxTrue(i);
                    pizzasLayout.actualizeGridWithPizzas();
                }else{
                    controller.clickCheckBoxFalse(i);
                    pizzasLayout.actualizeGridWithPizzas();
                }
            });
            checkboxesSeafoods.add(tmp);
            boxOfSeafoods.add(tmp);
        }
        int size = controller.getIngredientsManager().getVegetables().size();
        for (int i = 0; i < size; i++) {
            Ingredient ingredient = controller.getIngredientsManager().getVegetables().get(i);
            Checkbox tmp = new Checkbox(ingredient.getClassName());
            tmp.addClickListener(e -> {
                if (tmp.getValue()){
                    controller.clickCheckBoxTrue(ingredient);
                    pizzasLayout.actualizeGridWithPizzas();
                }else{
                    controller.clickCheckBoxFalse(ingredient);
                    pizzasLayout.actualizeGridWithPizzas();
                }
            });
            if (i <= size / 2) {
                subboxOFVegetables1.add(tmp);
            }
            if (i > size / 2) {
                subboxOFVegetables2.add(tmp);
            }
            checkboxesVegetables.add(tmp);
        }

        add(boxOfcheeses);
        add(boxOfSauces);
        add(boxOfMeat);
        add(boxOfVegetables);
        add(boxOfFruits);
        add(boxOfSeafoods);
        add(boxOfOthers);
    }
}
