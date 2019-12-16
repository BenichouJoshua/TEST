package HW1_JoshuaBenichou;


public abstract class Form   implements Comparable<Form>{
	private String color;
	
	public Form(String color)  {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	
	
	public abstract double Area();
	
	
    public int compareTo(Form form) {
        return  (int) (this.Area() - form.Area());
    }
}
