package pl.chemik.PizzaApp.objects.pizzas;

import pl.chemik.PizzaApp.collections.IngredientsList;
import pl.chemik.PizzaApp.collections.TableOfCostsAndSizes;
import pl.chemik.PizzaApp.objects.ingredients.Ingredient;

import java.util.*;

public class Pizza {

    private int numberInMenu;
    private String name;
    private IngredientsList ingredients;
//    private Map<Integer, Float> tableOfCostsAndSizes;
    private TableOfCostsAndSizes tableOfCostsAndSizes;

    protected Pizza() {
    }

    protected Pizza(int numberInMenu, String name, List<Ingredient> ingredients) {
        this.numberInMenu = numberInMenu;
        this.name = name;
        this.ingredients = new IngredientsList();
        this.ingredients.addAll(ingredients);
    }

    public Pizza(int numberInMenu, String name, List<Ingredient> ingredients, Map<Integer, Float> tableOfCostsAndSizes) {
        this.numberInMenu = numberInMenu;
        this.name = name;
        this.ingredients = new IngredientsList();
        this.ingredients.addAll(ingredients);
        this.tableOfCostsAndSizes = new TableOfCostsAndSizes(tableOfCostsAndSizes);
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
            this.ingredients = new IngredientsList();
            this.ingredients.addAll(ingredients);
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

    public List<Integer> getSizesOfPizza(){
        List<Integer> list = new ArrayList<>(tableOfCostsAndSizes.keySet());
        Collections.sort(list);
        return list;
    }

    public List<Integer> getStandardSizesOfPizza(){
        List<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(30);
        list.add(40);
        list.add(50);
        return list;
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

    public IngredientsList getIngredients() {
        return ingredients;
    }

    public void setIngredients(IngredientsList ingredients) {
        this.ingredients = ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = new IngredientsList();
        this.ingredients.addAll(ingredients);
    }

    public void addIngredient(Ingredient ingredient) {
        this.ingredients.add(ingredient);
    }

    public TableOfCostsAndSizes getTableOfCostsAndSizes() {
        return tableOfCostsAndSizes;
    }

    public void setTableOfCostsAndSizes(Map<Integer, Float> tableOfCostsAndSizes) {
        this.tableOfCostsAndSizes = new TableOfCostsAndSizes(tableOfCostsAndSizes);
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
