package HW1_JoshuaBenichou;


public class Triangle extends Form {
	private int base, height;
	
	public Triangle (String color, int height, int base)  {
		super(color);
		this.base = base;
		this.height = height;
	}

	public double Area() {
		return ((base*height)/2);	
	}
	@Override
	public String toString () {
		return getClass().getSimpleName() + ", "+ getColor() + ", " + base + ", " + height +  ", area = " + Area();  
	}
	
}
