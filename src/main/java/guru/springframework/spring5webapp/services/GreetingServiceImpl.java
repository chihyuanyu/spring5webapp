package guru.springframework.spring5webapp.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService{

    public static final String HELLO = "Hello 依賴注入(Dependency injection)";


    @Override
    public String sayGreeting() {
        System.out.println("say Greeting");
        return HELLO;
    }

    @Override
    public String getEnglishGreeting() {
        return "Hello - Primary Greeting service)";
    }

    @Override
    public String getSpanishGreeting() {
        return "Service de Salido Primario)";
    }

    @Override
    public String getGermanGreeting() {
        return "Primarer GrunBdienst)";
    }
}
