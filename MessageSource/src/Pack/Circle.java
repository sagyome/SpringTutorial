package Pack;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;
@Component
public class Circle implements Shape{

	private Point center;
	@Autowired
	private MessageSource messageSource;

	public MessageSource getMessageSource() {
		return messageSource;
	}
	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}
	public Point getCenter() {
		return center;
	}
	@Resource(name="pointC")
	public void setCenter(Point center) {
		this.center = center;
	}

	@Override
	public void draw() {
		System.out.println(this.messageSource.getMessage("drawing.point", new Object[] {center.toString()},"DeafaultGreeting", null));
		System.out.println("The center is" + center);
		//System.out.println(this.messageSource.getMessage("greeting", null,"DeafaultGreeting", null));
	}

	@PostConstruct
	public void initialize(){
		System.out.println("Init circle");
	}
	@PreDestroy
	public void destroyCircle(){
		System.out.println("Circle destroyed");
	}

}
