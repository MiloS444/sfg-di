package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingsService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingsService greetingsService;

    public MyController(GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }

    public String getText() {
        return greetingsService.sayGreeting();
    }
}
