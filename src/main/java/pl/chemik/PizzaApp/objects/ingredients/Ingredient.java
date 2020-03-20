package pl.chemik.PizzaApp.objects.ingredients;

public abstract class Ingredient {

    private int price;
    private CategoryOfIngredient category;

    public Ingredient() {
    }

    public Ingredient(int price, CategoryOfIngredient category) {
        this.price = price;
        this.category = category;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public CategoryOfIngredient getCategory() {
        return category;
    }

    public void setCategory(CategoryOfIngredient category) {
        this.category = category;
    }

    public String getClassName() {
        return this.getClass().getSimpleName();
    }
}
