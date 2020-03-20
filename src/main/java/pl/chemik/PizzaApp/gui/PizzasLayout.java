package pl.chemik.PizzaApp.gui;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import pl.chemik.PizzaApp.api.WebServiceApi;
import pl.chemik.PizzaApp.objects.pizzas.Pizza;

public class PizzasLayout extends VerticalLayout {

    WebServiceApi webServiceApi;

    public PizzasLayout(WebServiceApi webServiceApi) {
        this.webServiceApi = webServiceApi;
        Grid<Pizza> grid = new Grid<>();
        grid.setSelectionMode(Grid.SelectionMode.MULTI);
        grid.setItems(webServiceApi.getPizzas());
        addColumnsToGrid(grid);
        add(grid);

        Label labelPizzasCount = new Label();
        labelPizzasCount.setText("Ilość wybranych pizz: 0");
        add(labelPizzasCount);

        grid.addSelectionListener(e -> {
            labelPizzasCount.setText("Ilość wybranych pizz: " +
                    grid.getSelectionModel().getSelectedItems().size());
        });

    }

    private void addColumnsToGrid(Grid<Pizza> grid) {
        Grid.Column<Pizza> idColumn = grid.addColumn(Pizza::getNumberInMenu)
                .setHeader("Numer")
                .setFlexGrow(0)
                .setWidth("55px");
        grid.addColumn(Pizza::getName)
                .setHeader("Nazwa")
                .setFlexGrow(0)
                .setWidth("10em");
        grid.addColumn(Pizza::getTableOfCostsAndSizes)
                .setHeader("Ceny")
                .setFlexGrow(0)
                .setWidth("30em");
        grid.addColumn(Pizza::getIngredients)
                .setHeader("Składniki")
                .setResizable(true);

    }
}
