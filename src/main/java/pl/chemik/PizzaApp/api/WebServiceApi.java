package pl.chemik.PizzaApp.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.chemik.PizzaApp.objects.pizzas.Pizza;
import pl.chemik.PizzaApp.objects.pizzas.predefinied.Margherita;

import java.util.ArrayList;
import java.util.List;

@RestController
public class WebServiceApi {

    private List<Pizza> pizzzas;


    @Autowired
    public WebServiceApi() {
        pizzzas = new ArrayList<>();
    }

    @GetMapping
    public String mainWebsite(){
        return "Hello in web app with the best pizzas :)";
    }

    @GetMapping("/name")
    public String getNameOfComponent(){

        return pizzzas.get(0).getIngredients().get(0).getClassName() + " + " + pizzzas.get(0).getIngredients().get(1).getClassName();
        //return "";
    }

}
