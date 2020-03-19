package pl.chemik.PizzaApp.objects.collections;

import pl.chemik.PizzaApp.objects.ingredients.Ingredient;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class IngredientsList {

    private ArrayList<Ingredient> ingredients;

    public IngredientsList() {
        ingredients = new ArrayList<>();
    }

    public IngredientsList(ArrayList<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public void add(Ingredient ingredient){
        ingredients.add(ingredient);
    }

    public void addAll(Collection<Ingredient> ingredients){
        ingredients.addAll(ingredients);
    }

    public Ingredient get(int id){
        return ingredients.get(id);
    }

    public void getIngredients(Ingredient ingredient) {
        ingredients.remove(ingredient);
    }

    public void getIngredients(int index) {
        ingredients.remove(index);
    }

    public String toString(){
        String name = "";
        for (Ingredient i: ingredients){
            name.concat(" " + i.getClassName());
        }
        return name;
    }
}
