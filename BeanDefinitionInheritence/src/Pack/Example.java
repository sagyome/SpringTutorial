package Pack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Example {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring1.xml");
		Triangle1 triangle = (Triangle1) context.getBean("triangle1");
		triangle.draw();
	}
}