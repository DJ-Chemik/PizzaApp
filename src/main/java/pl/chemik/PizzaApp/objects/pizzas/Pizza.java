package pl.chemik.PizzaApp.objects.pizzas;

import pl.chemik.PizzaApp.objects.ingredients.Ingredient;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Pizza {

    private int numberInMenu;
    private String name;
    private List<Ingredient> ingredients;
    private Map<Integer, Float> tableOfCostsAndSizes;


    public Pizza(int numberInMenu, String name, List<Ingredient> ingredients) {
        this.numberInMenu = numberInMenu;
        this.name = name;
        this.ingredients = ingredients;
    }

    public Pizza(int numberInMenu, String name, List<Ingredient> ingredients, Map<Integer, Float> tableOfCostsAndSizes) {
        this.numberInMenu = numberInMenu;
        this.name = name;
        this.ingredients = ingredients;
        this.tableOfCostsAndSizes = tableOfCostsAndSizes;
    }

    /**
     *
     * @param numberInMenu
     * @param name
     * @param ingredients
     * @param costs for 4 sizes of pizza: 23cm, 30cm, 40cm and 50cm
     * @throws WrongCostsOfPizzaSizesException if list of costs size is different than 4;
     */
    public Pizza(int numberInMenu, String name, List<Ingredient> ingredients, List<Float> costs) throws WrongCostsOfPizzaSizesException {
        if (costs.size()!=4){
            throw new WrongCostsOfPizzaSizesException();
        }else{
            this.numberInMenu = numberInMenu;
            this.name = name;
            this.ingredients = ingredients;
            List<Integer> sizes = new ArrayList<>();
            sizes.add(23);
            sizes.add(30);
            sizes.add(40);
            sizes.add(50);
            for (int i = 0; i < sizes.size(); i++) {
                tableOfCostsAndSizes.put(sizes.get(i), costs.get(i));
            }
        }
    }

    public int getNumberInMenu() {
        return numberInMenu;
    }

    public void setNumberInMenu(int numberInMenu) {
        this.numberInMenu = numberInMenu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public void addIngredient(Ingredient ingredient) {
        this.ingredients.add(ingredient);
    }

    public Map<Integer, Float> getTableOfCostsAndSizes() {
        return tableOfCostsAndSizes;
    }

    public void setTableOfCostsAndSizes(Map<Integer, Float> tableOfCostsAndSizes) {
        this.tableOfCostsAndSizes = tableOfCostsAndSizes;
    }

    public void addNewSizeOfPizza(int size, float cost){
        tableOfCostsAndSizes.put(size,cost);
    }

    public boolean deleteSizeOfPizza(int size){
        Float removeElement =  tableOfCostsAndSizes.remove(size);
        if (removeElement!=null){
            return true;
        }else{
            return false;
        }
    }



}
