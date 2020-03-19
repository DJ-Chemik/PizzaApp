package pl.chemik.PizzaApp.gui;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import pl.chemik.PizzaApp.api.WebServiceApi;
import pl.chemik.PizzaApp.objects.pizzas.Pizza;

import java.util.List;

public class PizzasLayout extends VerticalLayout {

    WebServiceApi webServiceApi;

    public PizzasLayout(WebServiceApi webServiceApi) {
        this.webServiceApi=webServiceApi;
        Grid<Pizza> grid = new Grid<>();
        grid.setSelectionMode(Grid.SelectionMode.MULTI);
        grid.setItems(webServiceApi.getPizzas());
        addColumnsToGrid(grid);

        add(grid);

        Label labelPizzasCount = new Label();
        labelPizzasCount.setText("Ilość wybranych pizz: 0");
        add(labelPizzasCount);
        grid.addSelectionListener(e->{
           labelPizzasCount.setText("Ilość wybranych pizz: " +
                   grid.getSelectionModel().getSelectedItems().size());
        });

    }

    private void addColumnsToGrid(Grid<Pizza> grid) {
        Grid.Column<Pizza> idColumn = grid.addColumn(Pizza::getNumberInMenu)
                .setHeader("Numer")
                .setFlexGrow(0)
                .setWidth("75px");
        grid.addColumn(Pizza::getName)
                .setHeader("Nazwa");
    }
}
