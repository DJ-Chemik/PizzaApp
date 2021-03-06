package pl.chemik.PizzaApp.gui;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;
import pl.chemik.PizzaApp.gui.controllers.IngredientsLayoutController;
import pl.chemik.PizzaApp.gui.controllers.PizzaLayoutController;

@Route("")
@SessionScope
public class VaadinView extends VerticalLayout {


    private IngredientsLayout ingredientsLayout;
    private PizzasLayout pizzasLayout;
    private PizzaLayoutController pizzaLayoutController;
    private IngredientsLayoutController ingredientsLayoutController;



    @Autowired
    public VaadinView(PizzaLayoutController pizzaLayoutController, IngredientsLayoutController ingredientsLayoutController) {
        this.pizzasLayout = new PizzasLayout(pizzaLayoutController);
        this.ingredientsLayout = new IngredientsLayout(ingredientsLayoutController, pizzasLayout);

        add(pizzasLayout);
        add(ingredientsLayout);
    }
}
