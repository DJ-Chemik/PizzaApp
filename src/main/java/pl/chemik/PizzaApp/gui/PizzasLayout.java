package pl.chemik.PizzaApp.gui;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import pl.chemik.PizzaApp.api.WebServiceApi;
import pl.chemik.PizzaApp.objects.pizzas.Pizza;

import java.util.List;

public class PizzasLayout extends VerticalLayout {

    private WebServiceApi webServiceApi;
    private List<Integer> listOfSizes;
    private int actualNumberOfSize;
    private int numberOfPeople;
    private Label labelTotalCostForPerson;
    private Grid<Pizza> grid;

    public PizzasLayout(WebServiceApi webServiceApi) {
        this.webServiceApi = webServiceApi;
        listOfSizes = webServiceApi.getOnePizzaById(1).getSizesOfPizza();
        actualNumberOfSize = 0;
        numberOfPeople=1;

        grid = addGrid(webServiceApi);
        HorizontalLayout horizontalLayout = new HorizontalLayout();

        Label labelPizzasCount = new Label("Ilość wybranych pizz: 0");
        Label labelPeopleCount = new Label("Ilość osób: " + numberOfPeople);
        Button buttonPeopleCountMinus = new Button("-");
        Button buttonPeopleCountPlus = new Button("+");
        Button buttonPizzaSize = new Button("Rozmiar pizzy: " +  listOfSizes.get(actualNumberOfSize) + "cm");
        labelTotalCostForPerson = new Label();
        labelTotalCostForPerson.setVisible(false);

        horizontalLayout.add(labelPizzasCount, labelPeopleCount);
        horizontalLayout.add(buttonPeopleCountMinus, buttonPeopleCountPlus, buttonPizzaSize, labelTotalCostForPerson);
        add(horizontalLayout);

        grid.addSelectionListener(e -> {
            int numberOfSelectedItems = grid.getSelectionModel().getSelectedItems().size();
            if (numberOfSelectedItems!=0){
                labelTotalCostForPerson.setVisible(true);
                updateResultCost();
            }else{
                labelTotalCostForPerson.setVisible(false);
            }
            labelPizzasCount.setText("Ilość wybranych pizz: " + numberOfSelectedItems);
        });

        buttonPeopleCountPlus.addClickListener(e->{
            numberOfPeople++;
            updateResultCost();
            labelPeopleCount.setText("Ilość osób: " + numberOfPeople);
        });

        buttonPeopleCountMinus.addClickListener(e->{
           numberOfPeople--;
           updateResultCost();
            labelPeopleCount.setText("Ilość osób: " + numberOfPeople);
        });

        buttonPizzaSize.addClickListener(e->{
            incrementSizeOfPizza();
           buttonPizzaSize.setText("Rozmiar pizzy: " + listOfSizes.get(actualNumberOfSize) + "cm");
            updateResultCost();
        });

    }

    private void updateResultCost(){
        labelTotalCostForPerson.setText("Koszt na osobę: " + calculateCostForPerson(grid,
                grid.getSelectionModel().getSelectedItems().size()));
    }

    private float calculateCostForPerson(Grid grid, int numberOfSelectedItems){
        float totalCost = 0f;
        for (Object o: grid.getSelectionModel().getSelectedItems()) {
            totalCost+= ((Pizza)o).getTableOfCostsAndSizes().get(listOfSizes.get(actualNumberOfSize));
        }
        totalCost/=numberOfSelectedItems;
        totalCost/=numberOfPeople;
        return totalCost;
    }

    private void incrementSizeOfPizza(){
        if (actualNumberOfSize ==listOfSizes.size()-1){
            actualNumberOfSize=0;
        }else{
            actualNumberOfSize++;
        }
    }

    private Grid<Pizza> addGrid(WebServiceApi webServiceApi) {
        Grid<Pizza> grid = new Grid<>();
        grid.setSelectionMode(Grid.SelectionMode.MULTI);
        grid.setItems(webServiceApi.getPizzas());
        addColumnsToGrid(grid);
        add(grid);
        return grid;
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
