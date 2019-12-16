package HW1_JoshuaBenichou;


public class Circle extends Form  implements RadiusCheckable{
	private int radius;
	   
	public Circle(String color,int radius)  {
		super(color);
		this.radius = radius;
	}
	
	public double Area() {
		return Math.PI * radius*radius;
	}
	@Override
	public String toString () {
		return getClass().getSimpleName() + ", " + getColor() + ", " +  radius + ", area = " + Area();  
	}
	
	public void radiusCheck() throws RadiusException  {
		if (radius >500 || radius <0 ) {
			throw new RadiusException(radius + " is illegal radius");
		}
		
	
	}
}
