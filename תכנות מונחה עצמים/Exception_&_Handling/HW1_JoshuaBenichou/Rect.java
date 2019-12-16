package HW1_JoshuaBenichou;


public class Rect extends Form {
	private int width , height;

	public Rect (String color, int height,int width )  {
		super(color);
		this.width = width;
		this.height = height;
		
	}
	public double  Area() {
		return width * height;
	}
	@Override
	public String toString () {
		return getClass().getSimpleName() + ", "+ getColor() + ", " + width + ", " + height + ", area = " + Area();  
	}
	
}
	