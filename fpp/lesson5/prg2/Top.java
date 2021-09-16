package lesson5.prg2;

/**
 * @author Erika
 *
 */
public class Top {
	int t = 1;
	Middle mid;
	Middle.Bottom midbot;

//returns the value in the instance vble of Bottom
	int readBottom() {
//implement
		mid = new Middle();

		midbot = mid.new Bottom(); // initializing the inner class of Middle

		return midbot.b;
	}

	class Middle {
		int m = 2;

//returns sum of instance vble in Top and
//instance vble in Bottom
		int addTopAndBottom() {
//implement

			int sum = Top.this.t + Top.this.readBottom();

			return sum;
		}

		class Bottom {
			int b = 3;

//returns the product of the instance vbles
//in all three classes
			int multiplyAllThree() {
//implement
				int multiple = Top.this.t * Middle.this.m * this.b;
				return multiple;
			}
		}
	}

	public static void main(String[] args) {
		Top top = new Top();
		System.out.println(top.readBottom());
		System.out.println(top.mid.addTopAndBottom());
		System.out.println(top.midbot.multiplyAllThree());
	}
}
