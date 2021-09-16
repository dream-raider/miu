package lesson9.prg1;

/**
 * @author Erika
 *
 */
@SuppressWarnings("serial")
public class StackException extends Exception {
	public StackException() {
		super();
	}

	public StackException(String msg) {
		super(msg);
	}

	public StackException(Throwable t) {
		super(t);
	}

}
