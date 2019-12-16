package Q4_1;

public class Point {
	private float x;
	private float y;
	
	public Point(float x, float y) {
		this.x=x;
		this.y=y;
	}
	public float getX() {
		return x;
	}
	public String toString(Point p) {
		return "Point" + p + "= "+ x + "," + y;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj.getClass().equals(this.getClass())) {
			Point other = (Point)obj;
			if(x == other.x && y == other.y)
				return true;
		}
		return false;
	}
}
