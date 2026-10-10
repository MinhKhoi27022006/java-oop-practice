
public class TestShape {

	    public static void main(String[] args) {

	        Shape s1 = new Rectangle("Red", 4, 5);
	        Shape s2 = new Triangle("Blue", 6, 3);

	        System.out.println(s1.toString());
	        System.out.println("Area: " + s1.getArea());

	        System.out.println();

	        System.out.println(s2.toString());
	        System.out.println("Area: " + s2.getArea());
	    }
	}


