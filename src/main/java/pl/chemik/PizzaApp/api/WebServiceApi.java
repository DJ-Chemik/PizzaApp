package pl.chemik.PizzaApp.api;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;
import pl.chemik.PizzaApp.objects.ingredients.Cheese;
import pl.chemik.PizzaApp.objects.ingredients.Ingredient;
import pl.chemik.PizzaApp.objects.pizzas.Pizza;

import java.util.ArrayList;
import java.util.List;

@RestController
public class WebServiceApi {

    private List<Pizza> pizzzas;

    public WebServiceApi() {
        this.pizzzas = new ArrayList<>();

    }


}
