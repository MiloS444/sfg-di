package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext
				= SpringApplication.run(SfgDiApplication.class, args);

		PetController petController = configurableApplicationContext.getBean("petController", PetController.class);
		System.out.println("--- The Best Pet is ---");
		System.out.println(petController.whichPetIsTheBest());

		System.out.println("--- Testing Profiles ----");
		I18nController i18nController = (I18nController) configurableApplicationContext.getBean("i18nController");
		System.out.println(i18nController.getText());

		System.out.println("--- Property ----");
		MyController myController = (MyController) configurableApplicationContext.getBean("myController");
		System.out.println(myController.getText());

		System.out.println("--- Property ----");
		PropertyInjectedController propertyInjectedController
				= (PropertyInjectedController) configurableApplicationContext.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("--- Setter ----");
		SetterInjectedController setterInjectedController
				= (SetterInjectedController) configurableApplicationContext.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("--- Constructor ----");
		ConstructorInjectedController constructorInjectedController
				= (ConstructorInjectedController) configurableApplicationContext.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
	}

}
