package pl.chemik.PizzaApp.objects.pizzas;

import pl.chemik.PizzaApp.objects.ingredients.Ingredient;

import java.util.List;

public abstract class Pizza {

    private String numberInMenu;
    private List<Ingredient> ingredients;
    private int size;
    private int price;

    public Pizza() {
    }

    public Pizza(String numberInMenu, List<Ingredient> ingredients) {
        this.numberInMenu = numberInMenu;
        this.ingredients = ingredients;
    }

    public Pizza(String numberInMenu, List<Ingredient> ingredients, int size, int price) {
        this.numberInMenu = numberInMenu;
        this.ingredients = ingredients;
        this.size = size;
        this.price = price;
    }

    public String getNumberInMenu() {
        return numberInMenu;
    }

    public void setNumberInMenu(String numberInMenu) {
        this.numberInMenu = numberInMenu;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
