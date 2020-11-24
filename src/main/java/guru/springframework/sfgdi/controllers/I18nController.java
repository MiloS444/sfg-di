package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingsService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class I18nController {
    private final GreetingsService greetingsService;

    public I18nController(@Qualifier(value = "i18nService") GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }

    public String getText() {
        return greetingsService.sayGreeting();
    }
}
