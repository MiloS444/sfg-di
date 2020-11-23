package guru.springframework.sfgdi.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String getText() {
        System.out.println("Ispisujemo tekst iz funkcije getText()");

        return "Vracamo neki tekst";
    }
}
