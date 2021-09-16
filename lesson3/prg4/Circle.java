package lesson3.prg4;

/**
 * @author Erika
 *
 */
public class Circle {

	private final double radius;

	/**
	 * @param radius
	 * 
	 *               This is constructor
	 */
	public Circle(double radius) {
		this.radius = radius;
	}

	/**
	 * @return the radius
	 */
	public double getRadius() {
		return radius;
	}

	public double computeArea() {
		return Math.PI * Math.pow(radius, 2);
	}

}
