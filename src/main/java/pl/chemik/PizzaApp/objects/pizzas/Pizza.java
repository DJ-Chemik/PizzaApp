package pl.chemik.PizzaApp.objects.pizzas;

import pl.chemik.PizzaApp.objects.ingredients.Ingredient;

import java.util.List;

public class Pizza {

    private int numberInMenu;
    private String name;
    private List<Ingredient> ingredients;
    private int size;
    private int price;


    public Pizza(int numberInMenu, String name, List<Ingredient> ingredients) {
        this.numberInMenu = numberInMenu;
        this.name = name;
        this.ingredients = ingredients;
    }

    public Pizza(int numberInMenu, String name, List<Ingredient> ingredients, int size, int price) {
        this.numberInMenu = numberInMenu;
        this.name = name;
        this.ingredients = ingredients;
        this.size = size;
        this.price = price;
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
