package guru.springframework.spring5webapp;

import guru.springframework.spring5webapp.controllers.ConstructionInjectedController;
import guru.springframework.spring5webapp.controllers.DiController;
import guru.springframework.spring5webapp.controllers.GreetingInjectedController;
import guru.springframework.spring5webapp.controllers.PropertyInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring5webappApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Spring5webappApplication.class, args);
		DiController diController = (DiController) ctx.getBean("diController");
		diController.hello();

		System.out.println( ctx.getBean(PropertyInjectedController.class).sayHello() );
		System.out.println( ctx.getBean(GreetingInjectedController.class).sayHello() );
		System.out.println( ctx.getBean(ConstructionInjectedController.class).sayHello() );
	}

}
