package lesson9.prg1;

/**
 * @author Erika
 *
 */
public class MyStringStack {
	private MyStringLinkedList list;

	public MyStringStack() {
		list = new MyStringLinkedList();
	}

	public String pop() throws StackException {
		// implement
		if (list.size() < 1 || list == null)
			throw new StackException("Stack is empty!");

		String popVal = list.get(0);
		list.remove(0);
		return popVal;
	}

	public String peek() throws StackException {
		// implement
		if (list.size() < 1 || list == null)
			throw new StackException("Stack is empty!");
		return list.get(0);
	}

	public void push(String s) {
		// implement
		list.add(s);
	}

	public static void main(String[] args) throws StackException {
		MyStringStack stack = new MyStringStack();
		stack.push("Bob");
		stack.push("Harry");
		stack.push("Alice");
		System.out.println("Popping…" + stack.pop());
		System.out.println("Peeking…." + stack.peek());
		System.out.println("Popping…" + stack.pop());
	}
}
