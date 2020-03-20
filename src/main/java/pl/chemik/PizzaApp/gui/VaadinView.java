package pl.chemik.PizzaApp.gui;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.chemik.PizzaApp.api.WebServiceApi;
import pl.chemik.PizzaApp.gui.controllers.PizzaLayoutController;

@Route("")
public class VaadinView extends VerticalLayout {


    private IngredientsLayout ingredientsLayout;
    private PizzasLayout pizzasLayout;
    private PizzaLayoutController pizzaLayoutController;



    @Autowired
    public VaadinView(PizzaLayoutController pizzaLayoutController) {
        this.ingredientsLayout = new IngredientsLayout();
        this.pizzasLayout = new PizzasLayout(pizzaLayoutController);

        add(pizzasLayout);
        add(ingredientsLayout);
    }
}
