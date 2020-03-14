package pl.chemik.PizzaApp.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pl.chemik.PizzaApp.objects.ingredients.vegetables.Broccoli;
import pl.chemik.PizzaApp.objects.managers.MarioPizzaPlaceManager;
import pl.chemik.PizzaApp.objects.pizzas.Pizza;
import pl.chemik.PizzaApp.objects.pizzas.predefinied.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class WebServiceApi {

    private List<Pizza> pizzzas;

    @Autowired
    public WebServiceApi(MarioPizzaPlaceManager marioPizzaPlaceManager) {
        pizzzas = marioPizzaPlaceManager.getMarioPizzas();
    }

    @GetMapping
    public String mainWebsite(){
        return "Hello in web app with the best pizzas :)";
    }

    @GetMapping("/pizza/all")
    public List<Pizza> getPizzas(){
        return pizzzas;
    }

    @GetMapping("/pizza")
    public List<String> getListOfNamesAndNumberPizzas(){
        List<String> names = new ArrayList<>();
        pizzzas.forEach(pizza -> {
            names.add(pizza.getNumberInMenu() + ". " + pizza.getName());
        });
        return names;
    }

    @GetMapping("/pizza/names")
    public List<String> getNameOfPizzas(){
        List<String> names = new ArrayList<>();
        pizzzas.forEach(pizza -> {names.add(pizza.getName());});
        return names;
    }

    @GetMapping("/pizza/{id}")
    public Pizza getOnePizzaById(@PathVariable("id") int id){
        return pizzzas.stream().filter(pizza -> pizza.getNumberInMenu()==(id)).findFirst().get();
    }

}
