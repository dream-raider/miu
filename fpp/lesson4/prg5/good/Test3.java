package lesson4.prg5.good;

/**
 * @author Erika
 *
 */
public class Test3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Polygon[] polygons = { new Square(3), new Triangle(4, 5, 6), new Rectangle(3, 4) };
		for (Polygon p : polygons) {
			String output = "For this " + p.getClass().getSimpleName();
			output += "\n Perimeter = " + p.computePerimeter();
			System.out.println(output);
		}
	}

}
