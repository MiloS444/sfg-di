package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingServiceImp implements GreetingsService {

    @Override
    public String sayGreeting() {
        return "Goodbye cruel world - Primary";
    }
}
