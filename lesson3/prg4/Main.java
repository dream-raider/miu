package lesson3.prg4;

/**
 * @author Erika
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Circle circle = new Circle(1.2);
		System.out.println("Area of circle is: " + circle.computeArea());

		Triangle triangle = new Triangle(12, 23, 22);

		System.out.println("Area of triangle: " + triangle.computeArea());

		Rectangle rec = new Rectangle(12, 23);
		System.out.println("Area of rectangle is: " + rec.computeArea());
	}

}
