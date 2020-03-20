package pl.chemik.PizzaApp.objects.managers;

import org.springframework.stereotype.Service;
import pl.chemik.PizzaApp.objects.ingredients.vegetables.Broccoli;
import pl.chemik.PizzaApp.objects.pizzas.Pizza;
import pl.chemik.PizzaApp.objects.pizzas.predefinied.*;

import java.util.ArrayList;
import java.util.List;

@Service
public class MarioPizzaPlaceManager {

    private List<Pizza> marioPizzas;
    IngredientsManager ingredientsManager;

    public MarioPizzaPlaceManager(IngredientsManager ingredientsManager, Margherita margherita, Funghi funghi, Vesuvio vesuvio, SalamiPizza salami,
                                  Capriciosa capriciosa, Hawajska hawajska, Toscana toscana,
                                  Tono tono, Pepperone pepperone, Sandra sandra, Pescatore pescatore,
                                  Bolonia bolonia, Milano milano, Vegetariana vegetariana, Rzeznicka rzeznicka,
                                  KebabPizza kebabPizza, LaMafia laMafia, Meksykańska meksykańska, Mario mario, Rimini rimini,
                                  Farmerska farmerska, KebabPizza2 kebabPizza2, Americana americana, FruttiDiMare fruttiDiMare,
                                  UcztaSerowa ucztaSerowa, Brocoli brocoli, Sicilia sicilia, Diabolo diabolo,
                                  Familijna familijna, Diabolo2 diabolo2, Wiejska wiejska, Parma parma, Boss boss,
                                  Carbonara carbonara, Berbecue berbecue, Grecka grecka, BerbecueExtra berbecueExtra,
                                  Gyros gyros, MonteRosso monteRosso, Zarra zarra, Bolognese bolognese, Max max, Pirat pirat,
                                  CamembertPizza camembert, Podhale podhale, Papaj papaj, PiekielnyKurczak piekielnyKurczak,
                                  Killer killer, Indyjska indyjska, OliveNere oliveNere, ChickenMargherita chickenMargherita,
                                  PizzaBamberska pizzaBamberska, ZielonyOgród zielonyOgród, Chłopska chłopska,
                                  Poznańska poznańska) {

        this.ingredientsManager=ingredientsManager;
        marioPizzas = new ArrayList<>();
        marioPizzas.add(margherita);
        marioPizzas.add(funghi);
        marioPizzas.add(vesuvio);
        marioPizzas.add(salami);
        marioPizzas.add(capriciosa);
        marioPizzas.add(hawajska);
        marioPizzas.add(toscana);
        marioPizzas.add(tono);
        marioPizzas.add(pepperone);
        marioPizzas.add(sandra);
        marioPizzas.add(pescatore);
        marioPizzas.add(bolonia);
        marioPizzas.add(milano);
        marioPizzas.add(vegetariana);
        marioPizzas.add(rzeznicka);
        marioPizzas.add(kebabPizza);
        marioPizzas.add(laMafia);
        marioPizzas.add(meksykańska);
        marioPizzas.add(mario);
        marioPizzas.add(rimini);
        marioPizzas.add(farmerska);
        marioPizzas.add(kebabPizza2);
        marioPizzas.add(americana);
        marioPizzas.add(fruttiDiMare);
        marioPizzas.add(ucztaSerowa);
        marioPizzas.add(brocoli);
        marioPizzas.add(sicilia);
        marioPizzas.add(diabolo);
        marioPizzas.add(familijna);
        marioPizzas.add(diabolo2);
        marioPizzas.add(wiejska);
        marioPizzas.add(parma);
        marioPizzas.add(boss);
        marioPizzas.add(carbonara);
        marioPizzas.add(berbecue);
        marioPizzas.add(grecka);
        marioPizzas.add(berbecueExtra);
        marioPizzas.add(gyros);
        marioPizzas.add(monteRosso);
        marioPizzas.add(zarra);
        marioPizzas.add(bolognese);
        marioPizzas.add(max);
        marioPizzas.add(pirat);
        marioPizzas.add(camembert);
        marioPizzas.add(podhale);
        marioPizzas.add(papaj);
        marioPizzas.add(piekielnyKurczak);
        marioPizzas.add(killer);
        marioPizzas.add(indyjska);
        marioPizzas.add(oliveNere);
        marioPizzas.add(chickenMargherita);
        marioPizzas.add(pizzaBamberska);
        marioPizzas.add(zielonyOgród);
        marioPizzas.add(chłopska);
        marioPizzas.add(poznańska);
    }

    public IngredientsManager getIngredients() {
        return ingredientsManager;
    }

    public List<Pizza> getMarioPizzas() {
        return marioPizzas;
    }
}
