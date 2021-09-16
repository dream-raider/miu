package lesson5.prg1;

/**
 * @author Erika
 * 
 *         This class creates a thread safe singleton class
 *
 */
public final class MySingleton {
	public static int count = 0;
	private static MySingleton instance;

	private MySingleton() {
		count++;
	}

	public static MySingleton getInstance() {
		if (instance == null) {
			instance = new MySingleton();
		}
		// checking for thread safe
		synchronized (MySingleton.class) {
			if (instance == null) {
				instance = new MySingleton();
			}
		}
		return instance;

	}

	public static void main(String[] args) {
		MySingleton singleton = MySingleton.getInstance();
		MySingleton singleton2 = MySingleton.getInstance();
		if (singleton.equals(singleton2)) {
			System.out.println("Singleton object1 instance is same to singleton object2 instance");
		} else
			System.out.println("Not equal");
	}

}
