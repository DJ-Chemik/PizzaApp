package pl.chemik.PizzaApp.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.chemik.PizzaApp.objects.pizzas.Pizza;

import java.util.ArrayList;
import java.util.List;

@RestController
public class WebServiceApi {

    private List<Pizza> pizzzas;


    public WebServiceApi() {
        pizzzas = new ArrayList<>();

    }

    @GetMapping
    public String mainWebsite(){
        return "Hello in web app with the best pizzas :)";
    }

    @GetMapping("/name")
    public String getNameOfComponent(){
        return "";
    }

}
