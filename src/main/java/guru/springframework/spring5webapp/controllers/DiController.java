package guru.springframework.spring5webapp.controllers;

import guru.springframework.spring5webapp.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class DiController {

    private GreetingService greetingService;

    public DiController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello() {
        System.out.println("DI測試: DiController Hello!!");
        return this.greetingService.sayGreeting();
    }
}
