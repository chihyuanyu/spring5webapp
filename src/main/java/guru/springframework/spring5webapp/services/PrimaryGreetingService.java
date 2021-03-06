package guru.springframework.spring5webapp.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"es","default"})
@Primary
public class PrimaryGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello I am Primary Greeting service)";
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
