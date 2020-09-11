package infnetjavaq8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaInfnetMensageria8Application {

	public static void main(String[] args) {
		SpringApplication.run(JavaInfnetMensageria8Application.class, args);
		
		Consumidor cons = new Consumidor();
		cons.getRequest();
	}

}
