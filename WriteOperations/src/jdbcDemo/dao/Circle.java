package jdbcDemo.dao;

import org.springframework.stereotype.Component;

@Component
public class Circle {
	private int id;
	private String name;
	
	
	public Circle() {
		super();
	}

	public Circle(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Circle [id=" + id + ", name=" + name + "]";
	}

}