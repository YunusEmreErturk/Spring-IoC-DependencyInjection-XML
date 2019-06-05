package springIntro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	// IoC sayesinde appliationContext.xml dosyas� �zerinden t�m i�lemlerim kontrol alt�nda.
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
	    
		ICustomerService customerService = context.getBean("service",ICustomerService.class);
		

		customerService.add();

	}

}
