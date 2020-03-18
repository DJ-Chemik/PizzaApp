package pl.chemik.PizzaApp;

import com.vaadin.flow.spring.annotation.EnableVaadin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.chemik.PizzaApp.api.WebServiceApi;

import javax.annotation.PostConstruct;

@SpringBootApplication
@EnableVaadin("pl.chemik.PizzaApp.gui")
public class PizzaAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(PizzaAppApplication.class, args);
	}

}
