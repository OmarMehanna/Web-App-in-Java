package elsaadawy.omar.programmer;

import org.springframework.boot.SpringApplication; //importing the SpringApplication class
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProgrammerApplication {
	public static void main(String[] args) {
		SpringApplication.run(ProgrammerApplication.class, args);

		WelcomeMessage welcomeMessage = (WelcomeMessage) context.getBean("welcomeMessage");
		System.out.println(welcomeMessage);

	}

}
