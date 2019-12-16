package Q1_1;

public class Person {
	private int id;
	private String name;
	
	public Person (int id,String name) {
		this.name= name;
		this.id = id;
		
	}
	
	public int getId () {
		return id;
	}
	public String getName() {
		return name;
	}
}
