package pl.chemik.PizzaApp.collections;

import pl.chemik.PizzaApp.objects.ingredients.Ingredient;

import java.util.ArrayList;
import java.util.Collection;

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
        this.ingredients.addAll(ingredients);
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

    public ArrayList<Ingredient> getIngredients() {
        return ingredients;
    }

    public String toString(){
        String name = "";
        StringBuffer stringBuffer = new StringBuffer(name);
        for (Ingredient i: ingredients){
            stringBuffer.append(i.getClassName());
            stringBuffer.append(", ");
        }
        return stringBuffer.toString();
    }
}
