package guru.springframework.sfgdi.services;

public class GreetingServiceImp implements GreetingsService {

    @Override
    public String sayGreeting() {
        return "Goodbye cruel world";
    }
}
