package pl.chemik.PizzaApp.gui;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import org.springframework.beans.factory.annotation.Autowired;
import pl.chemik.PizzaApp.gui.controllers.PizzaLayoutController;
import pl.chemik.PizzaApp.objects.pizzas.Pizza;


public class PizzasLayout extends VerticalLayout {

    private PizzaLayoutController controller;
    private Label labelTotalCostForPerson;
    private Grid<Pizza> grid;


    @Autowired
    public PizzasLayout(PizzaLayoutController pizzaLayoutController) {
        this.controller = pizzaLayoutController;

        grid = newGrid();
        add(grid);
        HorizontalLayout horizontalLayout = new HorizontalLayout();

        Label labelPizzasCount = new Label("Ilość różnych połówek pizzy: 0");
        Label labelPeopleCount = new Label("Ilość osób: " + controller.getNumberOfPeople());
        Button buttonPeopleCountMinus = new Button("-");
        Button buttonPeopleCountPlus = new Button("+");
        Button buttonPizzaSize = new Button("Rozmiar pizzy: " + controller.getActualSizeOfPizza() + "cm");
        labelTotalCostForPerson = new Label();
        labelTotalCostForPerson.setVisible(false);

        horizontalLayout.add(labelPizzasCount, labelPeopleCount);
        horizontalLayout.add(buttonPeopleCountMinus, buttonPeopleCountPlus, buttonPizzaSize, labelTotalCostForPerson);
        add(horizontalLayout);

        grid.addSelectionListener(e -> {
            int numberOfSelectedItems = grid.getSelectionModel().getSelectedItems().size();
            if (numberOfSelectedItems != 0) {
                labelTotalCostForPerson.setVisible(true);
                updateResultCost();
            } else {
                labelTotalCostForPerson.setVisible(false);
            }
            labelPizzasCount.setText("Ilość różnych połówek pizzy: " + numberOfSelectedItems);
        });

        buttonPeopleCountPlus.addClickListener(e -> {
            controller.incrementNumberOfPeople();
            updateResultCost();
            labelPeopleCount.setText("Ilość osób: " + controller.getNumberOfPeople());
        });

        buttonPeopleCountMinus.addClickListener(e -> {
            controller.decrementNumberOfPeople();
            updateResultCost();
            labelPeopleCount.setText("Ilość osób: " + controller.getNumberOfPeople());
        });

        buttonPizzaSize.addClickListener(e -> {
            controller.nextSizeOfPizza();
            buttonPizzaSize.setText("Rozmiar pizzy: " + controller.getActualSizeOfPizza() + "cm");
            updateResultCost();
        });

    }

    private void updateResultCost() {
        labelTotalCostForPerson.setText("Koszt na osobę: " + controller.calculateCostForPerson(grid));
    }

    private Grid<Pizza> newGrid() {
        Grid<Pizza> grid = new Grid<>();
        grid.setSelectionMode(Grid.SelectionMode.MULTI);
        grid.setItems(controller.getPizzas());
        addColumnsToGrid(grid);
        return grid;
    }

    public void actualizeGridWithPizzas() {
        grid.setItems(controller.getPizzas());
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
