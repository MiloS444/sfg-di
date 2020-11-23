package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext
				= SpringApplication.run(SfgDiApplication.class, args);

		MyController myController = (MyController) configurableApplicationContext.getBean("myController");

		String controllerText = myController.getText();

		System.out.println(controllerText);
	}

}
