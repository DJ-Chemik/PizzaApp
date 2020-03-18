package pl.chemik.PizzaApp.gui;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;
import pl.chemik.PizzaApp.api.WebServiceApi;

@Route("")
public class VaadinView extends VerticalLayout {

    private WebServiceApi webServiceApi;

    @Autowired
    public void setWebServiceApi(WebServiceApi webServiceApi) {
        this.webServiceApi = webServiceApi;
    }

    public VaadinView() {
        Button button = new Button("Pizza");


        button.addClickListener(buttonClickEvent -> {
            //webServiceApi.getNameOfPizzas();
            add(new Image("https://media.giphy.com/media/gd09Y2Ptu7gsiPVUrv/giphy.gif", "KEVIN"));
        });

        add(button);

    }
}
