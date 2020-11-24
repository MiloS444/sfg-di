package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingServiceImp implements GreetingsService {

    @Override
    public String sayGreeting() {
        return "Goodbye cruel world - Setter";
    }
}
