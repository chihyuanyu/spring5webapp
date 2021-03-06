package guru.springframework.spring5webapp.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello - I was Injected via the Constructor!";
    }

    @Override
    public String getEnglishGreeting() {
        return null;
    }

    @Override
    public String getSpanishGreeting() {
        return null;
    }

    @Override
    public String getGermanGreeting() {
        return null;
    }
}
