package pl.chemik.PizzaApp.gui;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;
import pl.chemik.PizzaApp.api.WebServiceApi;

@Route("")
public class VaadinView extends HorizontalLayout {

    private WebServiceApi webServiceApi;
    private IngredientsLayout ingredientsLayout;
    private PizzasLayout pizzasLayout;

    @Autowired
    public VaadinView(WebServiceApi webServiceApi) {
        this.webServiceApi=webServiceApi;
        this.ingredientsLayout= new IngredientsLayout();
        this.pizzasLayout = new PizzasLayout(webServiceApi);

        add(pizzasLayout);
        add(ingredientsLayout);
    }
}
