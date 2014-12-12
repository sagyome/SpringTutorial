package Pack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle triangle = (Triangle) context.getBean("triangle-alias");
		triangle.draw();
		Triangle triangle1 = (Triangle) context.getBean("triangle-name");
		triangle1.draw();
	}

}