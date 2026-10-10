
public class Rectangle extends Shape {

	private int length;
	private int width;

	public Rectangle(String color, int length, int width) {
		super(color);
		this.length = length;
		this.width = width;

	}

	@Override
	public double getArea() {
		return width * length;
	}

	public String toString() {
		return "Rectangle[Width= " + width + ",Length= " +length + " Color " + super.getColor()  + ", Area=" + getArea();
	}

}
