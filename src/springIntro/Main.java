package springIntro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	// IoC sayesinde appliationContext.xml dosyasý üzerinden tüm iþlemlerim kontrol altýnda.
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
	    
		ICustomerService customerService = context.getBean("service",ICustomerService.class);
		

		customerService.add();

	}

}
