package guru.springframework.spring5webapp.controllers;

import guru.springframework.spring5webapp.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    @Qualifier("greetingServiceImpl")
    public GreetingService greetingServiceImpl;

    public String sayHello() {
        //return getGreetingService().sayGreeting();
        return greetingServiceImpl.sayGreeting();
    }
    //Ser 依賴注入
//    public void setGreetingService(GreetingService greetingService) {
//        this.greetingService = greetingService;
//    }

//    public GreetingServiceImpl getGreetingService() {
//        return this.greetingService;
//    }
}
