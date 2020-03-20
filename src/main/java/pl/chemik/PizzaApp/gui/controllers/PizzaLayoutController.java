package pl.chemik.PizzaApp.gui.controllers;

import com.vaadin.flow.component.grid.Grid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import pl.chemik.PizzaApp.api.WebServiceApi;
import pl.chemik.PizzaApp.objects.pizzas.Pizza;

import java.util.List;

@Service
public class PizzaLayoutController {

    private WebServiceApi webServiceApi;
    private List<Integer> listOfSizes;
    private int actualNumberOfSize;
    private int actualSizeOfPizza;
    private int numberOfPeople;
    private List<Pizza> pizzas;


    @Autowired
    public PizzaLayoutController(WebServiceApi webServiceApi) {
        this.webServiceApi = webServiceApi;
        this.pizzas = webServiceApi.getPizzas();
        listOfSizes = webServiceApi.getOnePizzaById(1).getSizesOfPizza();
        actualNumberOfSize = 0;
        numberOfPeople = 1;
    }

    public float calculateCostForPerson(Grid grid){
        float totalCost = 0f;
        for (Object o: grid.getSelectionModel().getSelectedItems()) {
            totalCost+= ((Pizza)o).getTableOfCostsAndSizes().get(getActualSizeOfPizza());
        }
        totalCost/=grid.getSelectionModel().getSelectedItems().size();
        totalCost/=getNumberOfPeople();
        return totalCost;
    }

    public List<Integer> getListOfSizes() {
        return listOfSizes;
    }

    public void setListOfSizes(List<Integer> listOfSizes) {
        this.listOfSizes = listOfSizes;
    }

    public int getActualNumberOfSize() {
        return actualNumberOfSize;
    }

    public void setActualNumberOfSize(int actualNumberOfSize) {
        this.actualNumberOfSize = actualNumberOfSize;
    }

    public int getActualSizeOfPizza() {
        return listOfSizes.get(actualNumberOfSize);
    }

    public void setActualSizeOfPizza(int actualSizeOfPizza) {
        this.actualSizeOfPizza = actualSizeOfPizza;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public void incrementNumberOfPeople() {
        numberOfPeople++;
    }

    public void decrementNumberOfPeople() {
        if (numberOfPeople > 1) {
            numberOfPeople--;
        }
    }

    public void nextSizeOfPizza() {
        if (actualNumberOfSize == listOfSizes.size() - 1) {
            actualNumberOfSize = 0;
        } else {
            actualNumberOfSize++;
        }
    }
}
