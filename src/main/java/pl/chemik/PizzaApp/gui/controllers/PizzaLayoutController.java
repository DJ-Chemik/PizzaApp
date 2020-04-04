package pl.chemik.PizzaApp.gui.controllers;

import com.vaadin.flow.component.grid.Grid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;
import pl.chemik.PizzaApp.api.WebServiceApi;
import pl.chemik.PizzaApp.gui.PizzasLayout;
import pl.chemik.PizzaApp.gui.VaadinView;
import pl.chemik.PizzaApp.objects.ingredients.Ingredient;
import pl.chemik.PizzaApp.objects.pizzas.Pizza;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.ArrayList;
import java.util.List;

@Service
@SessionScope
public class PizzaLayoutController {

    private WebServiceApi webServiceApi;
    private List<Integer> listOfSizes;
    private int actualNumberOfSize;
    private int actualSizeOfPizza;
    private int numberOfPeople;
    private List<Pizza> pizzasToDisplay;
    private List<Pizza> allPizzas;


    @Autowired
    public PizzaLayoutController(WebServiceApi webServiceApi) {
        this.webServiceApi = webServiceApi;
        this.allPizzas = webServiceApi.getPizzas();
        this.pizzasToDisplay = new ArrayList<>(allPizzas);
        listOfSizes = webServiceApi.getOnePizzaById(1).getSizesOfPizza();
        actualNumberOfSize = 0;
        numberOfPeople = 1;
    }

    public void displayOnlyPizzasWith(List<Ingredient> selectedIngredients) {
        pizzasToDisplay.clear();
        pizzasToDisplay.addAll(allPizzas);
        if (!selectedIngredients.isEmpty()) {
            for (Pizza pizza : allPizzas) {
                if (!checkIsPizzaReadyToDisplay(selectedIngredients, pizza)) {
                    pizzasToDisplay.remove(pizza);
                }
            }
        }

    }

    private boolean checkIsPizzaReadyToDisplay(List<Ingredient> selectedIngredients, Pizza pizza) {
        for (Ingredient selectedIngredient : selectedIngredients) {
            if (compareIngredients(pizza.getIngredients().getIngredients(), selectedIngredient) == false) {
                return false;
            }
        }
        return true;
    }

    private boolean compareIngredients(List<Ingredient> ingredientList, Ingredient oneIngredient) {
        for (Ingredient i : ingredientList) {
            if (oneIngredient.equals(i)) {
                return true;
            }
        }
        return false;
    }

    public void resetListOfPizzas() {
        this.pizzasToDisplay.addAll(allPizzas);
    }

    public float calculateCostForPerson(Grid grid) {
        float totalCost = 0f;
        for (Object o : grid.getSelectionModel().getSelectedItems()) {
            totalCost += ((Pizza) o).getTableOfCostsAndSizes().get(getActualSizeOfPizza());
        }
        totalCost /= grid.getSelectionModel().getSelectedItems().size();
        totalCost /= getNumberOfPeople();
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
        return pizzasToDisplay;
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
