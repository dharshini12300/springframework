package org.springframe.corebeans;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


		

public class TestSpringframe {

	public static void main(String[] args) {
		ApplicationContext context =
				new ClassPathXmlApplicationContext("SpringConfig.xml");
		Restaurant restaurantObj = (Restaurant) context.getBean("restaurantBean");
		restaurantObj.greetcustomer();

	}

}
