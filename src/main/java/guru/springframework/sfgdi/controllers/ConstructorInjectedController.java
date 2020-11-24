package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingsService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {
    private final GreetingsService greetingsService;

    // Autowired annotation is optional
    // @Qualifier - Odrecuje koji Bean ubacuje prilikom pravljenja objekta
    public ConstructorInjectedController(@Qualifier(value = "constructorGreetingServiceImp") GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }

    public String getGreeting() {
        return greetingsService.sayGreeting();
    }
}
