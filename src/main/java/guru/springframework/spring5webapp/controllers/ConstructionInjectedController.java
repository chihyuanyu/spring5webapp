package guru.springframework.spring5webapp.controllers;

import guru.springframework.spring5webapp.services.GreetingService;
import guru.springframework.spring5webapp.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructionInjectedController {

    private GreetingService greetingService;

    @Autowired
    public ConstructionInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return  greetingService.sayGreeting();
    }
}
