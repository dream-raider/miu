package lesson4.prg5.good;

/**
 * @author Erika
 *
 */
public interface Polygon {
	// returns in an array all sides of the polygon
	// example: For a rectangle, return would be [width, width,
	// length, length]
	public double[] getArrayOfSides();

	// returns the sum of the values in arr
	static double sum(double[] arr) {
		double sum = 0.0;
		for (double s : arr) {
			sum += s;
		}
		return sum;
	}

	// returns the perimeter of the polygon
	default double computePerimeter() {

		double[] sides = getArrayOfSides();
		double perimeter = 0.0;
		for (double s : sides) {
			perimeter += s;
		}
		return perimeter;
	}

}
