package lesson3.prg4;

/**
 * @author Erika
 *
 */
public class Rectangle {
	private final double width;
	private final double height;

	/**
	 * This is the constructor
	 * 
	 * @param width
	 * @param length
	 */
	public Rectangle(double width, double length) {
		this.width = width;
		this.height = length;
	}

	/**
	 * @return the width
	 */
	public double getWidth() {
		return width;
	}

	/**
	 * @return the length
	 */
	public double getLength() {
		return height;
	}

	public double computeArea() {
		return width * height;
	}

}
