package lesson3.prg4;

import java.util.Arrays;

/**
 * @author Erika
 *
 */
public class Triangle {
	private double base;
	private double height;
	private double firstSide;
	private double secondSide;
	private double thirdSide;

	/**
	 * @param base
	 * @param height
	 * 
	 *               This is constructor Calculates three sides of triangle if base
	 *               and height is given
	 */
	public Triangle(double base, double height) {
		if (base > height) {
			this.base = base;
			this.height = height;
		} else {
			this.base = height;
			this.height = base;
		}
		firstSide = base;
		secondSide = height;
		thirdSide = Math.sqrt(Math.pow(base, 2) * Math.pow(height, 2));
	}

	/**
	 * @param side1
	 * @param side2
	 * @param side3
	 * 
	 *              This constructor generates base and height by taking 3 different
	 *              sides. Base is assigned to the biggest side among the 3 sides
	 */
	public Triangle(double side1, double side2, double side3) {
		double[] arr = { side1, side2, side3 };
		Arrays.sort(arr);
		firstSide = arr[0];
		secondSide = arr[1];
		thirdSide = arr[2];
		if (firstSide + secondSide < thirdSide) {
			System.out.println("Triangle cannot be generated with given 3 sides");
		}
		base = thirdSide;
		double s = (firstSide + secondSide + thirdSide) / 2;// perimeter of triangle

		// Heron Formula to calculate height from given 3 sides
		height = Math.sqrt(4 * s * (s - firstSide) * (s - secondSide) * (s - thirdSide) / Math.pow(thirdSide, 2));
	}

	/**
	 * Default constructor
	 */
	public Triangle() {
		this.base = 0;
		this.height = 0;
	}

	public double computeArea() {

		return 0.5 * base * height;
	}

}
